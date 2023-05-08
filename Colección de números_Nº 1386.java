# Juez-Patito

Descripción:
S x : guarda una copia de un numero x.
A   : Imprime el número más grande.
R   : extrae el numero más grande.
I x : incrementa el numero más grande en x.
D x : decrementa el numero más grande en x.
T   : termina la entrada.

Entrada:
La entrada consiste de muchas operaciones.

Salida:
Muestre los resultados al procesar la secuencia de instrucciones.

Ejemplo Entrada:
S 10
A
I 10
A
D 5
A
R
R
S 100
D 20 
S 20
S 20
A
I 5
A
T

Ejemplo Salida:
10
20
15
Error
80
85

# Codigo Java

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        while (scanner.hasNext()) {
            String operation = scanner.next();
            switch (operation) {
                case "S":
                    int num = scanner.nextInt();
                    queue.offer(num);
                    break;
                case "A":
                    if (queue.isEmpty()) {
                        System.out.println("Error");
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "R":
                    if (queue.isEmpty()) {
                        System.out.println("Error");
                    } else {
                        queue.poll();
                    }
                    break;
                case "I":
                    if (queue.isEmpty()) {
                        System.out.println("Error");
                    } else {
                        int increment = scanner.nextInt();
                        queue.offer(queue.poll() + increment);
                    }
                    break;
                case "D":
                    if (queue.isEmpty()) {
                        System.out.println("Error");
                    } else {
                        int decrement = scanner.nextInt();
                        queue.offer(queue.poll() - decrement);
                    }
                    break;
                case "T":
                    return;
            }
        }
    }
}
