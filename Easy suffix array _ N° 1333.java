# Juez-Patito

Descripción:
En Ciencias de la Computación un arreglo de sufijos es un arreglo ordenado de todos los sufijos de una cadena dada. Esta estructura de datos es muy simple, pero sin embargo es muy poderosa y es usada en algoritmos de compresión de datos y dentro del campo de la bioinformática , indización de textos completos, entre otros.
Por ejemplo dada la cadena "banana" los sufijos de esta cadena son:

-"banana"
-"anana"
-"nana"
-"ana"
-"na"
-"a"
Y si los ordenamos lexicograficamente tendriamos:

"a"
"ana"
"anana"
"banana"
"na"
"nana"
El array {"a", "ana", "anana", "banana", "na", "nana"} seria el suffix array de la cadena "banana".
Te pedimos obtener el suffix array de una cadena dada en la entrada, existen algoritmos muy eficientes para obtener el suffix array de una cadena pero en esta ocasión no estamos interesados en ellos.

Entrada:
Una sola cadena S sin espacios de longitud N (1<=N<=100). La cadena solo consta de letras minusculas.

Salida:
N cadenas, una cadena en cada linea, las cuales representan el suffix array de la cadena de la entrada.

Ejemplo Entrada:
banana

Ejemplo Salida:
a
ana
anana
banana
na
nana

# Código Java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String s = leer.next();

		String [] Sufijos = new String[s.length()];	
		String SufijoActual = "";

		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			SufijoActual = c + SufijoActual;
			Sufijos[i] = SufijoActual;
		}
		
		int n = s.length();

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (esMenor(Sufijos[j], Sufijos[i])) {
					String aux = Sufijos[j];
					Sufijos[j] = Sufijos[i];
					Sufijos[i] = aux;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(Sufijos[i]);
		}
	}
	
	public static boolean esMenor(String a, String b){
		for (int i = 0; i <Math.min(a.length(), b.length()); i++) {
			char da=a.charAt(i);
			char db=b.charAt(i);
			if (da>db) {
				return false;
			}
			else{
				if (da<db) {
					return true;
				}
			}
		}
		return a.length() <= b.length();
	}
}
