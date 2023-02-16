# Juez-Patito

Descripción:
Se te pide que para un N dado generes las N elementos de la siguiente serie:
0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 5, 5, 8, 8, 13, 13, 21, 21, 34...

Entrada:
Se te dara un T (1 <= T <= 10) que son los numeros de casos, por cada caso se te dara un N (1 <= N <= 1000)

Salida:
Por cada caso de prueba, tienes que escribir los N primeros numeros de la serie

Ejemplo Entrada:
4
10
6
7
1

Ejemplo Salida:
0 0 1 1 1 1 2 2 3 3 
0 0 1 1 1 1 
0 0 1 1 1 1 2
0 

# Código Java

import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n, b;
			n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				b = sc.nextInt();
				int x = -1, y = 1, z = 0;
				for (int j = 0; j < b; j++) {
					z = x + y;
					System.out.print(z + " ");
					j++;
					if (j < b) {
						System.out.print(z + " ");
					}
					x = y;
					y = z;
				}
				System.out.println();
			}
		}
	}
