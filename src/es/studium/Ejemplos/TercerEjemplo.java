package es.studium.Ejemplos;

import java.util.Scanner;

public class TercerEjemplo
{

	public static void main(String[] args)
	{
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el valor de n");
		n=teclado.nextInt();
		teclado.close();
		
		
		sucesion(n-1);
	}

	private static void sucesion(int n)
	{
		if(n==0)
		{
			
			
			System.out.println("1.5");
		}
		
		else
		{
			sucesion(n-1);
			System.out.println((n+3)/(float)2);
		}
	}

}
