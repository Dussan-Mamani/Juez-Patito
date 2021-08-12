# Juez-Patito

Descripción:
Botas planea visitar varios museos en un solo día, para ello tiene una lista de las ubicaciones de los museos, los museos se encuentran todos sobre una línea recta, ¿cuál será la mínima distancia que debe caminar botas si quiere visitar todos los museos?, él puede empezar y terminar su recorrido en cualquier punto de la recta.
Por ejemplo:
Botas puede empezar en el punto 1 y terminar en el punto 7, recorrerá una distancia de 6, de cualquier otra manera no se puede obtener una distancia menor

Entrada:
La entrada consiste en varios casos de prueba, cada caso de prueba viene dado en dos líneas, la primera línea contiene un entero 1 <= N <= 100, la segunda línea contiene N enteros ai que indica que el museo i se encuentra en el punto ai.

Salida:
Para cada caso imprimir la mínima distancia que puede recorrer botas.

Ejemplo Entrada:
5
1 7 5 2 3

Ejemplo Salida:
6

# Código Java

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		ArrayList<Integer> c = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		while (leer.hasNext()) {
			int x = leer.nextInt();
			leer.nextLine();
			String [] l = leer.nextLine().split(" ");
			for (int i = 0; i < l.length; i++) {
				c.add(Integer.parseInt(l[i]));
			}
			Collections.sort(c);
			int r = c.get(c.size()-1)-c.get(0);
			System.out.println(r);
			c.clear();
		}
	}
}
