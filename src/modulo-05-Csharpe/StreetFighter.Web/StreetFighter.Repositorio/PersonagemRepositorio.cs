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
        const string caminhoArquivo = @"C:\Users\santos.jonathan\personagens.csv";
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
            var persona = "id: " + personagem.Id + "; nome: " + personagem.Nome + "; origem: " + personagem.Origem + ";";
            File.AppendAllText(caminhoArquivo, persona);
        }

        public List<Personagem> ListarPersonagens()
        {
            throw new NotImplementedException();
        }
    }
}
