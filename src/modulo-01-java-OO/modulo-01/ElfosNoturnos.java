public class ElfosNoturnos extends Elfo{
    
    public ElfosNoturnos(String n) {

        super(n, 42);
        
    }

    public ElfosNoturnos(String nome, int quantidadeFlechas) {
        super(nome);
        mochila = super.mochila;
        status = super.status;
        super.inicializarInventario(quantidadeFlechas);
    }

    //Neste caso elfos não podem morrer pois seu status não esta sendo mudado para morto após atingir 0 de vida.
    public void atirarFlecha(){
        double vidaElfoNoturno = super.vida;
        if(vidaElfoNoturno>=1 && super.getFlecha().getQuantidade()>0){
            super.atirarFlecha(new Dwarf());
            super.experiencia +=2;
            super.vida = vidaElfoNoturno * 0.95;
        }else{
            this.status = Status.MORTO;
        }
    }

}
