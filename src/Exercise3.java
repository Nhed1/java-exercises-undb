// ATIVIDADE PRÁTICA LABORATÓRIO DE POO - UNDB - Prof Igor
// Aluno Leonardo Garreto Cantanhede

//3)
public class Exercise3 {
	public static void main(String args[]) {
		Circulo circulo1 = new Circulo(10);
		System.out.println(circulo1.calculoArea());
		System.out.println(circulo1.calculoPerimetro());
	}
}

class Circulo {
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double calculoArea() {
		double area = (raio * raio) * 3.14;
		return area;
	}
	public double calculoPerimetro() {
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}
}
