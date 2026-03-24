package Bibloteca;

public class Estudante extends Pessoa {
    private int numMatricula;
    private String curso;
    private int anoIngresso;

    public Estudante(String curso, String nome, String dataNasc,int anoCurso, int anoIngresso){

    }
    public int getNumMatricula() {
        return numMatricula;
    }
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
}
