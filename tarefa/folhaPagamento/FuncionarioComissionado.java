package tarefa.folhaPagamento;

public class FuncionarioComissionado {
    private double vendasMensais;
    private double percentualComissao;
    public FuncionarioComissionado(String nome, double vendasMensais, double percentualComissao, double salarioBase){
    }
    public FuncionarioComissionado(){
    }
    public double calcularSalario(){
        return 0.0;
    }
    public double getVendasMensais() {
        return vendasMensais;
    }
    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }
    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
