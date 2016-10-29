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

        [TestMethod]
        public void CriarKartSkyFusionSemEquipamento()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Noob);
            SkyFusion skyFusion = new SkyFusion(corredor);

            Assert.AreEqual(7, skyFusion.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSkyFusionCom2Equipamentos()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Noob);
            SkyFusion skyFusion = new SkyFusion(corredor);
            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            UltraPack ultraPack = new UltraPack(foguete);

            skyFusion.Equipar(foguete);
            skyFusion.Equipar(ultraPack);

            Assert.AreEqual(25, skyFusion.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSkyFusionCom5Equipamentos()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Noob);
            SkyFusion skyFusion = new SkyFusion(corredor);
            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            FogueteDePlutonio foguete2 = new FogueteDePlutonio(3);
            FogueteDePlutonio foguete3 = new FogueteDePlutonio(4);
            FogueteDePlutonio foguete4 = new FogueteDePlutonio();
            UltraPack ultraPack = new UltraPack(foguete);

            skyFusion.Equipar(foguete);
            skyFusion.Equipar(foguete2);
            skyFusion.Equipar(foguete3);
            skyFusion.Equipar(foguete4);
            skyFusion.Equipar(ultraPack);

            Assert.AreEqual(37, skyFusion.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSkyFusionCom3Equipamentos()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Profissional);
            SkyFusion skyFusion = new SkyFusion(corredor);
            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            UltraPack ultraPack = new UltraPack(foguete);
            MotorABaseDeLava motor = new MotorABaseDeLava();

            skyFusion.Equipar(foguete);
            skyFusion.Equipar(ultraPack);
            skyFusion.Equipar(motor);


            Assert.AreEqual(37, skyFusion.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSonarComSkyFusionEquipando()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Profissional);
            Sonar sonar = new Sonar(corredor);
            SkyFusion skyFusion = new SkyFusion(corredor);
            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            UltraPack ultraPack = new UltraPack(foguete);
            MotorABaseDeLava motor = new MotorABaseDeLava();

            skyFusion.Equipar(foguete);
            skyFusion.Equipar(ultraPack);
            skyFusion.Equipar(motor);

            sonar.Equipar(skyFusion);
            
            Assert.AreEqual(49, sonar.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSkyFusionQueContemSkyFusionComSkyFusionQuePossuiOutroSkyFusionDentro()
        {
            Corredor corredor = new Corredor("David", NivelHabilidadeCorredor.Noob);
            SkyFusion skyFusion = new SkyFusion(corredor);
            SkyFusion skyFusion2 = new SkyFusion(corredor);
            SkyFusion skyFusion3 = new SkyFusion(corredor);
            SkyFusion skyFusion4 = new SkyFusion(corredor);

            skyFusion3.Equipar(skyFusion4);
            skyFusion2.Equipar(skyFusion3);
            skyFusion.Equipar(skyFusion2);

            Assert.AreEqual(46, skyFusion.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSkyFusionComSkyFusionEquipando()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Profissional);
            SkyFusion skyFusion = new SkyFusion(corredor);
            SkyFusion skyFusion2 = new SkyFusion(corredor);

            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            UltraPack ultraPack = new UltraPack(foguete);
            MotorABaseDeLava motor = new MotorABaseDeLava();

            skyFusion.Equipar(foguete);
            skyFusion.Equipar(ultraPack);
            skyFusion.Equipar(motor);

            skyFusion2.Equipar(foguete);
            skyFusion2.Equipar(ultraPack);
            skyFusion2.Equipar(motor);
            skyFusion2.Equipar(skyFusion);

            Assert.AreEqual(76, skyFusion2.VelocidadeFinal());
        }

        [TestMethod]
        public void CriarKartSkyFusionComSkyFusionEquipandoESendoEquipadoPorOutroSkyFusion()
        {
            Corredor corredor = new Corredor("Zé", NivelHabilidadeCorredor.Profissional);
            SkyFusion skyFusion = new SkyFusion(corredor);
            SkyFusion skyFusion2 = new SkyFusion(corredor);
            SkyFusion skyFusion3 = new SkyFusion(corredor);

            FogueteDePlutonio foguete = new FogueteDePlutonio(5);
            UltraPack ultraPack = new UltraPack(foguete);
            MotorABaseDeLava motor = new MotorABaseDeLava();

            skyFusion.Equipar(foguete);
            skyFusion.Equipar(ultraPack);
            skyFusion.Equipar(motor);

            skyFusion2.Equipar(foguete);
            skyFusion2.Equipar(ultraPack);
            skyFusion2.Equipar(motor);
            skyFusion2.Equipar(skyFusion);

            skyFusion3.Equipar(foguete);
            skyFusion3.Equipar(ultraPack);
            skyFusion3.Equipar(motor);
            skyFusion3.Equipar(skyFusion2);

            Assert.AreEqual(115, skyFusion3.VelocidadeFinal());
        }
    }
}
