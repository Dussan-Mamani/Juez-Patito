# Juez-Patito

Descripción :
Escribe la respuesta correspondiente por cada caso planteado en el problema, una respuesta por cada linea, no todas las respuestas en la misma linea, no todas las respuestas separadas con espacio. UNA respuesta por cada linea en el cuadro habilitado.
Dada una sucesión de números naturales comenzando en uno y terminando en X. Definimos el centro de la misma al numero que cumple con la condición que los números de la izquierda suman igual a los numero de la derecha.
Por ejemplo la serie 1,2,3,4,5,6,7,8 tiene la propiedad que los números a la izquierda del 6 suman 15=1+2+3+4+5 y es igual a la suma de los números a su derecha 7+8. Entonces decimos que el 6 es el centro medio.

Entrada :
La entrada consiste de un numero 1 <= n <= 10000000 que representa el número del último elemento de la serie. La entrada termina cuando no hay más datos.

Salida :
La salida consiste de la palabra "NO" si no existe un centro medio o el número que representa el centro, como se definió.

Ejemplo Entrada :
8
9

Ejemplo Salida :
6
NO

# Código Java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner leer = new 	Scanner(System.in);
	int n;
	while (leer.hasNext()) {
		n=leer.nextInt();
		int a=0, b=n;
		
		while (b-a>1) {
			int mid = (a+b)/2;
			 long sumiz = f(mid-1);
			long sumder = f(n) - f(mid);
			if (sumiz >= sumder) {
				b=mid;
			}
			else{
				a=mid;
			}
		}
		long totaliz = f(b-1);
		long totalder = f(n) - f(b);
		
		if (totaliz != totalder) {
			System.out.println("NO");
		}
		else{
			System.out.println(b);
		}
	}
	}
	public static long f(long n){
		return n*(n+1)/2;
	}
}
