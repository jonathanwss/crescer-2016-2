using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class FichaTecnicaModel
    {
        [Required]
        public string Nome { get; set; }
        [Required]
        [DisplayName("Data De Nascimento")]
        public DateTime DataNascimento { get; set; }
        [Required]
        public int Altura { get; set; }
        [Required]
        public decimal Peso { get; set; }
        [Required]
        [DisplayName("Golpes Especiais")]
        public string GolpesEspeciais { get; set; }
        [Required]
        public string Origem { get; set; }
        [Required]
        [DisplayName("Ocultar Personagem")]
        public bool Oculto { get; set; }
    }
}