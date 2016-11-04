using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Repositorio
{
    public class PersonagemRepositorio : IPersonagemRepositorio
    {
        //const string caminhoArquivo = @"C:\Users\santos.jonathan\personagens.csv";
        const string caminhoArquivo = @"E:\Nova pasta (2)\teste.csv";
        public void editarPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public void excluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public void incluirPersonagem(Personagem personagem)
        {
            /*
            File.AppendAllText(caminhoArquivo, Environment.NewLine + null);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Id.ToString());
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Nome);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Origem);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.DataNascimento.ToString("dd MMMM yyyy"));
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.GolpesEspeciais);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Altura.ToString());
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Peso.ToString());
            */

            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Id.ToString() + ";" +
                                 personagem.Nome + ";" + personagem.Origem + ";" + personagem.DataNascimento.ToString("dd MMMM yyyy") + ";"+
                                 personagem.GolpesEspeciais + ";" + personagem.Altura.ToString() + ";" + 
                                 personagem.Peso.ToString()
                               );
        }

        public List<Personagem> ListarPersonagens()
        {
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
        }
    }
}
