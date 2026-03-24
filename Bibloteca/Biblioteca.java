package Bibloteca;

public class Biblioteca {

    private String nomeBloblioteca;
    private String endereco;
    private Livro [] listaLivro;

    public Biblioteca(String nomeB, String endereco, Livro[]listaLivro){

    }
    public Biblioteca(){

    }
    
    public String getNomeBloblioteca() {
        return nomeBloblioteca;
    }
    public void setNomeBloblioteca(String nomeBloblioteca) {
        this.nomeBloblioteca = nomeBloblioteca;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Livro[] getListaLivro() {
        return listaLivro;
    }
    public void setListaLivro(Livro[] listaLivro) {
        this.listaLivro = listaLivro;
    }

}
