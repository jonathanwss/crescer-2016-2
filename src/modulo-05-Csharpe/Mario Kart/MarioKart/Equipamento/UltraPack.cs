using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart.Equipamento
{
    public class UltraPack : IEquipamento
    {
        public UltraPack(IEquipamento equipamento)
        {
            this.Equipamento = equipamento;
        }

        protected IEquipamento Equipamento { get; set; }

        public int Bonus
        {
            get
            {
                double bonusParcial = this.Equipamento.Bonus * 1.20;
                /*double bonusParcialSemCasasDecimais =  Math.Truncate(bonusParcial);
                bool precisaAdicionar1AoBonus = bonusParcial > bonusParcialSemCasasDecimais;
                if (precisaAdicionar1AoBonus)
                {
                    return (int)bonusParcialSemCasasDecimais + 1;
                }*/
                double bonusParcialSemCasasDecimais = Math.Ceiling(bonusParcial); 
                return (int)bonusParcialSemCasasDecimais;
            }
        }
    }
}
