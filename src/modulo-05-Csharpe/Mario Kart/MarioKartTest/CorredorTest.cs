using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MarioKart;

namespace MarioKartTest
{
    [TestClass]
    public class CorredorTest
    {
        [TestMethod]
        public void CorredorEhCriadoComNomeENivelDeHabilidadeNoob()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Noob);

            Assert.AreEqual("José", corredor.Nome);
            Assert.AreEqual(NivelHabilidadeCorredor.Noob, corredor.NivelHabilidade);
        }

        [TestMethod]
        public void CorredorEhCriadoComNomeENivelDeHabilidadeMediano()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Mediano);

            Assert.AreEqual("José", corredor.Nome);
            Assert.AreEqual(NivelHabilidadeCorredor.Mediano, corredor.NivelHabilidade);
        }

        [TestMethod]
        public void CorredorEhCriadoComNomeENivelDeHabilidadeProfissional()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Profissional);

            Assert.AreEqual("José", corredor.Nome);
            Assert.AreEqual(NivelHabilidadeCorredor.Profissional, corredor.NivelHabilidade);
        }
    }
}
