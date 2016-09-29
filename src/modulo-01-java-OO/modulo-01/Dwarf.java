



public class Dwarf {
    private int vida;
    private DataTerceiraEra dataNascimento;
    private String nome;
    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
    }

    public void perderVida() {
        vida -= 10;
    }

    public int getVida() {
        return vida;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Dwarf(String nom, DataTerceiraEra nascimentoData){
        nome = nom;
        
        dataNascimento = nascimentoData;
        
    }
    
    public Dwarf(){}
    
    public double getNumeroSorte(){
        
        
        return 101;
    }
}

