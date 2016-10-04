
public class ElfosVerdes extends Elfo{

    public ElfosVerdes(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }
    
    public ElfosVerdes(String nome, int quantidadeFlechas) {
       super(nome);
       status = Status.VIVO;
    }

    public void atirarFlechaDobroXp(){
        super.atirarFlecha(new Dwarf());
        super.experiencia++;
    }

    public void adicionarItem(Item item){
        if(item.getDescricao().equals("Arco de vidro") || item.getDescricao().equals("Flechas de vidro")){
            ganharItem(item);
        }
    }

}


