# Juez-Patito

Descripción:
Dado un vector A de enteros se le pide ordenar todos los elementos del vector que se encuentran entre los indices I y J (incluidos los que se encuentran en I y J). Los indices del vector se manejan desde 0.

Entrada:
En la primera linea de la entrada se encuentran 3 enteros N, I, J (1<=N<=100, 0<=I<=J<=N−1) separados por un espacio.
En la segunda linea de la entrada N numeros enteros Ai separados por un espacio que son los elementos del vector A. (0 <= Ai <= 1000000)

Salida:
Los N elementos del vector A separados por un espacio despues de ordenar los elementos que se encuentran entre los indices I y J. Y un salto de linea al final de todos los numeros.

Ejemplo Entrada:
10 4 8
3 1 2 4 5 6 2 7 1 0

Ejemplo Salida:
3 1 2 4 1 2 5 6 7 0

# Código Java

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     Ordenar();
	}
	public static void Ordenar(){
		Scanner leer = new Scanner(System.in);
		  int n = leer.nextInt();
		  int q = leer.nextInt();
		  int t = leer.nextInt();
		  
		  int v [] = new int[n];
		  for (int i = 0; i < n; i++) {
			int x = leer.nextInt();
			v[i] = x;
		}
		 Arrays.sort(v,q,t+1);
		  
		  for (int i = 0; i < v.length; i++) {
				if (i!=v.length-1) {
					System.out.print(v[i]);
					if (i+1<v.length) {
						System.out.print(" ");
					}
				}
				else {
					System.out.print(v[i]+"\n");
				}
			}
		  }	
            }
