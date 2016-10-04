public class Elfo extends Personagem {   

    {
        this.vida = 100;
    }
    
    public Elfo(String n) {
        // Chamando construtor debaixo
        this(n, 42, "Arco","Flechas");
    }

    public Elfo(String nome, int quantidadeFlechas, String item, String item2) {
        super(nome);
        this.mochila.adicionarItem(new Item(item, 1));
        this.mochila.adicionarItem(new Item(item2, quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
        status = Status.VIVO;
        
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

    /*public void atirarFlechaRefactory() {
    experiencia++;
    flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
}

