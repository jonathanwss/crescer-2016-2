public class Elfo extends Personagem {   
    private Exercito alistar;
    private static int contadorElfo;
    
    {
        this.vida = 100;
    }
    
    public static int getContadorElfo(){
        return Elfo.contadorElfo;
    }
    
    public Elfo(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }

    public Elfo(String nome, int quantidadeFlechas) {
        super(nome);
        this.inicializarInventario(quantidadeFlechas);
        contadorElfo++;
    }
    
    protected void inicializarInventario(int quantidadeFlechas){
        this.mochila.adicionarItem(new Item("Arco", 1));
        this.mochila.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }
    
    public void alistarElfo(){
        Elfo v = new Elfo("a");
        alistar.alistar(v);
    }
    
    public Item getArco() {
        return this.mochila.getListadeItens().get(0);
    }

    public Item getFlecha(){
       return this.mochila.getListadeItens().get(1);
    }

  

    public void atirarFlecha(Dwarf dwarf) {
        boolean temFlecha = getFlecha().getQuantidade() > 0;
        if (temFlecha) {
            getFlecha().setQuantidade(getFlecha().getQuantidade() - 1);
            experiencia++;
            dwarf.perderVida();
        }

    }
    
    public String toString() {
        

        boolean flechaNoSingular = this.getFlecha().getQuantidade() == 1;
        boolean experienciaNoSingular = this.experiencia == 0 || this.experiencia == 1;

        return String.format("%s possui %d %s e %d %s de experiência.",
            this.nome,
            this.getFlecha().getQuantidade(),
            // ?:
            flechaNoSingular ? "flecha" : "flechas",
            this.experiencia,
            experienciaNoSingular ? "nível" : "níveis"
        );
    }
    
    public void finalize() throws Throwable{
        super.finalize();
        contadorElfo--;
    }

    /*public void atirarFlechaRefactory() {
    experiencia++;
    flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
    
    @Override
    public boolean equals(Object obj){
        
        Elfo outro = (Elfo)obj;
        return this.nome.equals(outro.getNome());
    } 
}

