public class DataTerceiraEra{
    private int dia;
    private int mes;
    private int ano;

    public int getAno(){
        return ano;
    }

    public int getMes(){
        return mes;
    }

    public int getDia(){
        return dia;
    }

    public DataTerceiraEra(int ndia, int nmes, int nano){
        ano = nano;
        dia = ndia;
        mes = nmes;
    }

    public boolean ehBissexto(){
        if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0){
            return true;
        }else{ 
            return false;
        }
    }
}
