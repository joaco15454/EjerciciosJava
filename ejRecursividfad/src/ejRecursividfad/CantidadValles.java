package ejRecursividfad;
/*
 Escribir una funcion int cantidadValles (String s) que dada una cadena s devuelva la cantid de valles que contiene. Subcadena longitudes iguales <2; 
  */
public class CantidadValles {
	static int cantidadValles(String s) {
		if (s.length() <= 1) return 0;
		else if (s.charAt(0) == s.charAt(1)) {
			return 1 + cantidadValles (s.substring(2));
		}
		else {
			return cantidadValles(s.substring(1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cantidadValles("Hoolaa"));
	}

}
