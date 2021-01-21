package Ejercicios1;

import java.util.Scanner;

public class Ejerciciodos 
{
	public static void main(String[] args)
	{
	Scanner entrada = new Scanner(System.in);
	int numero = 0;
	int contador = 0;
	final int pin_almacenado = 1234;
	boolean pinCorrecto;
	
	do 
	{
		System.out.println("Introduce la contraseña: ");
		numero = entrada.nextInt();
		contador++;
		//Comprobamos si  es válida.
		pinCorrecto = (pin_almacenado == numero);
		if (!pinCorrecto)
		{
			System.out.println("Error, vuelve a introducir la contraseña.");
		}
	}
	
	while(!pinCorrecto && contador < 3 );
	
	if (pinCorrecto)
	{
		System.out.println("Contraseña correcta. ");
	}
	
	else
	{
		System.out.println("Ya no tienes más intentos");
	}
}
}
