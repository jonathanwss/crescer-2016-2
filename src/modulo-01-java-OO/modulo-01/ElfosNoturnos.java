public class ElfosNoturnos extends Elfo{
    public ElfosNoturnos(String n) {

        this(n, 42);
    }

    public ElfosNoturnos(String nome, int quantidadeFlechas) {
        super(nome);
        status = super.status;
        mochila = super.mochila;

    }

    //Neste caso elfos não podem morrer pois seu status não esta sendo mudado para morto após atingir 0 de vida.
    public void atirarFlecha(){
        double vidaElfoNoturno = super.vida;
        if(vidaElfoNoturno>1){
            super.atirarFlecha(new Dwarf());
            super.experiencia +=2;
            super.vida = vidaElfoNoturno * 0.95;
        }else{
            this.status = Status.MORTO;
        }
    }

}
