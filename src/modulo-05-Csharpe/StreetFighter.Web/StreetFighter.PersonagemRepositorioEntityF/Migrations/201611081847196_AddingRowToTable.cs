namespace StreetFighter.PersonagemRepositorioEntityF.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class AddingRowToTable : DbMigration
    {
        public override void Up()
        {
            RenameTable(name: "dbo.Personagems", newName: "Personagem");
            RenameTable(name: "dbo.Usuarios", newName: "Usuario");
        }
        
        public override void Down()
        {
            RenameTable(name: "dbo.Usuario", newName: "Usuarios");
            RenameTable(name: "dbo.Personagem", newName: "Personagems");
        }
    }
}
