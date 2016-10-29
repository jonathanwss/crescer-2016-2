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

            int velocidadeDefinitiva = bonusPorItems + bonusNivelPiloto() + base.VelocidadeFinal();

            bool maiorQueDoze = velocidadeDefinitiva > 12;

            if (maiorQueDoze)
            {
                return velocidadeDefinitiva + 5;
            }
            return velocidadeDefinitiva;
        }

        private int bonusNivelPiloto()
        {
            NivelHabilidadeCorredor nivelCorredor = Piloto.NivelHabilidade;
            bool ehNoob = nivelCorredor == NivelHabilidadeCorredor.Noob;
            bool ehMediano = nivelCorredor == NivelHabilidadeCorredor.Mediano;

            if (ehNoob)
            {
                return 1;
            }else if (ehMediano)
            {
                return 2;
            }else
            {
                return 3;
            }
        }
    }
}
