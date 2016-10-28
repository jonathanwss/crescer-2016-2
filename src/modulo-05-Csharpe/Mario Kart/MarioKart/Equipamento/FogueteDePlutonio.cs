using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Equipamento
{
    public class FogueteDePlutonio : IEquipamento
    {
        public FogueteDePlutonio(int nivel = 2)
        {
            this.Nivel = nivel;
        }

        public int Nivel { get; }

        public int Bonus
        {
            get
            {
                bool nivelForaDoPadrao = this.Nivel < 1 || this.Nivel > 5;
                if (nivelForaDoPadrao)
                {
                    return 2;
                }
                return this.Nivel * 1;
            }
        }
    }
}
