using System;
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
    }
}
