﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Equipamento
{
    public class MotorABaseDeLava : IEquipamento
    {
        public int Bonus
        {
            get
            {
                return 3;
            }
        }
    }
}
