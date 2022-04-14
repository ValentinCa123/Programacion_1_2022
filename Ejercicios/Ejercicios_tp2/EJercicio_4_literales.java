package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJercicio_4_literales {

	public static void main(String[] args) {
		/*Escribir un programa que pida que se ingresen datos necesarios para emitir una
		factura por la compra de dos artículos de librería (tipo factura, número, nombre
		cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
		salida debe imprimir por pantalla la factura en un formato similar al siguiente
		(utilizar literales):*/
		
		//declarar las variables a usar
		String tipoFactura;
		int numero;
		String nombreCliente, producto1, producto2;
		double importe1, importe2, importeTotal;
		//pedir al usuario que datos debe ingresar
		try {
		    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese datos necesarios para emitir una factura \n. Ingrese tipo de factura: ");
			tipoFactura = entrada.readLine();
			System.out.println("Ingrese numero de la factura:");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el nombre del cliente: ");
			nombreCliente = entrada.readLine();
			System.out.println("Ingrese el primer producto:");
			producto1= entrada.readLine();
			System.out.println("Ingrese el segundo producto: ");
			producto2 = entrada.readLine();
			System.out.println("Ingrese el importe del primer producto: ");
			importe1 = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese el importe del segundo producto: ");
			importe2 = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese el importe Total:");
			importeTotal = Double.valueOf(entrada.readLine());
			
			//imprimir por pantalla los datos utilizando literales
			System.out.println("Factura \t" + tipoFactura + numero + "\n" + "Nombre y apellido: \t" + nombreCliente + "\n" + "Producto: \t\t" + "Importe" + "\n" + producto1 + "\t\t" + importe1 + "\n" + producto2 + "\t\t" + importe2 + "\n"+ "Importe total: " + "\t\t" + importeTotal );
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}

}
