using MarioKart.Equipamento;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart
{
    public abstract class Kart
    {
        public Kart(Corredor piloto)
        {
            this.Piloto = piloto;
            this.Equipamentos = new List<IEquipamento>();
            this.Velocidade = 3;
        }

        protected Corredor Piloto { get; set; }

        protected List<IEquipamento> Equipamentos { get; }

        protected int Velocidade { get; }

        protected void Equipar(IEquipamento equipamento)
        {
            Equipamentos.Add(equipamento);
        }
    }
}
