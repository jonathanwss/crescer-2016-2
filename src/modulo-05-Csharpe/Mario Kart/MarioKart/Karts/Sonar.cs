using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Karts
{
    public class Sonar : Kart
    {
        public Sonar(Corredor piloto) : base(piloto) { }

        public override int VelocidadeFinal()
        {
            if (this.Equipamentos.Count >= 1)
            {
                return base.VelocidadeFinal() + 2;
            }
            return base.VelocidadeFinal();
        }
    }   
}
