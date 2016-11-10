using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Loja.Dominio;
using Loja.Tests.Mocks;

namespace Loja.Tests
{
    [TestClass]
    public class ProdutoServicoTest
    {
        [TestMethod]
        public void RetornarUmProdutoComSucesso()
        {
            IProdutoRepositorio repositorio = new ProdutoRepositorioMock();

            var produtoNaLista = repositorio.ListaDeProdutos();

            Assert.IsNotNull(produtoNaLista); 
        }
    }
}
