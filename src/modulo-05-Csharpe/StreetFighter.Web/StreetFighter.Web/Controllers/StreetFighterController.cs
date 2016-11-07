using StreetFighter.Aplicativo;
using StreetFighter.Dominio;
using StreetFighter.Web.Filter;
using StreetFighter.Web.Models;
using StreetFighter.Web.Services;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.Web.Controllers
{
    public class StreetFighterController : Controller
    {
        public ActionResult Login()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult FazerLogin(string usuario, string senha)
        {
            Usuario usuarioAutenticado = ServicoDeUsuario.BuscarUsuarioAutenticado(
                    usuario, senha);

            if (usuarioAutenticado != null)
            {
                ServicoDeAutenticacao.Autenticar(new UsuarioLogadoModel(
                    usuarioAutenticado.Nome));
                return RedirectToAction("Index");
            }

            return RedirectToAction("Login");
        }
        [CwiAutorizador]
        public ActionResult Index()
        {
            return View();
        }
        [CwiAutorizador]
        public ActionResult FichaTecnica()
        {
            var modelFichaTecnica = new FichaTecnicaModel();

            modelFichaTecnica.Nome = "Blanka";
            modelFichaTecnica.DataNascimento = new DateTime(1996, 2, 12).ToLocalTime();
            modelFichaTecnica.Altura = 192;
            modelFichaTecnica.Peso = 96;
            modelFichaTecnica.Origem = "Brasil (lugar de nascença é provável como sendo Tailândia).";
            modelFichaTecnica.GolpesEspeciais = "Electric Thunder, Rolling Attack.";
            return View(modelFichaTecnica);
        }
        [CwiAutorizador]
        public ActionResult Sobre()
        {
            var modelFichaTecnica = new FichaTecnicaModel();

            modelFichaTecnica.Nome = "Jonathan";
            modelFichaTecnica.DataNascimento = new DateTime(1998, 9, 17).ToLocalTime();
            modelFichaTecnica.Altura = 180;
            modelFichaTecnica.Peso = 82;
            modelFichaTecnica.Origem = "Brasil (lugar de nascença é provável como São Leo)";
            modelFichaTecnica.GolpesEspeciais = "unknown(até por ele mesmo)";
            return View(modelFichaTecnica);
        }
        [CwiAutorizador]
        public ActionResult Cadastro()
        {
            ListaOrigem();
            ViewBag.Editar = false;
            return View();
        }
        [CwiAutorizador]
        public ActionResult VisualizarFicha(int id)
        {
            PersonagemAplicativo personagem = new PersonagemAplicativo();
            var personagensLista = personagem.ListarPersonagens();
            var personagemSelecionado = personagensLista.Where(p => p.Id == id);

            var model = new FichaTecnicaModel();
            model.Nome = personagemSelecionado.First().Nome;
            model.Origem = personagemSelecionado.First().Origem;
            model.GolpesEspeciais = personagemSelecionado.First().GolpesEspeciais;
            model.DataNascimento = personagemSelecionado.First().DataNascimento;
            model.Altura = personagemSelecionado.First().Altura;
            model.Peso = personagemSelecionado.First().Peso;

            return View("FichaCadastrada",model);
        }
        [CwiAutorizador]
        public ActionResult EditarPersonagem(int id)
        {
            ListaOrigem();

            PersonagemAplicativo personagem = new PersonagemAplicativo();
            var personagemEdicao = personagem.ListarPersonagens().Where(persona => persona.Id == id);

            var model = new FichaTecnicaModel();
            model.Id = personagemEdicao.First().Id;
            model.Nome = personagemEdicao.First().Nome;
            model.Origem = personagemEdicao.First().Origem;
            model.GolpesEspeciais = personagemEdicao.First().GolpesEspeciais;
            model.DataNascimento = personagemEdicao.First().DataNascimento;
            model.Altura = personagemEdicao.First().Altura;
            model.Peso = personagemEdicao.First().Peso;

            ViewBag.Editar = true;

            return View("Cadastro", model);

        }
        [CwiAutorizador]
        [ValidateAntiForgeryToken]
        public ActionResult SalvarPersonagemEditado(FichaTecnicaModel model)
        {
            PersonagemAplicativo personagem = new PersonagemAplicativo();
            var personagemEditado = new Personagem(model.Id, model.Nome, model.Origem)
            {
                DataNascimento = model.DataNascimento,
                GolpesEspeciais = model.GolpesEspeciais,
                Altura = model.Altura,
                Peso = model.Peso
            };

            personagem.EditarPersonagem(personagemEditado);
            return RedirectToAction("VisualizarFicha", new { id = model.Id });
        }
        [CwiAutorizador]
        [ValidateAntiForgeryToken]
        public ActionResult FichaCadastrada(FichaTecnicaModel model)
        {
            ListaOrigem();
            ViewBag.Titulo = "Hidden";
            if (ModelState.IsValid)
            {
                PersonagemAplicativo persona = new PersonagemAplicativo();
                var personagem = new Personagem(model.Nome, model.Origem)
                {
                    DataNascimento = model.DataNascimento,
                    GolpesEspeciais = model.GolpesEspeciais,
                    Altura = (int)model.Altura,
                    Peso = (int)model.Peso
                };
                persona.Salva(personagem);
                return View("FichaCadastrada", model);
            }else
            {
                return View("Cadastro");
            }
        }
        [CwiAutorizador]
        public ActionResult ListarPersonagens()
        {
            PersonagemAplicativo personagem = new PersonagemAplicativo();
            var personagensListados = personagem.ListarPersonagens();
            return View(personagem);
        }
        [CwiAutorizador]
        public ActionResult ListarPersonagensAtualizado(int id)
        {
            PersonagemAplicativo personagem = new PersonagemAplicativo();
            var personagensListados = personagem.ListarPersonagens();
            var personagemSerExcluido = personagensListados.Where(p => p.Id == id);
            personagem.ExcluirPersonagem(personagemSerExcluido.First());
            return RedirectToAction("ListarPersonagens");
        }

        private void ListaOrigem()
        {
            ViewBag.ListaPais = new List<SelectListItem>()
            {
                new SelectListItem() { Value = "BR", Text = "Brazil" },
                new SelectListItem() { Value = "AR", Text = "Argentina" },
                new SelectListItem() { Value = "JP", Text = "Japão" }

            };
        }
    }
}