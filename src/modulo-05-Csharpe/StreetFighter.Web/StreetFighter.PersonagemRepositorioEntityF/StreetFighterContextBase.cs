using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.PersonagemRepositorioEntityF
{
    public class StreetFighterContextBase : DbContext
    {
        public StreetFighterContextBase() : base("PersonagemConexao")
        {
        }

        public DbSet<Usuario> Usuario { get; set; }

        public DbSet<Personagem> Personagem { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
    }
}
