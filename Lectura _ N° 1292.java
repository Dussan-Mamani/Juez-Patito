# Juez-Patito

Descripción:
Se tiene una lista de números y te piden hallar la suma de los mismos. Se sabe que la suma no excede un numero entero.
Sugerencia
Verificar el fin de archivo preguntando si n es cero

Entrada:
La entrada consiste de múltiples casos de prueba.
Cada caso de prueba consiste de dos líneas, la primera linea tiene un numero M que representa la cantidad de números que hay que leer.
La segunda línea contiene los M números separados por un espacio.
Los casos de prueba terminan cuando M es cero.

Salida:
Por cada caso de prueba escrita en una linea la suma de los números.

Ejemplo Entrada:
4
1 2 3 4
10
9 8 7 6 5 4 3 2 1 -5
5
-1 -3 5 3 1
0

Ejemplo Salida:
10
40
5

# Código Java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Lectura();
	
	}
	
	public static void Lectura(){
		Scanner leer = new Scanner(System.in);
		while (leer.hasNext()) {
			int n = leer.nextInt();
			if (n==0) break;
				int s = 0;
				for (int i = 0; i < n; i++) {
					int x = leer.nextInt();
					s+=x;
				}
				System.out.println(s);
			}
		}
	}
