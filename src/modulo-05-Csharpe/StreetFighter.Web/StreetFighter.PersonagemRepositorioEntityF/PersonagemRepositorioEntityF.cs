using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
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
            if(personagem.Id == 0)
            {
                SalvarNovoPersonagem(personagem);
            }else
            {
                SalvarPersonagemEditado(personagem);
            }
            
        }

        private void SalvarNovoPersonagem(Personagem personagem)
        {
            using (var context = new StreetFighterContextBase())
            {
                context.Entry<Personagem>(personagem).State = EntityState.Added;
                context.SaveChanges();
            }
        }

        private void SalvarPersonagemEditado(Personagem personagem)
        {
            using (var context = new StreetFighterContextBase())
            {
                context.Entry(personagem).State = EntityState.Modified;
                context.SaveChanges();
            }
        }
    }
}
