public class Elfo {
    private String nome;
    private Item arco;
    private Item flecha;
    private int xp;
    
    public Elfo(String n) {
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas", 42);
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void atirarFlecha() {
        flecha.setQuantidade(flecha.getQuantidade() - 1);
        xp++;
    }
    
    public Item getArco(){
        return arco;
    }
    /* public void atirarFlechaRefactory(int flechas, int xp){
        boolean acertar = true;
        if(acertar==true){
            xp++;
        }
        flecha.setQuantidade(flecha.getQuantidade() - 1);
    }*/
}









