using StreetFighter.Aplicativo;
using StreetFighter.Dominio;
using StreetFighter.Web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.Web.Controllers
{
    public class StreetFighterController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

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

        public ActionResult Cadastro()
        {
            ListaOrigem();
            return View();
        }

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
                    Altura = model.Altura,
                    Peso = model.Peso
                };
                persona.Salva(personagem);
                return View("FichaCadastrada", model);
            }else
            {
                return View("Cadastro");
            }
        }

        public ActionResult ListarPersonagens()
        {
            PersonagemAplicativo personagem = new PersonagemAplicativo();
            return View(personagem);
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