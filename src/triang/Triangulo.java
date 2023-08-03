package triang;

public class Triangulo { //definição do tipo
	public double sideA;
	public double sideB;
	public double sideC;
	
	public double area () {//vai retornar 
		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
}
