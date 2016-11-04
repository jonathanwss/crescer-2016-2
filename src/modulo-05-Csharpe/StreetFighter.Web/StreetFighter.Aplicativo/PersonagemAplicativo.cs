using StreetFighter.Dominio;
using StreetFighter.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Aplicativo
{
    public class PersonagemAplicativo
    {
        private bool ChamouMetodo;
        private readonly IPersonagemRepositorio repositorio;

        public PersonagemAplicativo()
        {
            this.repositorio = new PersonagemRepositorio();
        }

        public PersonagemAplicativo(IPersonagemRepositorio repositorio)
        {
            this.repositorio = repositorio;
        }

        public List<Personagem> ListarPersonagens(string filtro)
        {
            PersonagemRepositorio personagem = new PersonagemRepositorio();
            var listarPersonagem = personagem.ListarPersonagens();
            return listarPersonagem;
        }

        public void Salva(Personagem personagem)
        {
            repositorio.incluirPersonagem(personagem);
        }
    }
}
