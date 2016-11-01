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
            modelFichaTecnica.DataNascimento = new DateTime(1996, 2, 12).ToLocalTime();
            modelFichaTecnica.Altura = 192;
            modelFichaTecnica.Peso = 96;
            modelFichaTecnica.Medidas = "B198, C120, Q172";
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

        public ActionResult Sobre()
        {
            var modelFichaTecnica = new FichaTecnicaModel();

            modelFichaTecnica.PrimeiraAparicao = "Hospital Centenario (1998)";
            modelFichaTecnica.DataNascimento = new DateTime(1998, 9, 17).ToLocalTime();
            modelFichaTecnica.Altura = 180;
            modelFichaTecnica.Peso = 82;
            modelFichaTecnica.Medidas = "B198, C120, Q172";
            modelFichaTecnica.TipoSanguineo = "O";
            modelFichaTecnica.HabilidadesEspeciais = "De acordo com os outros 'Sabe fazer coisas no computador'";
            modelFichaTecnica.Gosta = "Just a few things";
            modelFichaTecnica.Desgosta = "Quase tudo";
            modelFichaTecnica.EstiloDeLuta = "Speed Run";
            modelFichaTecnica.Origem = "Brasil (lugar de nascença é provável como São Leo)";
            modelFichaTecnica.FalaVitoria = "HAHA LEGEN... espera um pouquinho ...DARIO!";
            modelFichaTecnica.ssf2NickName = "A selvagem criança da natureza(aham sei)";
            modelFichaTecnica.sa3NickName = "A animal pessoa amazônica(animal talvez)";
            modelFichaTecnica.sf4NickName = "Guerreiro da selva(tão tá né)";
            modelFichaTecnica.sfa3Stage = "Ramificação do Arroio Gauchinho - Brasil (Divisa são leo com NH)";
            modelFichaTecnica.sf2Stage = "Dick do rio dos Sinos (Brasil)";
            modelFichaTecnica.GolpesEspeciais = "unknown(até por ele mesmo)";
            return View(modelFichaTecnica);
        }
    }
}