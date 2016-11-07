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
            foreach(var persona in personagensSeraoSalvos)
            {
                incluirPersonagem(persona);
            }     
        }

        public void incluirPersonagem(Personagem personagem)
        {
            var arquivoTamanho = new FileInfo(caminhoArquivo).Length;
            var novaLinha = arquivoTamanho != 0 ? Environment.NewLine : "";
            var id = IdNovoPersonagem();
            File.AppendAllText(caminhoArquivo, novaLinha + id + ";" +
                                 personagem.Nome + ";" + personagem.Origem + ";" + personagem.DataNascimento.ToString("dd MMMM yyyy") + ";"+
                                 personagem.GolpesEspeciais + ";" + personagem.Altura.ToString() + ";" + 
                                 personagem.Peso.ToString() + ";"
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

        private int IdNovoPersonagem()
        {
            var idNovoPersonagem = new FileInfo(caminhoArquivo).Length;
            return (int)idNovoPersonagem;
        }
    }
}
