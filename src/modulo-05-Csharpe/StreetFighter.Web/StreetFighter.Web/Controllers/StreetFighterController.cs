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

            modelFichaTecnica.PrimeiraAparicao = "Street Fighter II The World Warrior (1991)";
            modelFichaTecnica.DataNascimento = new DateTime(12/02/1966);
            modelFichaTecnica.Altura = 192;
            modelFichaTecnica.Peso = 96;
            modelFichaTecnica.TipoSanguineo = "B";
            modelFichaTecnica.HabilidadesEspeciais = "Caçar, Eletricidade.";
            modelFichaTecnica.Gosta = "Frutas tropicais, Pirarucu, Sua mãe.";
            modelFichaTecnica.Desgosta = "Army ants (espécie de formiga).";
            modelFichaTecnica.EstiloDeLuta = "Luta Selvagem autodidata (Army Ants) / Capoeira.";
            modelFichaTecnica.Origem = "Brasil (lugar de nascença é provável como sendo Tailândia).";
            modelFichaTecnica.FalaVitoria = "'Ver você em ação é uma piada!'.";
            modelFichaTecnica.ssf2NickName = "'A selvagem criança da natureza'.";
            modelFichaTecnica.sa3NickName = "'A animal pessoa amazônica'.";
            modelFichaTecnica.sf4NickName = "'Guerreiro da selva'.";
            modelFichaTecnica.sfa3Stage = "Ramificação do Rio Madeira - pantano, Brasil (ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?).";
            modelFichaTecnica.sf2Stage = "Bacia do rio Amazonas (Brasil).";
            modelFichaTecnica.GolpesEspeciais = "Electric Thunder, Rolling Attack.";
            return View(modelFichaTecnica);
        }
    }
}