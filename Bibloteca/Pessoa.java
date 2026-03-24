package Bibloteca;

public abstract class Pessoa {
    private String name;
    private String dateNasc;

    public Pessoa(){

    }

    public Pessoa(String nome, String dateNasc){

    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateNasc() {
        return dateNasc;
    }
    public void setDateNasc(String dateNasc) {
        this.dateNasc = dateNasc;
    }
}
