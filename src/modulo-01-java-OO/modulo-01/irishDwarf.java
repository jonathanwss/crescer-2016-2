
public class irishDwarf  extends Dwarf
{

    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
    }

    public irishDwarf() {
        this(null, new DataTerceiraEra(1,1,1));
    }

    public irishDwarf(String nome, DataTerceiraEra dataNascimento) {
        nome = super.nome;
        dataNascimento = super.dataNascimento;
        status = super.status;
        mochila = super.mochila;
    }

    public void muitaSorte(){
        int tamanho = getMochila().getListadeItens().size();
        for(int x = 0; x < tamanho; x++){
            int qtd = getMochila().getListadeItens().get(x).getQuantidade();
            int novaQtd = calculoMuitaSorte(x) * 1000 + qtd;
            getMochila().getListadeItens().get(x).setQuantidade(novaQtd);
        }
    }

    private int calculoMuitaSorte(int position){
        int qtd = 0;

        int b = getMochila().getListadeItens().get(position).getQuantidade();
        
        int a = b < 0 ? b* -1 : b ;

        for(int x = 0;x <= a; x++){
            qtd = qtd + (a - x);
        }
        
        return qtd;
    }
}
