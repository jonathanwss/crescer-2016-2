using Loja.Dominio;
using Loja.Repositorio;
using Loja.Web.Filter;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Loja.Web.Controllers
{
    public class ProdutoController : Controller
    {
        // GET: Produto
        [CWIAutorizador]
        public ActionResult Index()
        {
            IProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
            var listaProdutos = produtoRepositorio.ListaDeProdutos();
            return View(listaProdutos);
        }


        [CWIAutorizador]
        public ActionResult CadastrarProduto()
        {
            return View();
        }


        [CWIAutorizador]
        public ActionResult Cadastrar(Produto produto)
        {
            IProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();

            produtoRepositorio.CadastrarProduto(produto);

            return View("Index", produtoRepositorio.ListaDeProdutos());
        }

        [CWIAutorizador]
        public ActionResult EditarProduto(int id)
        {
            IProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
            var produtos = produtoRepositorio.ListaDeProdutos();
            var produtoDesejado = produtos.Where(prod => prod.Id == id);
            return View("CadastrarProduto", produtoDesejado);
        }

        [CWIAutorizador]
        public ActionResult Editar(Produto produto)
        {
            return null;
        }

    }
}