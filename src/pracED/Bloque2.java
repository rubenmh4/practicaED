package pracED;

public class Bloque2 {

	/*
	 * 2.1 Método que nos calcule el factorial de un número, le pasamos el número
	 * como parámetro. Para calcular el factorial, se multiplica los números
	 * anteriores hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara
	 * esta operación 5*4*3*2*1=120. 2.2 Crea un método que reciba un producto y si
	 * este cuesta más de 300 euros, añadirle un 16% de recargo, en cualquier caso,
	 * además, se suma 10€ por gastos de envío. El método recibe un objeto Producto
	 * y devuelve el precio final. Crea la clase necesaria. (ALTERNATIVO) 2.2 Método
	 * que reciba un número y devuelva si es primo o no. Un número primo es aquel
	 * solo puede dividirse entre 1 y si mismo
	 */

	/* El metodo calcula el factorial al numero que le introduzcas */

	public static void calcularFactorial(int numero) {
		int resultado;

		resultado = numero;
		while (numero > 0) {
			resultado *= numero;
			numero--;
		}
		System.out.println(resultado);
	}

	/*Al introducir el numero te imprime si es primo o no */
	public static void esPrimo(int numero) {
		boolean resultado = true;
			
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			resultado = false;;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				resultado = false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		
		if (resultado = true) {
			System.out.println("El numeor es primo");
		}else {
			System.out.println("El numero no es primo");
		}
	}
}
