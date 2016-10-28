using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Karts
{
    public class Light : Kart
    {
        public Light(Corredor piloto) : base(piloto) { }

        protected override int BonusPorNivelDeHabilidade()
        {
            if(Piloto.NivelHabilidade == NivelHabilidadeCorredor.Noob)
            {
                return base.BonusPorNivelDeHabilidade() + 3;
            }else if(Piloto.NivelHabilidade == NivelHabilidadeCorredor.Profissional)
            {
                return base.BonusPorNivelDeHabilidade() - 1;
            }
            return base.BonusPorNivelDeHabilidade();
        }

        
    }
}
