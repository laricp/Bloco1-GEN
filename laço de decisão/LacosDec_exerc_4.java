package Java_LacosDEC;

import java.util.Scanner;

public class LacosDec_exerc_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
				
		System.out.print("Entre com um n�mero: ");
		num = leia.nextFloat();

		if((num%2==0)) {
			System.out.printf("O n�mero %.1f � par e sua ra�z quadrada � %.2f",num,Math.sqrt(num));
		} else {
			System.out.println("O n�mero "+num+" � �mpar e elevado ao quadrado � "+Math.pow(num, 2));
		}
	}
}