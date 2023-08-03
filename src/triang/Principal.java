package triang;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double aX, bX, cX, aY, bY, cY;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite os lados do triângulo X");
		
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y");
		
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();
		
		double p = (aX + bX + cX) / 2;
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX)); 

	
		p = (aY + bY + cY) / 2;
		double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY)); 
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("O triangulo X tem a maior área");
		}else {
			System.out.println("O triangulo Y tem a maior área");
		}
		sc.close();

	}

}
