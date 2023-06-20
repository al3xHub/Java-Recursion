package es.studium.Ejemplos;

import java.util.Scanner;

public class SegundoEjemplo
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int n;
		int resultado;
		
		System.out.println("Dame el número entero a calcular su factorial: ");
		
		n=teclado.nextInt();
		teclado.close();
		
		resultado=factorial(n);
		System.out.println(resultado);
		
	}

	private static int factorial(int n)
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
			r=n*factorial(n-1);
		}
		
		return r;
	}

}
