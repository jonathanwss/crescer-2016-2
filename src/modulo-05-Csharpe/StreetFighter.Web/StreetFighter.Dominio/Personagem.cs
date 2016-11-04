using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public class Personagem
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public string Origem { get; set; }
        public DateTime DataNascimento { get; set; }
        public string GolpesEspeciais { get; set; }
        public int Altura { get; set; }
        public decimal Peso { get; set; }

        public Personagem(int id, string nome, string origem)
            : this(nome, origem)
        {
            this.Id = id;
        }

        public Personagem(string nome, string origem)
        {
            this.Nome = nome;
            this.Origem = origem;
        }
    }
}
