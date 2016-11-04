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
            File.AppendAllText(caminhoArquivo, Environment.NewLine + null);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Id.ToString());
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Nome);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Origem);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.DataNascimento.ToString("dd MMMM yyyy"));
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.GolpesEspeciais);
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Altura.ToString());
            File.AppendAllText(caminhoArquivo, Environment.NewLine + personagem.Peso.ToString());

        }

        public List<Personagem> ListarPersonagens()
        {
            IList<string> lista = new List<string>();
            lista = File.ReadAllLines(caminhoArquivo);
            foreach (var caracter in lista)
            {
                
            }
            throw new NotImplementedException();
        }
    }
}
