using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MarioKart;

namespace MarioKartTest
{
    [TestClass]
    public class CorredorTest
    {
        [TestMethod]
        public void CorredorEhCriadoComNomeENivelDeHabilidade()
        {
            Corredor corredor = new Corredor("José", NivelHabilidadeCorredor.Noob);

            Assert.AreEqual("José", corredor.Nome);
            Assert.AreEqual(NivelHabilidadeCorredor.Noob, corredor.NivelHabilidade);
        }
    }
}
