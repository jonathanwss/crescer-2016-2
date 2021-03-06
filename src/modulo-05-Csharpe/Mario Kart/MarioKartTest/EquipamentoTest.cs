﻿using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MarioKart.Equipamento;

namespace MarioKartTest
{
    [TestClass]
    public class EquipamentoTest
    {
        [TestMethod]
        public void BonusFogueteDePlutonioSemInformarNivel()
        {
            FogueteDePlutonio equipamento = new FogueteDePlutonio();
            Assert.AreEqual(2, equipamento.Bonus);
        }

        [TestMethod]
        public void BonusFogueteDePlutonioInformandoNivel()
        {
            FogueteDePlutonio equipamento = new FogueteDePlutonio(3);
            Assert.AreEqual(3, equipamento.Bonus);
        }

        [TestMethod]
        public void BonusFogueteDePlutonioInformandoNivelForaDoPadrao()
        {
            FogueteDePlutonio equipamento = new FogueteDePlutonio(7);
            Assert.AreEqual(2, equipamento.Bonus);
        }

        [TestMethod]
        public void BonusPneusDeCouroDeDragao()
        {
            PneusDeCouroDeDragao equipamento = new PneusDeCouroDeDragao();
            Assert.AreEqual(2, equipamento.Bonus);
        }

        [TestMethod]
        public void BonusMotorABaseDeLava()
        {
            MotorABaseDeLava equipamento = new MotorABaseDeLava();
            Assert.AreEqual(3, equipamento.Bonus);
        }

        [TestMethod]
        public void CriarEquipamentoUltraPackComFogueteDePlutonioNivel5()
        {
            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            UltraPack ultraPack = new UltraPack(foguete);

            Assert.AreEqual(6, ultraPack.Bonus);
        }

        [TestMethod]
        public void CriarEquipamentoUltraPackComFogueteDePlutonioNivel4()
        {
            FogueteDePlutonio foguete = new FogueteDePlutonio(4);
            UltraPack ultraPack = new UltraPack(foguete);

            Assert.AreEqual(5, ultraPack.Bonus);
        }

        [TestMethod]
        public void CriarEquipamentoUltraPackComPneuDeCouroDeDragao()
        {
            PneusDeCouroDeDragao pneu = new PneusDeCouroDeDragao();
            UltraPack ultraPack = new UltraPack(pneu);

            Assert.AreEqual(3, ultraPack.Bonus);
        }

        [TestMethod]
        public void CriarEquipamentoUltraPackComUltrapackComPneuDeCouroDentro()
        {
            PneusDeCouroDeDragao pneu = new PneusDeCouroDeDragao();
            UltraPack ultraPack = new UltraPack(pneu);
            UltraPack novoUltraPack = new UltraPack(ultraPack);

            Assert.AreEqual(4, novoUltraPack.Bonus);
        }

        [TestMethod]
        public void CriarEquipamentoUltraPackComUltrapackComUltraPackDentro()
        {
            PneusDeCouroDeDragao pneu = new PneusDeCouroDeDragao();
            UltraPack ultraPack = new UltraPack(pneu);
            UltraPack novoUltraPack = new UltraPack(ultraPack);
            UltraPack ultraPackTeste = new UltraPack(novoUltraPack);

            Assert.AreEqual(5, ultraPackTeste.Bonus);
        }
    }
}
