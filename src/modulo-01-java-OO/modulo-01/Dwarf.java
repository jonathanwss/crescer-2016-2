public class Dwarf extends Personagem {
    
    protected DataTerceiraEra dataNascimento;
    protected Item item;
 
    {
        vida = 110;
    }


    public Dwarf() {
        this(null, new DataTerceiraEra(1,1,1));
    }

    public Dwarf(String nome, DataTerceiraEra dataNascimento) {
        super(nome);
        this.dataNascimento = dataNascimento;
        status = Status.VIVO;
        mochila = new Inventario();
    }
    
    
    public void ganharItem(Item item){
        mochila.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        mochila.removerItem(item);
    }

     public void perderVida() {
        double numero = this.getNumeroSorte();
        if (numero < 0) {
            this.experiencia += 2;
        }
        if (numero > 100) {
            if(vida>0){
                vida -= 10;
            }
        }
        if(vida<=0){
            status = Status.MORTO;
        }
    }

    public DataTerceiraEra getDataNascimento() {
        return this.dataNascimento;
    }

    public double getNumeroSorte() {
        double resultado = 101.;
        boolean ehBissexto = dataNascimento.ehBissexto();

        if (ehBissexto && this.vida >= 80 && this.vida <= 90) {
            resultado *= -33.0;
        }
       
        if (!ehBissexto && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))) {
            resultado = resultado * 33 % 100;
        }

        return resultado;
    }
    
    public void tentarSorte(){
        
        double sorteReves = getNumeroSorte();
        
        if(sorteReves == - 3333){
            mochila.aumentarMilUnidadesItens();
            
        }
    }
    
}

