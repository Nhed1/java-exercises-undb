// ATIVIDADE PRÁTICA LABORATÓRIO DE POO - UNDB - Prof Igor
// Aluno Leonardo Garreto Cantanhede

//2)
public class Exercise2 {
	public static void main(String args[]) {
		SistemaMedia aluno1 = new SistemaMedia();
		aluno1.setNotas(10, 8, 6);
		System.out.println(aluno1.getMedia());
	}
}

class SistemaMedia {
	private double nota1;
	private double nota2;
	private double nota3;
	
	public void setNotas(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double getMedia() {
		double media = (nota1+nota2+nota3) / 3;
		return media;
	}
}