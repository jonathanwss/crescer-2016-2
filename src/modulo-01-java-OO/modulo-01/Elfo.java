public class Elfo {
    private String nome;
    //Sei que para otimizar melhor devo remover esses dois itens criados e mandar tudo para o inventario. e o farei UM dia, ou não, zoas. amanhã eu faço.

    //
    private int experiencia;
    private Status status;
    private Inventario mochila; 

    public Elfo(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }

    public Elfo(String nome, int quantidadeFlechas) {
        this.nome = nome;
        mochila = new Inventario();
        this.mochila.adicionarItem(new Item("Arco", 1));
        this.mochila.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
        status = Status.VIVO;
        
    }

    
    public Inventario getMochila(){
        return mochila;
    }

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public Item getArco() {
        return this.mochila.getListadeItens().get(0);
    }

    public Item getFlecha(){
       return this.mochila.getListadeItens().get(1);
    }

    public int getExperiencia() {
        return experiencia;
    }

    
    public Status getStatus() {
        return status;
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

    /*public void atirarFlechaRefactory() {
    experiencia++;
    flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
}

