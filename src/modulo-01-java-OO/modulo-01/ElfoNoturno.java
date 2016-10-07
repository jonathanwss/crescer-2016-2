public class ElfoNoturno extends Elfo{

    public ElfoNoturno(String n) {

        this(n, 42);

    }

    public ElfoNoturno(String nome, int quantidadeFlechas) {
        super(nome,quantidadeFlechas);
        inicializarInventario(quantidadeFlechas);
    }

    public void atirarFlecha(){
        double vidaElfoNoturno = this.vida;
        if(vidaElfoNoturno>=1 && this.getFlecha().getQuantidade()>0){
            this.getFlecha().setQuantidade(this.getFlecha().getQuantidade()-1) ;
            this.experiencia +=3;
            this.vida = vidaElfoNoturno * 0.95;
        }else{
            this.status = Status.MORTO;
        }
    }
}


