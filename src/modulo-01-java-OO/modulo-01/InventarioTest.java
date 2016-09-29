

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class InventarioTest
{
    @Test
    public void verificarAdicionarItem(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        
        i.adicionarItem(item);
        
        
    }
}
