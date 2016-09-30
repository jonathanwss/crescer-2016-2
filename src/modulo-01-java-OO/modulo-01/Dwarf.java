public class Dwarf {
    private int vida, experiencia;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private Status status;
    private Inventario mochila;
    private Item item;
    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
    }

    public Inventario getMochila(){
        return mochila;
    }
    
    public Dwarf() {
        this(null, new DataTerceiraEra(1,1,1));
    }

    public Dwarf(String nome, DataTerceiraEra dataNascimento) {
        this.nome = nome;
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
    



    public int getXp(){
        return experiencia;
    }
    
    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNome() {
        return this.nome;
    }
    
    public Status getStatus(){
        return status;
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
        //if (!dataNascimento.ehBissexto() && this.nome != null && (this.nome.equals("Seixas") || this.nome.equals("Meireles"))) {
        if (!ehBissexto && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))) {
            resultado = resultado * 33 % 100;
        }

        return resultado;
    }
    
    public void tentarSorte(){
        
        double sorteReves = getNumeroSorte();
        
        if(sorteReves == - 3333){
            int tamanhoMochila = mochila.getListadeItens().size();
            
            for(int x = 0; x < tamanhoMochila; x++){
                int qtd = mochila.getListadeItens().get(x).getQuantidade();
                mochila.getListadeItens().get(x).setQuantidade(qtd+1000);
            }
        }
    }
    
}

