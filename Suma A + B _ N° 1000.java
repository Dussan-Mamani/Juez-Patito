# Juez-Patito

Descripción :
El problema trata de sumar dos números

Entrada :
Se le darán dos números A y B.

Salida :
Imprimir A+B

Ejemplo Entrada :
1 2

Ejemplo Salida :
3

# Código Java

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int a,b,c;
		a=leer.nextInt();
		b=leer.nextInt();
		c=a+b;
		System.out.println(c);
	}
}
