



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
        if(dataNascimento.ehBissexto()==true && getVida()>=80 && getVida()<=90){
            return 101 * -33;
        }else if(dataNascimento.ehBissexto()==false && getNome().equals("Seixas") || getNome().equals("Meirelles")){
            return (101 * 33) % 100;
        }else{
            return 101;
        }
    }
}

