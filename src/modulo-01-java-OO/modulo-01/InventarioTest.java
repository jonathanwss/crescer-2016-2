
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void verificarAdicionar1Item(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);

        i.adicionarItem(item);
        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(1, tamanhoInventario);
    }

    @Test
    public void verificarRemover1Item(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("n",1);
        i.adicionarItem(item);
        i.adicionarItem(item2);

        i.removerItem(item);

        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(1, tamanhoInventario);
    }

    @Test
    public void verificarRemover1ItemEspecifico(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("n",1);
        i.adicionarItem(item);
        i.adicionarItem(item2);

        i.removerItem(item);

        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(1, tamanhoInventario);
        assertEquals("n", i.getListadeItens().get(0).getDescricao());
    }

    @Test
    public void verificarRemover1ItemEspecificoEntre10ItensDiferentes(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("n",1);
        Item item3 = new Item("m",1);
        Item item4 = new Item("ma",12);
        Item item5 = new Item("m",1);
        Item item6 = new Item("ma",12);
        Item item7 = new Item("m",1);
        Item item8 = new Item("ma",12);
        Item item9 = new Item("m",1);
        Item item10 = new Item("ma",12);

        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);
        i.adicionarItem(item4);
        i.adicionarItem(item5);
        i.adicionarItem(item6);
        i.adicionarItem(item7);
        i.adicionarItem(item8);
        i.adicionarItem(item9);
        i.adicionarItem(item10);
        i.removerItem(item5);

        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(9, tamanhoInventario);
        assertEquals("ma", i.getListadeItens().get(8).getDescricao());
    }

    @Test
    public void verificarAdicionar2Itens(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("ma",12);

        i.adicionarItem(item);
        i.adicionarItem(item2);
        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(2, tamanhoInventario);
    }

    @Test
    public void verificarAdicionar22Itens(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("ma",12);
        Item item3 = new Item("m",1);
        Item item4 = new Item("ma",12);
        Item item5 = new Item("m",1);
        Item item6 = new Item("ma",12);
        Item item7 = new Item("m",1);
        Item item8 = new Item("ma",12);
        Item item9 = new Item("m",1);
        Item item10 = new Item("ma",12);
        Item item11 = new Item("m",1);
        Item item12 = new Item("ma",12);
        Item item13 = new Item("m",1);
        Item item14 = new Item("ma",12);
        Item item15 = new Item("m",1);
        Item item16 = new Item("ma",12);
        Item item17 = new Item("m",1);
        Item item18 = new Item("ma",12);
        Item item19 = new Item("m",1);
        Item item20 = new Item("ma",12);
        Item item21 = new Item("m",1);
        Item item22 = new Item("ma",12);

        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);
        i.adicionarItem(item4);
        i.adicionarItem(item5);
        i.adicionarItem(item6);
        i.adicionarItem(item7);
        i.adicionarItem(item8);
        i.adicionarItem(item9);
        i.adicionarItem(item10);
        i.adicionarItem(item11);
        i.adicionarItem(item12);
        i.adicionarItem(item13);
        i.adicionarItem(item14);
        i.adicionarItem(item15);
        i.adicionarItem(item16);
        i.adicionarItem(item17);
        i.adicionarItem(item18);
        i.adicionarItem(item19);
        i.adicionarItem(item20);
        i.adicionarItem(item21);
        i.adicionarItem(item22);
        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(22, tamanhoInventario);
    }

    @Test
    public void verificarRemover2Itens(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("n",1);
        i.adicionarItem(item);
        i.adicionarItem(item2);

        i.removerItem(item);
        i.removerItem(item2);

        int tamanhoInventario = i.getListadeItens().size();

        assertEquals(0, tamanhoInventario);
    }

    @Test
    public void imprimir2ItensTeste(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("n",1);
        i.adicionarItem(item);
        i.adicionarItem(item2);

        String itens = i.imprimir();

        assertEquals("m,n,",itens);
    }

    @Test
    public void imprimir10ItensTeste(){
        Inventario i = new Inventario();
        Item item = new Item("m",1);
        Item item2 = new Item("n",1);
        Item item3 = new Item("m",1);
        Item item4 = new Item("n",1);
        Item item5 = new Item("m",1);
        Item item6 = new Item("n",1);
        Item item7 = new Item("m",1);
        Item item8 = new Item("n",1);
        Item item9 = new Item("m",1);
        Item item10 = new Item("n",1);
        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);
        i.adicionarItem(item4);
        i.adicionarItem(item5);
        i.adicionarItem(item6);
        i.adicionarItem(item7);
        i.adicionarItem(item8);
        i.adicionarItem(item9);
        i.adicionarItem(item10);

        String itens = i.imprimir();

        assertEquals("m,n,m,n,m,n,m,n,m,n,",itens);
    }

    @Test
    public void verificarMaiorQtdItem(){
        Inventario i = new Inventario();
        Item item = new Item("a",1);
        Item item2 = new Item("b",2);
        Item item3 = new Item("c",3);

        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);

        Item obj = i.itemMaiorQtd();

        assertEquals("c", obj.getDescricao());
    }

    @Test
    public void verificarMaiorQtdItemEntre18Itens(){
        Inventario i = new Inventario();
        Item item = new Item("a",1);
        Item item2 = new Item("b",2);
        Item item3 = new Item("c",3);
        Item item4 = new Item("a",1);
        Item item5 = new Item("b",2);
        Item item6 = new Item("c",3);
        Item item7 = new Item("a",1);
        Item item8 = new Item("b",2);
        Item item9 = new Item("c",3);
        Item item10 = new Item("a",1);
        Item item11 = new Item("berg",233);
        Item item12 = new Item("c",3);
        Item item13 = new Item("a",1);
        Item item14 = new Item("b",2);
        Item item15 = new Item("c",3);
        Item item16 = new Item("a",1);
        Item item17 = new Item("b",2);
        Item item18 = new Item("c",3);

        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);
        i.adicionarItem(item4);
        i.adicionarItem(item5);
        i.adicionarItem(item6);
        i.adicionarItem(item7);
        i.adicionarItem(item8);
        i.adicionarItem(item9);
        i.adicionarItem(item10);
        i.adicionarItem(item11);
        i.adicionarItem(item12);
        i.adicionarItem(item13);
        i.adicionarItem(item14);
        i.adicionarItem(item15);
        i.adicionarItem(item16);
        i.adicionarItem(item17);
        i.adicionarItem(item18);

        Item obj = i.itemMaiorQtd();

        assertEquals("berg", obj.getDescricao());
    }

    @Test
    public void ordenarItens(){
        Inventario i = new Inventario();
        Item item = new Item("a",5);
        Item item2 = new Item("b",2);
        
        i.adicionarItem(item);
        i.adicionarItem(item2);
        
        i.ordenarItens();
        
        int qtdItem = i.getListadeItens().get(0).getQuantidade();
        assertEquals(2, qtdItem);
    }
    
    @Test
    public void ordenarItensMenorItemEhZero(){
        Inventario i = new Inventario();
        Item item = new Item("a",5);
        Item item2 = new Item("b",2);
        Item item3 = new Item("a",0);
        Item item4 = new Item("b",2);
        
        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);
        i.adicionarItem(item4);
        
        i.ordenarItens();
        
        int qtdItem = i.getListadeItens().get(0).getQuantidade();
        assertEquals(0, qtdItem);
    }
    
    @Test
    public void ordenarItensInventarioVazio(){
        Inventario i = new Inventario();
        
        i.ordenarItens();
        
        boolean nulo = i.getListadeItens().isEmpty() ? true : false;
        assertTrue(nulo);
    }
    
    @Test
    public void ordenarItensMenorQtdNumeroNegativo(){
        Inventario i = new Inventario();
        Item item = new Item("a",5);
        Item item2 = new Item("b",2);
        Item item3 = new Item("b",-2);
        
        i.adicionarItem(item);
        i.adicionarItem(item2);
        i.adicionarItem(item3);
        i.ordenarItens();
        
        int qtdItem = i.getListadeItens().get(0).getQuantidade();
        assertEquals(-2, qtdItem);
    }
}
