package triang;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//double aX, bX, cX, aY, bY, cY;
		
		Triangulo triangleX, triangleY; 
		
		triangleX = new Triangulo(); 
		triangleY = new Triangulo(); //dentro dro triangulo agora estamos atribuindo todas as informações do produto, já instanciado, objeto triangulo
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite os lados do triângulo X");
		
		triangleX.sideA = sc.nextDouble();
		triangleX.sideB = sc.nextDouble();
		triangleX.sideC = sc.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y");
		
		triangleY.sideA = sc.nextDouble();
		triangleY.sideB = sc.nextDouble();
		triangleY.sideC = sc.nextDouble();
				
		double areaX = triangleX.area();
		double areaY = triangleY.area();
		
		if(areaX > areaY) {
			System.out.println("O triangulo X tem a maior área");
		}else {
			System.out.println("O triangulo Y tem a maior área");
		}
		
		sc.close();

	}

}
//double p = (triangleX.sideA + triangleX.sideB + triangleX.sideC) / 2;
//double areaX = Math.sqrt(p * (p - triangleX.sideA) * (p - triangleX.sideB) * (p - triangleX.sideC)); 
//
//p = (triangleY.sideA + triangleY.sideB + triangleY.sideC) / 2;
//double areaY = Math.sqrt(p * (p - triangleY.sideA) * (p - triangleY.sideB) * (p - triangleY.sideC)); 
