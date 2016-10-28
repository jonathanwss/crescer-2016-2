using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Karts
{
    public class Dinam : Kart
    {
        public Dinam(Corredor piloto) : base(piloto){ }

        protected override int BonusPorNivelDeHabilidade()
        {
            return base.BonusPorNivelDeHabilidade() * 2;
        }
    }
}
