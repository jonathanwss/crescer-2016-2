using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Transactions;

namespace StreetFighter.Repositorio
{
    public class PersonagemRepositorio : IPersonagemRepositorio
    {
        const string caminhoArquivo = @"C:\Users\santos.jonathan\crescer-2016-2\src\modulo-05-Csharpe\teste.csv";
        //const string caminhoArquivo = @"E:\Nova pasta (2)\teste.csv";
        //const string caminhoArquivoUsuariosCadastrados = @"C:\Users\santos.jonathan\crescer-2016-2\src\modulo-05-Csharpe\cadastro.csv";

        const string caminhoArquivoUsuariosCadastrados = @"E:\Nova pasta (2)\cadastro.csv";
        public void editarPersonagem(Personagem personagem)
        {
            var personagensListaAtualizado = ListarPersonagens().Where(p => p.Id != personagem.Id);
            excluirPersonagem(personagem);
            incluirPersonagem(personagem);
        }

        public void excluirPersonagem(Personagem personagem)
        {

            var personagensLista = ListarPersonagens();

            var personagensSeraoSalvos = personagensLista.Where(p => p.Id != personagem.Id);
            File.Delete(caminhoArquivo);
            File.Create(caminhoArquivo).Close();
            foreach (var persona in personagensSeraoSalvos)
            {
                incluirPersonagem(persona);
            }
        }

        public void incluirPersonagem(Personagem personagem)
        {
            /*
            var arquivoTamanho = new FileInfo(caminhoArquivo).Length;
            var novaLinha = arquivoTamanho != 0 ? Environment.NewLine : "";
            var id = IdNovoPersonagem();
            File.AppendAllText(caminhoArquivo, novaLinha + id + ";" +
                                 personagem.Nome + ";" + personagem.Origem + ";" + personagem.DataNascimento.ToString("dd MMMM yyyy") + ";"+
                                 personagem.GolpesEspeciais + ";" + personagem.Altura.ToString() + ";" + 
                                 personagem.Peso.ToString() + ";"
                               );
            */
            string connectionString = ConfigurationManager.ConnectionStrings["PersonagemConexao"].ConnectionString;

            using (var scope = new TransactionScope(TransactionScopeOption.Required))
            using (var connection = new SqlConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string sql = "";

                    List<SqlParameter> parametros = new List<SqlParameter>();

                    if (personagem.Id > 0)
                    {
                        sql = $"UPDATE PERSONAGEM SET Nome = @param_Nome, DataNascimento = @param_Data, Altura = @param_Altura, Peso = @param_Peso, Origem = @param_Origem, GolpesEspeciais = @param_GolpesEspeciais WHERE Id = @param_id";
                    }
                    else
                    {
                        sql = $"INSERT INTO PERSONAGEM VALUES(@param_Nome, @param_Data, @param_Altura, @param_Peso, @param_Origem, @param_GolpesEspeciais)";
                    }



                    var command = new SqlCommand(sql, connection);
                    command.Parameters.Add(new SqlParameter("param_id", personagem.Id));
                    command.Parameters.Add(new SqlParameter("param_Nome", personagem.Nome));
                    command.Parameters.Add(new SqlParameter("param_Data", personagem.DataNascimento));
                    command.Parameters.Add(new SqlParameter("param_Altura", personagem.Altura));
                    command.Parameters.Add(new SqlParameter("param_Peso", personagem.Peso));
                    command.Parameters.Add(new SqlParameter("param_Origem", personagem.Origem));
                    command.Parameters.Add(new SqlParameter("param_GolpesEspeciais", personagem.GolpesEspeciais));

                    command.ExecuteNonQuery();

                    scope.Complete();
                }
                catch (Exception)
                {

                    throw;
                }
                finally
                {
                    connection.Close();
                }
            }

        }

        public List<Personagem> ListarPersonagens()
        {
            /*
            var personagenListaArquivo = File.ReadAllLines(caminhoArquivo)
                           .Select(line => line.Split(';'))
                           .Select(
                                values =>
                                    new Personagem()
                                    {
                                        Id = int.Parse(values[0]),
                                        Nome = values[1],
                                        Origem = values[2],
                                        DataNascimento = DateTime.Parse(values[3]),
                                        GolpesEspeciais = values[4],
                                        Altura = int.Parse(values[5]),
                                        Peso = decimal.Parse(values[6])
                                    }).ToList();
            return personagenListaArquivo;
            */
            string connectionString = ConfigurationManager.ConnectionStrings["PersonagemConexao"].ConnectionString;
            List<Personagem> listaPersonagens = new List<Personagem>();

            using (var connection = new SqlConnection(connectionString))
            {

                connection.Open();

                string sql = "SELECT * FROM PERSONAGEM";

                var command = new SqlCommand(sql, connection);




                SqlDataReader reader = command.ExecuteReader();



                while (reader.Read())
                {
                    var personagem = new Personagem()
                    {
                        Id = Convert.ToInt32(reader["Id"]),
                        Nome = reader["Nome"].ToString(),
                        DataNascimento = Convert.ToDateTime(reader["DataNascimento"]),
                        Altura = Convert.ToInt32(reader["Altura"]),
                        Peso = Convert.ToDecimal(reader["Peso"]),
                        Origem = reader["Origem"].ToString(),
                        GolpesEspeciais = reader["GolpesEspeciais"].ToString()
                    };

                    listaPersonagens.Add(personagem);
                }
                connection.Close();

            }
            return listaPersonagens;
        }

        private int IdNovoPersonagem()
        {
            var idNovoPersonagem = new FileInfo(caminhoArquivo).Length;
            return (int)idNovoPersonagem;
        }

        public List<Usuario> buscarUsuarios()
        {
            /*
            var usuariosCadastrados = File.ReadAllLines(caminhoArquivoUsuariosCadastrados)
                           .Select(line => line.Split(';'))
                           .Select(
                                values =>
                                    new Usuario()
                                    {
                                        Nome = values[0],
                                        Senha = values[1],
                                    }).ToList();
                                    */

            string connectionString = ConfigurationManager.ConnectionStrings["PersonagemConexao"].ConnectionString;
            List<Usuario> listaUsuarios = new List<Usuario>();

            using (var connection = new SqlConnection(connectionString))
            {

                connection.Open();

                string sql = "SELECT * FROM USUARIO";

                var command = new SqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                while (reader.Read())
                {
                    var usuario = new Usuario()
                    {
                        Nome = reader["Usuario"].ToString(),
                        Senha = reader["Senha"].ToString()

                    };
                    listaUsuarios.Add(usuario);
                }
                return listaUsuarios;

            }


        }
    }
}
