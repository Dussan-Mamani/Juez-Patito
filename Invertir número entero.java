# Juez-Patito

Descripción:
Invertir número entero

Entrada:
Invertir número entero ingresado por teclado

Salida:
Mostrar los números invertidos ingresados por teclado

Ejemplo Entrada:
1234

Ejemplo Salida:
4321

# Codigo Java

import java.util.*;public class Main
{
	public static void main(String[] args)
	{
		Scanner lee = new Scanner(System.in);
		int n,inv=0,r=0;
		n=lee.nextInt();
		while(n>0){
			r=n%10;
			inv=inv*10+r;
			n/=10;
		}
		System.out.println("Numero invertir "+inv);
	}
}
