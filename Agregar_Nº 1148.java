# Juez-Patito

Descripción;
El nombre del problema refleja la tarea, sumar un conjunto de números. Usted puede estar pensando en un programa que solo sume los números, 
pero hay una pequeña condición que hay que cumplir. La operación de adición requiere un resultado "costo actual" que es la suma de los operandos. 
Por ejemplo si queremos sumar los elementos del conjunto 1,2y 3 hay varias formas de hacerlo en pares de dos:
Forma 1
1+2=3,costo actual =3
3+3=6,costo actual =6
             Total =9
Forma 2
1+3=4,costo actual =4
2+4=6,costo actual =6
             Total =10
Forma 3
2+3=5,costo actual =5
1+5=6,costo actual =6
            Total  =11
Espero que haya entendido nuestra misión y sumar el conjunto de enteros para que el costo sea mínimo.

Entrada:
Cada caso de prueba comienza con un numero entero positivo N (2≤N≤10000) seguido de N números enteros positivos menores a 100000. 
La entrada termina cuando el valor de N es 0.

Salida:
Por cada caso de entrada imprima el costo mínimo de adición en una sola línea.

Ejemplo Entrada:
3
1 2 3
4
1 2 3 4
0

Ejemplo Salida:
9
19

# Codigo Java

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		PriorityQueue<Integer> cp = new PriorityQueue<Integer>();
		int n = lee.nextInt();
		while(n != 0){
			cp = new PriorityQueue<Integer>();
			for (int i = 0; i < n; i++) {
				int x = lee.nextInt();
				cp.offer(x);
			}
			int costo = 0, total = 0;
			while(!cp.isEmpty()){
			   costo = cp.poll() + cp.poll();
			   total = total + costo;
			   if(!cp.isEmpty())
				   cp.offer(costo);
			}
			System.out.println(total);
			n = lee.nextInt();
		}
	}
}
