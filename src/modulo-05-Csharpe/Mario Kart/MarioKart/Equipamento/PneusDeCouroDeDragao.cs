using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Equipamento
{
    public class PneusDeCouroDeDragao : IEquipamento
    {
        public int Bonus
        {
            get
            {
                return 2;
            }
        }
    }
}
