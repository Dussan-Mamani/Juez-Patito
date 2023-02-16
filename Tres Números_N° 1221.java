# Juez-Patito

Descripción:
Escriba un programa que lee tres numeros enteros separados por un espacio y los imprima en una linea separados por un espacio en forma ordenada de menor a mayor.

Entrada:
La entrada consiste de tres números enteros separados por un espacio.

Salida:
La salida consiste de los números impresos de menor a mayor.

Ejemplo Entrada:
3 1 2

Ejemplo Salida:
1 2 3

# Código Java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int a,b,c;
       a=leer.nextInt();
       b=leer.nextInt();
       c=leer.nextInt();
       if(a<=b && b<=c){
           System.out.print(a+" "+b+" "+c);
       }else{
           if(a<=c && c<=b)
               System.out.print(a+" "+c+" "+b);
           else{
               if(b<=a && a<=c)
                   System.out.print(b+" "+a+" "+c);
               else{
                   if(b<=c && c<=a)
                       System.out.print(b+" "+c+" "+a);
                   else{
                       if(c<=a && a<=b)
                           System.out.print(c+" "+a+" "+b);
                       else{
                           if(c<=b && b<=a)
                               System.out.print(c+" "+b+" "+a);
                       }
                   }
               }
           }
       }
    }
}
