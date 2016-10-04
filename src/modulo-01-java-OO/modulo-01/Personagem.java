public class Personagem
{
    protected String nome;
    protected Status status;
    protected Inventario mochila = new Inventario();
    protected int experiencia;
    protected double vida;
    
    public Personagem(String nome){
        this.nome = nome;
        this.status = Status.VIVO;
    }
    
    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }
    
    public Inventario getMochila(){
        return mochila;
    }
    
      public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
        
    public double getVida() {
        return vida;
    }
    
    public void ganharItem(Item item){
        mochila.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        mochila.removerItem(item);
    }
}
