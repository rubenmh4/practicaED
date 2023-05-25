package pracED;

@author 
public class Bloque2 {

	/*2.1 Método que nos calcule el factorial de un número, le pasamos el número
como parámetro. Para calcular el factorial, se multiplica los números anteriores
hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta operación
5*4*3*2*1=120.
2.2 Crea un método que reciba un producto y si este cuesta más de 300 euros,
añadirle un 16% de recargo, en cualquier caso, además, se suma 10€ por
gastos de envío. El método recibe un objeto Producto y devuelve el precio final.
Crea la clase necesaria.
(ALTERNATIVO) 2.2 Método que reciba un número y devuelva si es primo o
no. Un número primo es aquel solo puede dividirse entre 1 y si mismo*/

	
	/*El metodo calcula el factorial al numero que le introduzcas*/
	
	public void calcularFactorial(int numero) {
		int resultado ;
		
		resultado = numero;
		while(numero > 0 ) {
			resultado *= numero;
			numero--;
		}
		System.out.println(resultado); 
	}
	
	
}
