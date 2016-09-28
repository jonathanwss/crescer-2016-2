public class CestoDeLembas{
    private int quantidade;
    
    public CestoDeLembas(int qtd){
        quantidade = qtd;
    }
    
    public boolean podeDividirEmPar(){
        if(quantidade%2==0&&quantidade!=2){
            return true;
        }else{
            return false;
        }
    }
}
