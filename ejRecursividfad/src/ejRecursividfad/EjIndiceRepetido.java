package ejRecursividfad;
/*
 Escribir una función recursiva String coincidenXPosicion(String s, String t)
 que dadas dos cadenas s y t retorna una nueva cadena compuesta por los caracteres 
 que están en ambas cadenas y en las mismas posiciones de s y t. 
  
 * */
public class EjIndiceRepetido {
	static String coincidenXPosicion(String s, String t) {
		if (s.length() == 0) return s;
		if (s.charAt(0) == t.charAt(0)) return s.charAt(0) + coincidenXPosicion(s.substring(1), t.substring(1));
		else {
			return coincidenXPosicion(s.substring(1), t.substring(1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coincidenXPosicion("Alba","Acaa"));
	}

}
