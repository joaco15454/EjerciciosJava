package ejRecursividfad;
/*
 8. public static boolean esPar(int n) 
Indica si un número es par o no.
Observación: no usar el operador de resto, es decir, no vale usar n % 2 == 0. 
  */
public class EsParConRecursividad {
	public static boolean esPar(int n) {
		if (n==1) return false;
		if (n==0) return true;
		return esPar(n-2);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(esPar(16));
	}

}
