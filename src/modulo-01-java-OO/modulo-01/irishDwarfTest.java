

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class irishDwarfTest{
  
    @Test
    public void testeMuitaSortePrimeiraPosicao(){
        irishDwarf id = new irishDwarf();
       id.ganharItem(new Item("a",3));
       id.ganharItem(new Item("b",6));
       
       id.muitaSorte();
       
       assertEquals(6003, id.getMochila().getListadeItens().get(0).getQuantidade());
    }
    
    @Test
    public void testeMuitaSorteSengundaPosicao(){
        irishDwarf id = new irishDwarf();
       id.ganharItem(new Item("a",3));
       id.ganharItem(new Item("b",6));
       
       id.muitaSorte();
       
       assertEquals(21006, id.getMochila().getListadeItens().get(1).getQuantidade());
    }
    
    @Test
    public void testeMuitaSorteTerceiraPosicao(){
        irishDwarf id = new irishDwarf();
       id.ganharItem(new Item("a",3));
       id.ganharItem(new Item("b",6));
       id.ganharItem(new Item("b",10));
       
       id.muitaSorte();
       
       assertEquals(55010, id.getMochila().getListadeItens().get(2).getQuantidade());
    }
    
    @Test
    public void testeMuitaSorteQtdItensNegativa(){
        irishDwarf id = new irishDwarf();
       id.ganharItem(new Item("a",-5));
       
       id.muitaSorte();
       
       assertEquals(14995, id.getMochila().getListadeItens().get(0).getQuantidade());
    }
    
    
}
