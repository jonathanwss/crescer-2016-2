



public class Dwarf {
    private int vida;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int experiencia;
    private int sorte = 101 * 33;
    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
    }

    public void perderVida() {
        vida -= 10;
    }
    
    public void ganhar2xp(){
        this.experiencia += 2; 
    }

    public int getXp(){
        return experiencia;
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
        if(dataNascimento.ehBissexto() && getVida()>=80 && getVida()<=90){
            return -this.sorte;
        }else if(dataNascimento.ehBissexto()==false && getNome().equals("Seixas") || getNome().equals("Meirelles")){
            return this.sorte % 100;
        }else{
            return 101;
        }
    }
}

