using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart
{
    public class Corredor
    {
        public Corredor(string nome, NivelHabilidadeCorredor nivel)
        {
            this.Nome = nome;
            this.NivelHabilidade = nivel;
        }

        public string Nome { get; }

        public NivelHabilidadeCorredor NivelHabilidade { get; }
    }
}
