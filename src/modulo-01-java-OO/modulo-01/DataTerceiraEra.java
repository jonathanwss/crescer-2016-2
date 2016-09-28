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
    
    public DataTerceiraEra(int day, int month, int year){
        ano = year;
        dia = day;
        mes = month;
    }
    
    public boolean ehBissexto(){
        if(ano%4 == 0 && ano%100 != 0){
            return true;
        }else if(ano%400 == 0){
            return true;
        }
        return false;
    }
}
