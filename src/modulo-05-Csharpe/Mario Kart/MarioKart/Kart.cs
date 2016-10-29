﻿using MarioKart.Equipamento;
using MarioKart.Karts;
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
            this.EquipamentoKartSendoKart = new List<Kart>();
        }

        private List<Kart> EquipamentoKartSendoKart { get; set; }

        protected Corredor Piloto { get; set; }

        protected List<IEquipamento> Equipamentos { get; }

        protected int Velocidade { get; }

        public void Equipar(dynamic equipamento)
        {
            if (equipamento is IEquipamento)
            {
                Equipamentos.Add(equipamento);
            }
            if(equipamento is SkyFusion)
            {
                Equipamentos.Add(null);
                EquipamentoKartSendoKart.Add(equipamento);
            }
        }

        public virtual int VelocidadeFinal()
        {

            int VelocidadeFinal = 0;

            VelocidadeFinal = this.Velocidade + GanharBonusPorEquipamento() + BonusPorNivelDeHabilidade();

            if(BonusEquipamentoKartSendoKart() > 0)
            {
                return VelocidadeFinal + BonusEquipamentoKartSendoKart();
            }

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

        protected int BonusQuantidadeDeEquipamentos()
        {
            return this.Equipamentos.Count;
        }

        private int GanharBonusPorEquipamento()
        {
            int BonusEquipamentos = 0;
            foreach(var equipamento in this.Equipamentos)
            {
                if (equipamento != null)
                {
                    BonusEquipamentos += equipamento.Bonus;
                }
            }

            return BonusEquipamentos;
        }
        // Retorna o bonus da velocidade do kart que esta sendo usado como equipamento de um outro kart;
        private int BonusEquipamentoKartSendoKart()
        {
            bool temKartComoEquipamento = this.EquipamentoKartSendoKart.Count > 0;
            var BonusEquipamentoKartSendoKart = 0;
            if (temKartComoEquipamento)
            {
                foreach(Kart kart in this.EquipamentoKartSendoKart)
                {
                    BonusEquipamentoKartSendoKart += kart.VelocidadeFinal();
                }
            }


            return BonusEquipamentoKartSendoKart;
        }

        
    }
}
