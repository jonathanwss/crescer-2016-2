public class Elfo {
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private int nflechas;

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

    public Item getArco() {
        return arco;
    }

    public Item getFlecha(){
        return flecha;
    }

    public int getNumFlechas(){
        return nflechas;
    }

    public void atirarFlecha(int numflechas) {
        nflechas = numflechas;
        flecha.setQuantidade(flecha.getQuantidade() - nflechas);
        if(getFlecha().getQuantidade()<0){
            flecha.setQuantidade(0);
        }
        experiencia++;
    }

    /*public void atirarFlechaRefactory() {
    experiencia++;
    flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
    
    public void cacarAnao(int nfle, Dwarve anao){
        
        atirarFlecha(nfle);
        
        anao.setPontosDeVida(anao.getPontosDeVida()-(nflechas*10));
    }
}

