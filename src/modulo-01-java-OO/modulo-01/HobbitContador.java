import java.util.*;

public class HobbitContador
{
    
    //Os dois metodos abaixo só estão pubicos pois foram feitos testes para ver se a logica estava funcionando
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
    //DÚVIDA:  Na aula foi muito falado sobre o que é gambiarra. Especialmente esse metodo de calcular MMC eu ví que estava totalmente diferente do que vc fez.
    //Pra min esse metodo era só uma logica diferente mas do seu ponto de vista este metodo é uma gembiarra ou simplesmente uma logica diferente que eu usei?
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
    
    public int obterMaiorMultiploDeTresAte(int num){
        int maior = 0;
        for(int x = 1; x <= num; x++){
            if(x%3==0){
                maior = x;
            }
        }
        
        
        return maior;
        
    }
    
    public ArrayList<Integer> obterMultiplosDeTresAte(int num){
        ArrayList<Integer> multiplos = new ArrayList<>();
        
        for(int x = 1; x <= num; x++){
            if(x%3==0){
                multiplos.add(x);
            }
        }
        
        return multiplos;
    }
    

    
    

}
