

public class ElfosVerdes extends Elfo{
    
    
    public ElfosVerdes(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }

    public ElfosVerdes(String nome, int quantidadeFlechas) {
        super(nome);
        status = super.status;
        mochila = super.mochila;
        
    }
    
    public void atirarFlechaDobroXp(){
        super.atirarFlecha(new Dwarf());
        super.experiencia++;
    }
 }

