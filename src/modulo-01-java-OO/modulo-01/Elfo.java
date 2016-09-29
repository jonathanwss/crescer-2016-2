public class Elfo {
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;

    public Elfo(String n) {
        this(n, 42);
    }

    public Elfo(String n,int nFlechas){
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas", nFlechas >= 0 ? nFlechas : 42);
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

    public int getExperiencia() {
        return experiencia;
    }


    public void atirarFlecha(Dwarf dwarf) {
        boolean temFlecha = flecha.getQuantidade() > 0;
        if (temFlecha) {
            flecha.setQuantidade(flecha.getQuantidade() - 1);
            experiencia++;
            dwarf.perderVida();
        }

    }

    @Override
    public String toString(){
        boolean flechaNoSingular = this.flecha.getQuantidade() == 1;
        boolean nivelNoSingular = this.experiencia == 1;
        return String.format("%s possui %d %s e %d %s de experiencia",
            this.nome,
            this.flecha.getQuantidade(),
            flechaNoSingular ? "flecha" : "flechas",
            this.experiencia,
            nivelNoSingular ? "nivel" : "niveis"

        );
        // return getNome() + " possui " + getFlecha().getQuantidade() + " flechas e " + getExperiencia() + " niveis de experiencia";
    }

}

