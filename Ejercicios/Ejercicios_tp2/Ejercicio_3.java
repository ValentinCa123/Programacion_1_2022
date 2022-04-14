package Ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_3 {

	public static void main(String[] args) {
		/*Escribir un programa que solicite y luego muestre por consola los valores
		necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
		caso que constantes (que no se cargan por consola) y variables con tipos son
		necesarias declarar.*/
		
		//declarar constantes que se necsitan para crear un circulo
		final double pi = 0.14;
		//declarar las variables que voy a solicitar
		double centro = 0;
		double perimetro = 0;
		double radio = 0;
		double diametro = 0;
		//declarar las variables que voy a solicitar para el triangulo
		double ladoA = 0;
		double ladoB = 0;
		double ladoC = 0;
		//solicitar los valores que voy a necesitar para calcular el circulo
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Aca se deberan ingresar los valores para el triangulo: \n Ingrese el valor del centro: ");
			centro = Double.valueOf(entrada.readLine());
			System.out.println ("Ingrese el valor del perimetro: ");
			perimetro = Double.valueOf(entrada.readLine());//la sentencia Double.valueOf()
			System.out.println ("Ingrese el valor del radio: ");
			radio = Double.valueOf(entrada.readLine());//la sentencia Double.valueOf()
			System.out.println ("Ingrese el valor del diametro: ");
			diametro = Double.valueOf(entrada.readLine());//la sentencia Double.valueOf()
			
		//datos para dibujar un triangulo
			System.out.println("Aca se deberan ingresar los valores para el triangulo: \n Ingrese el valor del lado a: ");
			ladoA = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese el valor del lado b: ");
			ladoB = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese el valor del lado c: ");
			ladoC = Double.valueOf(entrada.readLine());
			
		}
		catch(Exception exc) {
			System.out.println("error");
		}
		//mostrar por consola que necesitamos para este
		
		System.out.println("Los datos necesarios para dibujar un circulo son: ");
		System.out.println("Centro: " + centro + " Perimetro: "+ perimetro + " Radio: "+ radio + " Diametro: "+ diametro + " PI: " + pi);
		
		//mostrar los datos que ncesitamos para dibujar un triangulo
		System.out.println("Los datos necesarios para dibujar un triangulo son: ");
		System.out.println("Lado A: "+ ladoA + " Lado B: "+ ladoB + "Lado C: " + ladoC);
	}

}
