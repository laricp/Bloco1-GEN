package JAVA_INTRO;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 ano -- 365 dias
		 * 1 mes -- 30 dias
		 * 1 dia -- 1 dia
		 */
		Scanner leia = new Scanner(System.in);
		int anos,meses,dias,tempo;

		System.out.println("Quantos anos inteiros possui? \nR: ");
		anos = leia.nextInt();
		System.out.println("Quantos meses inteiros possui? \nR: ");
		meses = leia.nextInt();
		System.out.println("E quantos dias completados? \nR: ");
		dias = leia.nextInt();

		tempo = (anos * 365+(meses* 30 + dias));
		System.out.println("Seu tempo de vida vivido em dias ate o momento e de: "+tempo);

	}

}
