//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package Java_LacosRep;

import java.util.Scanner;

public class LacosRep_exFor_2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x, num, par=0, impar=0;

        for (x=1;x<=10;x++) 
        {
            System.out.print("Digite o "+x+"� n�mero: ");
            num = ler.nextInt();

            if(num%2==0) 
            {
                par++;
            } else 
            	{
                	impar++;
            	}
        }
        System.out.println("Foram digitados "+par+" numeros pares e "+impar+" �mpares!");
    }
}