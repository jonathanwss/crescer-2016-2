using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Karts
{
    public class SkyFusion : Kart
    {
        public SkyFusion(Corredor piloto) : base(piloto)
        {
        }

        public override int VelocidadeFinal()
        {
            int bonusPorItems = base.BonusQuantidadeDeEquipamentos();

            int velocidadeDefinitiva = bonusPorItems + BonusNivelPiloto() + base.VelocidadeFinal();

            bool maiorQueDoze = velocidadeDefinitiva > 12;

            if (maiorQueDoze)
            {
                return velocidadeDefinitiva + 5;
            }
            return velocidadeDefinitiva;
        }

        private int BonusNivelPiloto()
        {
            NivelHabilidadeCorredor nivelCorredor = Piloto.NivelHabilidade;

            if (nivelCorredor == NivelHabilidadeCorredor.Noob)
            {
                return 1;
            }else if (nivelCorredor == NivelHabilidadeCorredor.Mediano)
            {
                return 2;
            }else
            {
                return 3;
            }
        }
    }
}
