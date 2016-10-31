using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class FichaTecnicaModel
    {
        public string PrimeiraAparicao { get; set; }
        public DateTime DataNascimento { get; set; }
        public int Altura { get; set; }
        public double Peso { get; set; }
        public string Medidas { get; set; }
        public string TipoSanguineo { get; set; }
        public string HabilidadesEspeciais { get; set; }
        public string Gosta { get; set; }
        public string Desgosta { get; set; }
        public string EstiloDeLuta { get; set; }
        public string Origem { get; set; }
        public string FalaVitoria { get; set; }
        public string ssf2NickName { get; set; }
        public string sa3NickName { get; set; }
        public string sf4NickName { get; set; }
        public string sfa3Stage { get; set; }
        public string sf2Stage { get; set; }
        public string GolpesEspeciais { get; set; }

    }
}