public class NaoPodeAlistarException extends Exception
{
   public NaoPodeAlistarException(){
       super("N�o foi poss�vel alistar, revise seu tipo");
    }
    
    public NaoPodeAlistarException(String erro){
       super(erro);
    }
}