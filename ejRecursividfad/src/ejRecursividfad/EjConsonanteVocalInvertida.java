package ejRecursividfad;
/*
 
 7.
Dada una cadena escribir un método usando recursividad 
String invierteConsVocal(String cadena) tal que cada vez 
que aparece un par de letras ‘consonante vocal’ las invierta 
para que queden ‘vocal consonante’.

 
  */
public class EjConsonanteVocalInvertida {
	public static String invierteConsVocal(String s) {
		if (s.length() <= 1) return s;
		if ((s.charAt(0) != 'A'  || s.charAt(0) != 'E' || s.charAt(0) != 'I' || s.charAt(0) != 'O' || s.charAt(0) != 'U') &&
			(s.charAt(1) ==	'A' || s.charAt(1) == 'E' || s.charAt(1) == 'I' || s.charAt(1) == 'U' || s.charAt(1) == 'O')) {
			return "" + s.charAt(1) + s.charAt(0) + invierteConsVocal(s.substring(2)) ;
		}
		else {
			return s.charAt(0) + invierteConsVocal(s.substring(1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(invierteConsVocal("OPACO"));
	}

}
