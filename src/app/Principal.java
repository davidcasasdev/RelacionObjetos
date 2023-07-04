/**
 * 
 */
package app;

import java.util.Scanner;

import clases.CuentaBancaria;

/**
 * @author David
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		System.out.println("Programa de gestión de cuenta bancaria");
		
		System.out.println("Introduce el dni: ");
		cuenta1.setDni(teclado.nextLong());
		
		System.out.println("Saldo inicial: ");
		cuenta1.ingresar(teclado.nextDouble());
		
		System.out.println("Interés: ");
		cuenta1.setInteres(teclado.nextDouble());
		
		System.out.println("La cuenta es: \n"+cuenta1);
		
		System.out.println("Creando cuenta 2");
		CuentaBancaria cuenta2 = new CuentaBancaria(45000000,250,0.07);
		
		System.out.println("La cuenta 2 es: \n"+cuenta2);
		
		int opcion=0;
		do {
			System.out.println("1. Actualizar saldo.");
			System.out.println("2. Ingresar");
			System.out.println("3. Retirar dinero");
			System.out.println("0. Salir");
			System.out.println("Introduce una opción:");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.printf("El saldo antes de la actualizacion es "
						+ "de %.2f\n", cuenta1.getSaldo());
				System.out.printf("Actualizando saldo a interes %.2f...\n",cuenta1.getInteres());
				cuenta1.actualizarSaldo();
				System.out.printf("El saldo después de la actualizacion es "
						+ "de %.2f", cuenta1.getSaldo());
				break;
			case 2: 
				System.out.println("Cantidad a ingresar:");
				double cantidad= teclado.nextDouble();
				if (cuenta1.ingresar(cantidad)) {
					System.out.println("Ingreso realizado. Saldo actual: "
							+cuenta1.getSaldo());
				} else {
					System.out.println("No se ha podido realizar el ingreso. "
							+ "Vuelva a intentarlo");
				}
				break;
			case 3:
				System.out.println("Cantidad a retirar");
				cantidad = teclado.nextDouble();
				if (cuenta1.retirar(cantidad)) {
					System.out.println("Reoja su dinero. Saldo actual: "
				            +cuenta1.getSaldo()); 
				} else {
					System.out.println("Saldo insuficiente. Saldo actual: "
							+cuenta1.getSaldo());
				}
				break;
			case 0: System.out.println("Que tenga un buen día!"); break;
			default: System.out.println("opción incorrecta");
			}
		
		}while(opcion!=0);
		
		
		

	}

}
