using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MarioKart;
using MarioKart.Karts;
using MarioKart.Equipamento;

namespace MarioKartTest
{
    [TestClass]
    public class KartTest
    {
        [TestMethod]
        public void CriarKartSonarComUmEquipamento()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Mediano);
            Sonar kart = new Sonar(corredor);
            PneusDeCouroDeDragao equipamento = new PneusDeCouroDeDragao();
            kart.Equipar(equipamento);
            Assert.AreEqual(12, kart.VelocidadeFinal()); 
        }

        [TestMethod]
        public void CriarKartSonarComDoisEquipamentosDiferentesCorredorProfissional()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Profissional);
            Sonar kart = new Sonar(corredor);
            PneusDeCouroDeDragao pneus = new PneusDeCouroDeDragao();
            MotorABaseDeLava motor = new MotorABaseDeLava();
            kart.Equipar(pneus);
            kart.Equipar(motor);
            Assert.AreEqual(18, kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSonarSemNenhumEquipamentoCorredorNoob()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Noob);
            Sonar kart = new Sonar(corredor);
            Assert.AreEqual(6, kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartLightComPilotoMedianoSemNehumEquipamento()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Mediano);
            Light kart = new Light(corredor);
            Assert.AreEqual(8 ,kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartLightComPilotoMedianoNoobCom2Equipamentos()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Noob);
            Light kart = new Light(corredor);
            PneusDeCouroDeDragao pneus = new PneusDeCouroDeDragao();
            MotorABaseDeLava motor = new MotorABaseDeLava();
            kart.Equipar(pneus);
            kart.Equipar(motor);
            Assert.AreEqual(14, kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartDinamComPilotoProfissionarSemEquipamentos()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Profissional);
            Dinam kart = new Dinam(corredor);

            Assert.AreEqual(15, kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartDinamComPilotoProfissionarCom2Equipamentos()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Profissional);
            Dinam kart = new Dinam(corredor);
            PneusDeCouroDeDragao pneus = new PneusDeCouroDeDragao();
            MotorABaseDeLava motor = new MotorABaseDeLava();
            kart.Equipar(pneus);
            kart.Equipar(motor);
            Assert.AreEqual(24, kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartDinamComPilotoNoobCom2Equipamentos()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Noob);
            Dinam kart = new Dinam(corredor);
            PneusDeCouroDeDragao pneus = new PneusDeCouroDeDragao();
            MotorABaseDeLava motor = new MotorABaseDeLava();
            kart.Equipar(pneus);
            kart.Equipar(motor);
            Assert.AreEqual(14, kart.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartDinamComFogueteDePlutonioComoEquipamento()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Noob);
            Dinam kart = new Dinam(corredor);
            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            kart.Equipar(foguete);

            Assert.AreEqual(14, kart.VelocidadeFinal());
        }
    }
}
