package ejRecursividfad;
/*
 2.

Escribir una función recursiva int cantApariciones(String s, char c) 
que dada una cadena s 
y un caracter c, devuelve la cantidad de veces que aparece c en s.

Por ejemplo:

cantApariciones(''anana", 'a') debe devolver 3.

Se pide resolver utilizando recursión. 
Se pueden dar por hecha la función String resto(String s) 
que devuelve una cadena igual a s pero sin su primer caracter. 
 * */
public class LetrasRepetidas {
	public static int prodCifras(int n) {
	    // Caso base
	    if (n == 0) {
	        return 1;
	    }
	    
	    // Caso recursivo
	    int lastDigit = n % 10;
	    int prod = prodCifras(n / 10);
	    
	    if (lastDigit == 0) {
	        return prod;
	    }
	    
	    return lastDigit * prod;
	}
			
	public static boolean estanIncluidos(String s1, String s2) {
	    // Caso base: si s1 es una cadena vacía, se considera que está incluida
	    if (s1.length() == 0) {
	        return true;
	    }
	    
	    // Caso base: si s2 es una cadena vacía y s1 no lo es, se considera que no está incluida
	    if (s2.length() == 0) {
	        return false;
	    }
	    
	    // Caso recursivo: si el primer caracter de s1 está en s2, se realiza una llamada recursiva con s1 y s2 sin ese caracter
	    if (s1.charAt(0) == s2.charAt(0)) {
	        return estanIncluidos(s1.substring(1), s2.substring(1));
	    }
	    
	    // Caso recursivo: si el primer caracter de s1 no está en s2, se realiza una llamada recursiva con s1 y s2 sin el primer caracter de s2
	    return estanIncluidos(s1, s2.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(estanIncluidos("hola","chola"));
	}

}
