import java.util.*;

public class HobbitContador
{
    public double produtoDePares(ArrayList<ArrayList<Integer>> matriz){
        double produto = 1;
        double resultadoSomaProdutos = 0;
        int cont = matriz.size();

        for(int x = 0; x < cont; x++){
            int cont2 = matriz.get(x).size();

            for(int y = 0; y < cont2; y++){
                produto *= matriz.get(x).get(y);

            }
            resultadoSomaProdutos = resultadoSomaProdutos + produto;
            produto = 1;

        }
        return matriz.isEmpty() ? 0 : resultadoSomaProdutos;
    }

    public double mmcDePares(ArrayList<ArrayList<Integer>> matriz){

        int tamanho = matriz.size();
        double result = 1;
        double mmcFinal = 0;
        int cont = 1;
        boolean mmc = true;

        for(int x = 0; x < tamanho; x++){
            
            int a = matriz.get(x).get(0);
            int b = matriz.get(x).get(1);
            
            while(mmc){
                double restoA = cont%a;
                double restoB = cont%b;
                if(restoA ==  restoB && a<=cont && b<=cont){
                    
                        result *= cont;
                        mmc = false;
                }
                
                cont++;
            }
            
           
            mmcFinal =mmcFinal + result;
            result = 1;
            mmc = true;
            cont = 1;

        }
       
        return matriz.isEmpty() ? 0 : mmcFinal;
    }
    
    
    
    public double calcularDiferenca(ArrayList<ArrayList<Integer>> matriz){
        return produtoDePares(matriz) - mmcDePares(matriz);
    }
    
    

}
