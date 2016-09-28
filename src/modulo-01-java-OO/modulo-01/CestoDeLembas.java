<<<<<<< HEAD
public class CestoDeLembas{
    private int quantidade;
    
    public CestoDeLembas(int qtd){
        quantidade = qtd;
    }
    
    public boolean podeDividirEmPar(){
        
        return quantidade%2==0&&quantidade!=2&&quantidade>=1&&quantidade<=100;
        
    }
}
=======
public class CestoDeLembas
{
    private int numeroPaes;
    
    public CestoDeLembas(int numeroPaes) {
        this.numeroPaes = numeroPaes;
    }
    
    public boolean podeDividirEmPares() {
        return numeroPaes > 2 && numeroPaes % 2 == 0 && numeroPaes <= 100;
    }
}
>>>>>>> master
