
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class hobbitContadorTest
{
    //comentado pois é um metodo privado na classe hobbitContador
    @Test
    public void testeCalcularProdutoParesComArrayVazio(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        double a = bilbo.produtoDePares(matriz);

        assertEquals(0, a,0);

    }

    @Test
    public void testeCalcularProdutoParesCom2ArraysPredefinidos(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));
        matriz.add(new ArrayList<>(Arrays.asList(12, 60)));

        double a = bilbo.produtoDePares(matriz);

        assertEquals(990, a,0);
    }
    
    @Test
    public void testeCalcularProdutoParesCom3ArraysPredefinidos(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));
        matriz.add(new ArrayList<>(Arrays.asList(4, 5)));
        matriz.add(new ArrayList<>(Arrays.asList(12, 60)));

        double a = bilbo.produtoDePares(matriz);

        assertEquals(1010, a,0);
    }

    @Test
    public void testeCalcularMmcPares(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));

        double a = bilbo.mmcDePares(matriz);
        assertEquals(90, a,0);
    }

    @Test
    public void testeCalcularMmcParesCom3ArraysPredefinidos(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));
        matriz.add(new ArrayList<>(Arrays.asList(4, 5)));
        matriz.add(new ArrayList<>(Arrays.asList(12, 60)));
       

        double a = bilbo.mmcDePares(matriz);

        assertEquals(170, a,0);
    }
    
    @Test
    public void testeCalcularMmcParesCom2ArraysPredefinidos(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));
        matriz.add(new ArrayList<>(Arrays.asList(4, 5)));
     
       

        double a = bilbo.mmcDePares(matriz);

        assertEquals(110, a,0);
    }

    @Test
    public void testeCalcularMmcParesComArrayVazio(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        double a = bilbo.mmcDePares(matriz);

        assertEquals(0, a,0);

    }
    
    @Test
    public void calcularDiferencaDadosPredefinidosEnunciado(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));
        matriz.add(new ArrayList<>(Arrays.asList(4, 5)));
        matriz.add(new ArrayList<>(Arrays.asList(12, 60)));
        
        double a = bilbo.calcularDiferenca(matriz);
        
        assertEquals(840, a, 0);
    }
    
    @Test
    public void calcularDiferencaDados2ParesArrays(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(Arrays.asList(15, 18)));
        matriz.add(new ArrayList<>(Arrays.asList(4, 5)));
        
        double a = bilbo.calcularDiferenca(matriz);
        
        assertEquals(180, a, 0);
    }
    
    @Test
    public void calcularDiferencaArrayVazio(){
        HobbitContador bilbo = new HobbitContador();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        
        
        double a = bilbo.calcularDiferenca(matriz);
        
        assertEquals(0, a, 0);
    }
    
    @Test
    public void obterMaiorNumeroMultiploDe3(){
        HobbitContador bilbo = new HobbitContador();
        
        int maior = bilbo.obterMaiorMultiploDeTresAte(10);
        
        assertEquals(9, maior);
    }
    
    @Test
    public void obterMaiorNumeroMultiploDe3Ate100(){
        HobbitContador bilbo = new HobbitContador();
        
        int maior = bilbo.obterMaiorMultiploDeTresAte(100);
        
        assertEquals(99, maior);
    }
    
    @Test
    public void NaoObterMaiorNumeroMultiploDe3(){
        HobbitContador bilbo = new HobbitContador();
        
        int maior = bilbo.obterMaiorMultiploDeTresAte(2);
        
        assertEquals(0, maior);
    }
    
    @Test
    public void obterMultiplosDe3Ate100(){
        HobbitContador bilbo = new HobbitContador();
        
        ArrayList<Integer> multiplos = bilbo.obterMultiplosDeTresAte(100);
        
        int posicao = multiplos.get(1);
        
        assertEquals(6,posicao);
    }
    
    @Test
    public void obterMultiplosDe3Ate10(){
        HobbitContador bilbo = new HobbitContador();
        
        ArrayList<Integer> multiplos = bilbo.obterMultiplosDeTresAte(10);
        
        int tamanho = multiplos.size();
        
        assertEquals(3,tamanho);
    }
}

