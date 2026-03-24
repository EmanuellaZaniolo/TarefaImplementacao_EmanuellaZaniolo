package tarefa.folhaPagamento;

public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double valorPorHora,double salarioBase){

    }

    public FuncionarioHorista(){

    }
    public double calcularSalario(){
        
        return 0.0;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
}
