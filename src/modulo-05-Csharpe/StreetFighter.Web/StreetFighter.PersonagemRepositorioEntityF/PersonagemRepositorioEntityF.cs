using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.PersonagemRepositorioEntityF
{
    public class PersonagemRepositorioEntityF : IPersonagemRepositorio
    {
        public PersonagemRepositorioEntityF() { }

        public List<Usuario> buscarUsuarios()
        {
            
            using (var context = new StreetFighterContextBase())
            {
                var Usuarios = context.Usuario;
                return Usuarios.ToList();
            }
        }

        public void ExcluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public List<Personagem> ListarPersonagens()
        {
            using (var context = new StreetFighterContextBase())
            {
                var listaPersonagens = context.Personagem;
                return listaPersonagens.ToList();
            }
        }

        public void SalvarPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }
    }
}
