public class UsaRecursividad {
	public static void main(String[] args) throws Exception {
		Recursividad r = new Recursividad();
		int nFibo = 6;
		System.out.println("Elemento en la posición " + nFibo + " de Fibonacci, calculado de forma recursiva: " + r.fiboRec(nFibo));
		System.out.println("Elemento en la posición " + nFibo + " de Fibonacci, calculado de forma iterativa: " + r.fiboIt(nFibo));
		int a0 = 0;
		int d = 1;
		int nAritm = 3;
		System.out.println("Suma de los términos hasta el " + nAritm + "-ésimo, de una serie aritmética, calculado de forma recursiva: " + r.aritmeticaRec(nAritm,d,a0));
		System.out.println("Suma de los términos hasta el " + nAritm + "-ésimo, de una serie aritmética, calculado de forma iterativa: " + r.aritmeticaIt(nAritm,d,a0));
		System.out.println("Suma de los términos hasta el " + nAritm + "-ésimo, de una serie aritmética, calculado con la fórmula: " + r.aritmeticaForm(nAritm,d,a0));		
	}
}
