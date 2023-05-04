# Juez-Patito 

Descripción:
En la Escuela de poderes ACM Miguelito fue a luchar contra su Centro de Estudiantes, por su falta de seriedad a la hora de repartir galletas (es un problema muy serio en los centros de estudiantes de todo el mundo).

Existían N
 dinosaurios cada uno con varios poderes. Habrá Q
 rondas para luchar y en cada ronda se variará el poder de Miguelito

Con el poder Miguelito puede hacer dormir a todos los dinosaurios cuyo poder sea menor o igual a M
 (≤M
). Después de cada ronda, despertaran todos los dinosaurios que estén durmiendo en la ronda anterior.

Tal que en cada ronda habrá N
 dinosaurios dispuestos para luchar. Como Miguelito es débil en matemáticas, ayúdalo a contar la cantidad de dinosaurios que puede hacer dormir en cada ronda y la suma total de sus poderes.

Definición de Dinosaurio:

Persona que se niega a graduarse de la escuela de poderes ACM

Entrada:
La entrada consiste en un número N
 (1≤N≤10000
), donde es el número de dinosaurios con los que tiene que combatir Miguelito, seguido de N
 enteros, donde el i-esimo numero son los poderes de cada dinosaurio. (1≤poder−de−cada−dinosaurio≤100
)

Un numero Q
 (1≤Q≤10000
) que es el número de rondas que se van a realizar, seguidos de Q
 enteros que representan el nivel de poder que tendrá Miguelito en esa ronda. (1≤potencia−de−Miguelito≤100
)

Salida:
Para cada ronda imprima dos enteros, separados por un espacio 

Donde:

El primer número es la cantidad de dinosaurios 

El segundo número es la suma de sus poderes de los dinosaurios que venció

Ejemplo Entrada:
7
1
2
3
4
5
6
7
3
3
10
2

Ejemplo Salida:
3 6
7 28
2 3

#Codigo java

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v[]=new int [n];
		for (int i = 0; i < n; i++) {
			v[i]=sc.nextInt();
		}
		int q;
		q=sc.nextInt();
		for (int i = 0; i < q; i++) {
			int nd=0,sp=0;
			int m;
			m=sc.nextInt();
			for(int j=0;j<n;j++){
				if (m>=v[j]) {
					nd++;
					sp=sp+v[j];
				}
			}
			System.out.println(nd+" "+sp);
		}
	}
}
