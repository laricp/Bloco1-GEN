package Java_LacosRep;

import java.util.Scanner;

public class LacosRep_exWhile_2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int sexo, idade, temp;
		int pCal=0,mNer=0,hAgr=0,oCal=0,pNerMa40=0,pCalMe18=0, pessoas=0;


		while(pessoas<5)
		{

			System.out.println("\nInforme sua idade: ");
			idade=ler.nextInt();
			System.out.println("\nInforme seu sexo");
			System.out.println("\n1- Feminino");
			System.out.println("\n2- Masculino");
			System.out.println("\n3- Outros");
			sexo=ler.nextInt();

			switch(sexo)
			{
				case 1:
					System.out.println("\nVoc� se identifica como uma pessoa: ");
					System.out.println("\n1- Voc� � calma.");
					System.out.println("\n2- Voc� � nervosa.");
					System.out.println("\n3- Voc� � agressiva.");
					temp=ler.nextInt();
					if(idade<18 && temp==1)
					{
						pCalMe18++;
						pCal++;
					}
					else if(idade>40 && temp==2)
					{
						pNerMa40++;
						mNer++;
					}
					else if(temp==2)
					{
						mNer++;
					}
					else if(temp==1)
					{
						pCal++;
					}
					break;


				case 2:
					System.out.println("\nVoc� se identifica como uma pessoa: ");
					System.out.println("\n1- Voc� � calmo.");
					System.out.println("\n2- Voc� � nervoso.");
					System.out.println("\n3- Voc� � agressivo.");
					temp=ler.nextInt();
					if(idade<18 && temp==1)
					{
						pCalMe18++;
						pCal++;
					}
					else if(temp==3)
					{
						hAgr++;
					}
					else if(idade>40 && temp==2)
					{
						pNerMa40++;
					}
					else if(temp==1)
					{
						pCal++;
					}
					break;

				case 3:
					System.out.println("\nVoc� se identifica como uma pessoa: ");
					System.out.println("\n1- Voc� � calmo.");
					System.out.println("\n2- Voc� � nervoso.");
					System.out.println("\n3- Voc� � agressivo.");
					temp=ler.nextInt();
					if(idade<18 && temp==1)
					{
						pCalMe18++;
						oCal++;
						pCal++;
					}
					else if(idade>40 && temp==2)
					{
						pNerMa40++;
					}
					else if(temp==1)
					{
						oCal++;
						pCal++;
					}
					break;

			}
			pessoas++;

		}
		System.out.println("\nO n�mero de pessoas calmas � de "+pCal);
		System.out.println("\nO n�mero de mulheres nervosas � de "+mNer);
		System.out.println("\nO n�mero de homens agressivos � de "+hAgr);
		System.out.println("\nO n�mero de outros calmos � de "+oCal);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos � de "+pNerMa40);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos � de "+pCalMe18);
	}
}