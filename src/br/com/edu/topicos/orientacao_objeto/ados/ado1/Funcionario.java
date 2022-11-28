package br.com.edu.topicos.orientacao_objeto.ados.ado1;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;


    public Funcionario(){
    }

    public void aumentarSalario(){
        double percentualAumento = 1.1;
        double salario = getSalario();
        double resultado = salario * percentualAumento;
        setSalario(resultado);
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF " + this.cpf);
        System.out.println("Salário " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
class Gerente extends Funcionario{

    String nivelGerencia;

    @Override
    public void aumentarSalario(){

        double salario = getSalario();
        double bonus = 1.15;
        double resultado = salario * bonus;
        setSalario(resultado);
    }
}

class Assistente extends Funcionario{

    int numeroMatricula;

    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
}

class AssistenteTecnico extends Assistente{
    private double bonusSalarial;

    public void setBonusSalarial(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }
    public double getBonusSalarial(){
        return this.bonusSalarial;
    }

}

class AssistenteAdministrativo extends Assistente{
    private double adicionalNoturno;

    public void setAdicionalNoturno(double adicionalNoturno){
        this.adicionalNoturno = adicionalNoturno;
    }

}

