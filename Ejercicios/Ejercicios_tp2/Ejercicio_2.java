package Ejercicios;

public class Ejercicio_2 {

	public static void main(String[] args) {

		/*Escribir un programa que declare tres variables de tipo double y
		una constante de tipo double con valor 1.0 . Luego deberá
		asignar el valor de la constante a una de la variables declaradas,
		y posteriormente sobre las dos restantes variables se le deberá
		asignar el valor de la variable que inicialmente fue seteada con el
		valor de la constante. Finalmente imprima por pantalla cada una
		de las variables.*/
	
		//declarar 3 variables de tipo double y una constante de tipo double de 1.0
		double variable1, variable2, variable3;
		final double variableConstante = 1.0;
		//asignar el valor de la constante a una variable declarada
		variable1 = variableConstante;
		//a las 2 variables restantes darle el valor de la variable que inicialmente 
		//fue seteada con el valor de la constante
		variable2 = variable1;
		variable3 = variable1;
		//imprimer por pantalla cada una de las variables
		System.out.println("variable1 "+ variable1);
		System.out.println("variable2 "+ variable2);
		System.out.println("variable3 "+ variable3);
	}

}
