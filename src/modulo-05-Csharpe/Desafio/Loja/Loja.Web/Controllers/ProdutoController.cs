using Loja.Dominio;
using Loja.Repositorio;
using Loja.Web.Filter;
using Loja.Web.Servicos;
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
            var produtoServico = ServicoDeDependencias.MontarProdutoServicos();
            var listaProdutos = produtoServico.ListarProdutos();
            return View(listaProdutos);
        }


        [CWIAutorizador]
        public ActionResult CadastrarProduto()
        {
            ViewBag.Editar = false;
            return View();
        }


        [CWIAutorizador]
        public ActionResult Cadastrar(Produto produto)
        {
            var produtoServico = ServicoDeDependencias.MontarProdutoServicos();

            try
            {
                produtoServico.SalvarProduto(produto);
            }
            catch(RegraDeNegocioException regra)
            {
                ModelState.AddModelError("", regra.Message);
                ViewBag.Editar = true;
                return View("CadastrarProduto", produto);
            }

            

            return View("Index", produtoServico.ListarProdutos());
        }

        [CWIAutorizador]
        public ActionResult EditarProduto(int id)
        {
            var produtoServico = ServicoDeDependencias.MontarProdutoServicos();

            var produto = produtoServico.BuscarProdutoPorId(id);

            ViewBag.Editar = true;

            return View("CadastrarProduto", produto);
        }

        [CWIAutorizador]
        public ActionResult Editar(Produto produto)
        {
            var produtoServico = ServicoDeDependencias.MontarProdutoServicos();

            produtoServico.SalvarProduto(produto);
            return View("Index", produtoServico.ListarProdutos());
        }

    }
}