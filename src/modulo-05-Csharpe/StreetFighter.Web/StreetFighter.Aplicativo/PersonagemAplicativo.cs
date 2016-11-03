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
            Personagem p = new Personagem("Nunes", "Morro da Pedra");
            Personagem p2 = new Personagem("Jose", "Vila dos Toco");

            List<Personagem> a = new List<Personagem>();
            a.Add(p);
            a.Add(p2);
            return a;

        }

        public List<Personagem> Salva(Personagem personagem)
        {
            ChamouMetodo = true;
            throw new NotImplementedException();
        }
    }
}
