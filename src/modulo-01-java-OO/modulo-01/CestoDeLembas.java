public class CestoDeLembas{
    private int quantidade;
    
    public CestoDeLembas(int qtd){
        quantidade = qtd;
    }
    
    public boolean podeDividirEmPar(){
        
        return quantidade%2==0&&quantidade!=2&&quantidade>=1&&quantidade<=100;
        
    }
}
