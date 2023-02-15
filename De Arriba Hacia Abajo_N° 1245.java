# Juez-Patito

Descripción:
Escriba un programa que lea dos números X y Y luego imprima todo los números desde el mayor hasta el menor de ambos

Entrada:
La entrada consiste en dos números enteros X,Y

Salida:
En la salida escriba los números que se encuentran entre X,Y cada uno en una línea y en forma descendente 

Ejemplo Entrada:
3 7

Ejemplo Salida:
7
6
5
4
3

# Código Java 

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if(x<y){
			for(int i=y;i>=x;i--){
				System.out.println(i);
			}
		}else{
			for(int i=x;i>=y;i--){
				System.out.println(i);
			}
		}
	}
}
