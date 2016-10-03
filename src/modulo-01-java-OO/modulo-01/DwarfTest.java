import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    @Test
    public void dwarfNasceCom110Vida() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        assertEquals(110, gimli.getVida(),0);
    }

    @Test
    public void dwarfPerdeVidaUmaVez() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        gimli.perderVida();
        assertEquals(100, gimli.getVida(),0);
    }

    @Test
    public void dwarfPerdeVidaDuasVezes() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(90, gimli.getVida(),0);
    }

    @Test
    public void dwarfPerdeVidaVinteVezes() {
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(0, gimli.getVida(),0);
    }

    @Test
    public void dwarfCriadoInformandoNomeENascimento() {
        Dwarf gimli = new Dwarf("Gimli", new DataTerceiraEra(12, 11, 1900));
        assertEquals("Gimli", gimli.getNome());
        assertEquals(12, gimli.getDataNascimento().getDia());
        assertEquals(11, gimli.getDataNascimento().getMes());
        assertEquals(1900, gimli.getDataNascimento().getAno());
    }

    @Test
    public void dwarfCriadoSemInformarNomeENascimento() {
        Dwarf gimli = new Dwarf();
        assertNull(gimli.getNome());
        assertEquals(1, gimli.getDataNascimento().getDia());
        assertEquals(1, gimli.getDataNascimento().getMes());
        assertEquals(1, gimli.getDataNascimento().getAno());
    }

    @Test
    public void gerarNumeroAnoBissextoVidaEntre80e90() {
        // Arrange
        Dwarf bernardin = new Dwarf("Bernardin", new DataTerceiraEra(01, 01, 2016));
        bernardin.perderVida();
        bernardin.perderVida();
        bernardin.perderVida();
        // Act
        double resultado = bernardin.getNumeroSorte();
        // Assert
        assertEquals(-3333.0, resultado, .0);
    }

    @Test
    public void gerarNumeroAnoNaoBissextoNomeSeixas() {
        // Arrange
        Dwarf seixas = new Dwarf("Seixas", new DataTerceiraEra(01, 01, 2015));
        // Act
        double resultado = seixas.getNumeroSorte();
        // Assert
        assertEquals(33.0, resultado, .0);
    }

    @Test
    public void gerarNumeroAnoNaoBissextoNomeMeireles() {
        // Arrange
        Dwarf seixas = new Dwarf("Meireles", new DataTerceiraEra(01, 01, 2015));
        // Act
        double resultado = seixas.getNumeroSorte();
        // Assert
        assertEquals(33.0, resultado, .0);
    }

    @Test
    public void gerarNumeroSemEntrarNasCondicoes() {
        // Arrange
        Dwarf balin = new Dwarf("Balin", new DataTerceiraEra(1, 1, 2015));
        // Act
        double resultado = balin.getNumeroSorte();
        // Assert
        assertEquals(101.0, resultado, .0);
    }

    @Test
    public void dwarfPerderVidaComNumeroSorteNegativo() {
        // Arrange
        Dwarf dwarf = new Dwarf("Gimli", new DataTerceiraEra(1,1,2000));
        dwarf.perderVida();
        dwarf.perderVida();
        // Act
        dwarf.perderVida();
        // Assert
        assertEquals(2, dwarf.getExperiencia());
        assertEquals(90, dwarf.getVida(), .0);   
    }

    @Test
    public void dwarfPerderVidaComAnoNaoBissextoMeirelesNaoPerde() {
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(2, 3, 2015));
        meireles.perderVida();
        assertEquals(0, meireles.getExperiencia());
        assertEquals(110, meireles.getVida(), .0);
    }

    @Test
    public void dwarfPerderVidaNormal(){
        Dwarf dwarf = new Dwarf("André Nunin", new DataTerceiraEra(2, 3, 2015));
        dwarf.perderVida();
        assertEquals(100, dwarf.getVida(), .0);
        assertEquals(0, dwarf.getExperiencia());
    }
    
    @Test
    public void morteDwarf(){
        Dwarf d = new Dwarf();
        
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        
        boolean dwarfMorreu = d.getStatus() == Status.MORTO;
        
        assertTrue(dwarfMorreu);
    }
    
    @Test 
    public void dwarfNasceVivo(){
        Dwarf d = new Dwarf();
        
        boolean dwarfVivo = d.getStatus() == Status.VIVO;
    }
    
    @Test
    public void dwarfVidaZerada(){
        Dwarf d = new Dwarf();
        
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        d.perderVida();
        
        boolean dwarfVidaZerada = d.getVida() == 0;
        
        assertTrue(dwarfVidaZerada);
    }
    
    @Test
    public void verificarAdicionar1ItemDwarf(){
        Dwarf d = new Dwarf();
        d.ganharItem(new Item("Machado",1));
        
        int numItensMochila = d.getMochila().getListadeItens().size();
        boolean descItem = "Machado".equals(d.getMochila().getListadeItens().get(0).getDescricao());
        
        assertEquals(1, numItensMochila);
        assertTrue(descItem);
    }
    
    @Test
    public void verificarAdicionar5ItemDwarf(){
        Dwarf d = new Dwarf();
        d.ganharItem(new Item("Machado",1));
        d.ganharItem(new Item("Machado",1));
        d.ganharItem(new Item("Machado",1));
        d.ganharItem(new Item("Machado",1));
        d.ganharItem(new Item("Machado",1));
        
        int numItensMochila = d.getMochila().getListadeItens().size();
       
        
        assertEquals(5, numItensMochila);
    }
    
    @Test
    public void verificarPerder1Item(){
        Dwarf d = new Dwarf();
        Item item = new Item("Machado",1);
        d.ganharItem(item);
        
        
        d.perderItem(item);
        int numItensMochila = d.getMochila().getListadeItens().size();
        
        assertEquals(0, numItensMochila);
        
    }
    
    @Test
    public void leprechaunTestarAsorteAcertouTendo1Item(){
        DataTerceiraEra dte = new DataTerceiraEra(16,18,2016);
        Dwarf f = new Dwarf("Arnaldo",dte);
        f.perderVida();
        f.perderVida();
        
        f.ganharItem(new Item("pote de ouro",3));
        
        
        f.tentarSorte();
        int numItens = f.getMochila().getListadeItens().get(0).getQuantidade();
        
        
        assertEquals(1003, numItens);
        
    }
    
    @Test
    public void leprechaunTestarAsorteAcertouTendo3Itens(){
        DataTerceiraEra dte = new DataTerceiraEra(16,18,2016);
        Dwarf f = new Dwarf("Arnaldo",dte);
        f.perderVida();
        f.perderVida();
        
        f.ganharItem(new Item("pote de ouro",3));
        f.ganharItem(new Item("arco iris",5));
        f.ganharItem(new Item("south park",9));
        
        f.tentarSorte();
        int numItens = f.getMochila().getListadeItens().get(0).getQuantidade();
        int numItens2 = f.getMochila().getListadeItens().get(1).getQuantidade();
        int numItens3 = f.getMochila().getListadeItens().get(2).getQuantidade();
        
        assertEquals(1003, numItens);
        assertEquals(1005, numItens2);
        assertEquals(1009, numItens3);
    }
    
    @Test
    public void verificarMaiorItemQuandoLeprechaunTemSorte(){
        DataTerceiraEra dte = new DataTerceiraEra(16,18,2016);
        Dwarf f = new Dwarf("Arnaldo",dte);
        f.perderVida();
        f.perderVida();
        
        f.ganharItem(new Item("pote de ouro",3));
        f.ganharItem(new Item("arco iris",5));
        f.ganharItem(new Item("south park",9));
        
        f.tentarSorte();
        
        Item obj = f.getMochila().itemMaiorQtd();
        
        assertEquals("south park", obj.getDescricao());
        assertEquals(1009, obj.getQuantidade());
    }
}

