public class Elfo {
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;

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

<<<<<<< HEAD
    public Item getFlecha(){
        return flecha;
    }

    public void atirarFlecha() {
       
        flecha.setQuantidade(flecha.getQuantidade() - 1);
        if(getFlecha().getQuantidade()<0){
            flecha.setQuantidade(0);
        }
        experiencia++;
    }
    
    
    
    
=======
    public int getExperiencia() {
        return experiencia;
    }

    public Item getFlecha() {
        return flecha;
    }

    public void atirarFlecha(Dwarf dwarf) {
        boolean temFlecha = flecha.getQuantidade() > 0;
        if (temFlecha) {
            flecha.setQuantidade(flecha.getQuantidade() - 1);
            experiencia++;
            dwarf.perderVida();
        }
    }

    /*public void atirarFlechaRefactory() {
    experiencia++;
    flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
>>>>>>> master
}

