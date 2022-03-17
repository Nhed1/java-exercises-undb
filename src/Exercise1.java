// ATIVIDADE PRÁTICA LABORATÓRIO DE POO - UNDB - Prof Igor
// Aluno Leonardo Garreto Cantanhede

//1)
public class Exercise1 {
	public static void main(String args[]) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setFuncionario("leo", 19, 10.500);
		System.out.println(funcionario1.getFuncionarioIdade());
	}
}

class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	public void setFuncionario(String nome, int idade, double salario){
		this.nome = nome;
		this.idade= idade;
		this.salario = salario;
	}
	public String getFuncionarioNome() {
		return nome;
	}
	public double getFuncionarioSalario() {
		return salario;
	}
	public int getFuncionarioIdade() {
		return idade;
	}
}