# Juez-Patito

Descripción:
Cocinar panqueques en una sartén es bastante complicado porque sin importar cuanto se esmere todos tendrán un diámetro diferente. 
Para la presentación de la pila usted los puede ordenar por tamaño de tal manera que cada panqueque es mas pequeño de los que están mas abajo. 
El tamaño esta dado por el diámetro. La pila se ordena por una secuencia de volteos. 
Un volteo consiste en insertar una espátula entre dos panqueques y volteando todos los panqueques en la espátula (colocando en orden reverso la subpila). 
Un volteo se especifica indicando la posición del panqueque en la base de la subpila a ser voleado. 
El panqueque de la base tiene la posición 1 y el de encima n.
La pila se especifica dando el diámetro de cada panqueque en orden en que aparecen. 
Por ejemplo considere las tres pilas de panqueques en el cual 8 es el panqueque encima de la pila de la izquierda.

8	7	2
4	6	5
6	4	8
7	8	4
5	5	6
2	2	7
  
La pila de la izquierda puede ser transformada a la pila del medio por volteo(3).
La del medio puede transformarse en la de la derecha con volteo(1).
\section{Entrada} La entrada consiste en secuencias de pilas de panqueques.
Cada pila consiste de 1 a 20 panqueques y cada panqueque tendrá un diámetro entero entre 1 y 100. la entrada se termina con un fin de archivo. 
Cada pila esta dada en una fila con el panqueque de arriba primero y el de la base al final. Todos ellos separados por un espacio.
  
Entrada:
La entrada consiste en secuencias de pilas de panqueques. Cada pila consiste de 1
a 20 panqueques y cada panqueque tendrá un diámetro entero entre 1 y 100.
la entrada se termina con un fin de archivo. Cada pila esta dada en una fila con el panqueque
de arriba primero y el de la base al final. Todos ellos separados por un espacio.
  
Salida:
Para cada pila de panqueques su programa debe imprimir la pila original en una línea seguido de una
secuencia de volteos que ordena la pila de panqueques de tal forma que el panqueque mas grande este abajo y el mas pequeño arriba.
la secuencia de volteos debe terminar con un 0 indicando que no se requieren mas volteos.
Cuando la pila esta ordenada no se deben realizar mas volteos

Ejemplo Entrada:
1 2 3 4 5
5 4 3 2 1
5 1 2 3 4
  
Ejemplo Salida:
1 2 3 4 5
0
5 4 3 2 1
1 0
5 1 2 3 4
1 2 0
  
# Codigo Java

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
 
public class Main {
     
    public static void invertir(int v[], int p) {
        Stack<Integer> pila = new Stack<Integer>();
        for (int i = p; i < v.length; i++) {
            pila.push(v[i]);
        }
        for (int i = p; i < v.length; i++) {
            v[i] = pila.pop();
        }
    }
 
    public static void volt(int v[], int p) {
        Stack<Integer> pila = new Stack<Integer>();
        for (int i = v.length - 1; i >= p; i--) {
            pila.push(v[i]);
        }
        for (int i = v.length - 1; i >= p; i--) {
            v[i] = pila.pop();
        }
 
 
    }
 
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int cont=0;
        while (sc.hasNext()) {
            String x[] = sc.nextLine().split(" ");
            int vec[] = new int[x.length];
            int com[] = new int[x.length];
            int in[] = new int[x.length];
            int pos = 0;
            double p = 0;
             
            for (int i = x.length - 1;i >= 0;i--) {
                in[i] = Integer.parseInt(x[pos]);
                vec[i] = Integer.parseInt(x[pos]);
                pos++;
                p++;
            }
            Arrays.sort(in);
            int pos2 = 0;
            int i1 = in.length - 1;
            while (i1 >= 0) {
                com[pos2] = in[i1];
                pos2++;
                i1--;
            }
            int r = 0;
            boolean sw = true;
            int idx = 0;
            int i2 = 0;
            while (i2 < x.length) {
                if (i2 != x.length - 1) {
                    System.out.print(x[i2] + " ");
                } else {
                    System.out.print(x[i2] + "\n");
                    p--;
                }
                cont--;
                i2++;
            }
            int s = 0;idx = 0;
            int i3 = 0; 
            while(i3 < vec.length && s < vec.length) {
 
                if (com[idx] == vec[i3] && sw) {
                    idx++;
                    s++;
                } else {
                    if (com[idx] != vec[i3]) {
                        if (com[idx] == vec[vec.length - 1]) {
                            volt(vec, s);
                            int sol=s+1;
                            System.out.print(sol + " ");
                            s = 0;
                            idx = 0;
                            i3 = -1;
                            p--;
                        } else {
                            sw = false;
                        }
 
                    } else {
                        if (com[idx] == vec[i3]) {
                            invertir(vec, i3);
                            System.out.print((i3 + 1) + " ");
                            volt(vec, s);
                            int sol=s+1;
                            System.out.print(sol + " ");
                            s = 0;
                            sw = true;
                            idx = 0;
                            i3 = -1;                             
                        }
                    }
                    cont--; 
                }
                i3++;
            }
            System.out.print("0\n");
        } 
    }
}
