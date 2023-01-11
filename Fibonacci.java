# Juez-Patito

Descripción:
Realizar la série Fibonacci

Entrada: 
Resolver la serie Fibonacci, ingresado los valores por teclado

Salida:
Mostrar la serie Fibonacci, ingresado por teclado

Ejemplo Entrada:
8
-1
 1

Ejemplo Salida:
0 1 1 2 3 5 8 13

# Código Java

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner lee = new Scanner(System.in);
		int t,a,b,c;
		t=lee.nextInt();
		a=lee.nextInt();
		b=lee.nextInt();
		for(int i=0;i<t;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
    }
}
