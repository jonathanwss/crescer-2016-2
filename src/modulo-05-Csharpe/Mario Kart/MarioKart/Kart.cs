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

        public void Equipar(IEquipamento equipamento)
        {
            Equipamentos.Add(equipamento);
        }

        public virtual int VelocidadeFinal()
        {
            int VelocidadeFinal = 0;
         
            VelocidadeFinal = this.Velocidade + GanharBonusPorEquipamento() + BonusPorNivelDeHabilidade();

            return VelocidadeFinal;
        }

        protected virtual int BonusPorNivelDeHabilidade()
        {
            
            if(this.Piloto.NivelHabilidade == NivelHabilidadeCorredor.Noob)
            {
                return  3;
            }else if (this.Piloto.NivelHabilidade == NivelHabilidadeCorredor.Mediano)
            {
                return  5;
            }else
            {
                return 6 + BonusQuantidadeDeEquipamentos();
            }
        }

        private int BonusQuantidadeDeEquipamentos()
        {
            return this.Equipamentos.Count;
        }

        private int GanharBonusPorEquipamento()
        {
            int BonusEquipamentos = 0;
            foreach(var equipamento in this.Equipamentos)
            {
                BonusEquipamentos += equipamento.Bonus;
            }

            return BonusEquipamentos;
        }
    }
}
