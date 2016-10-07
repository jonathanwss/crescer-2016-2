public class NaoPodeAlistarException extends Exception
{
   public NaoPodeAlistarException(){
       super("Não foi possível alistar, revise seu tipo");
    }
    
    public NaoPodeAlistarException(String erro){
       super(erro);
    }
}