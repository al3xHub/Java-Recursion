package es.studium.Ejemplos;

import java.util.Scanner;

public class PrimerEjemplo
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int n;
		int resultado;
		
		System.out.println("Dame el número entero a calcular su sumatorio: ");
		
		n=teclado.nextInt();
		teclado.close();
		
		resultado=sumatorio(n);
		System.out.println(resultado);
		
	}

	private static int sumatorio(int n)
	{
		int r;
		
		//Caso base
		if(n==1)
		{
			r=1;
		}
		
		//Caso recursivo
		else
		{
			r=n+sumatorio(n-1);
		}
		
		return r;
	}

}
