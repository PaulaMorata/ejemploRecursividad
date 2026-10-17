
public class Recursividad {
	
	
	public int fiboRec(int n) throws Exception {
		if(n<0)
			throw new Exception();
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fiboRec(n-1) + fiboRec(n-2);
	}
	
	
	public int fiboIt(int n) throws Exception {
		if(n<0)
			throw new Exception();
		if(n==0)
			return 0;
		int fn1 = 0;
		int fn = 1;
		for (int i = 2;i<=n;i++) {
			int aux = fn+fn1;
			fn1=fn;
			fn=aux;
		}
		return fn;
		
	}
	
	
	
	public double aritmeticaRec(int n, double d, double a0) throws Exception {
		if(n<0)
			throw new Exception();
		if(n==0)
			return a0;
		return aritmeticaRec(n-1, d, a0)+d*n+a0;
	}
	
	
	public double aritmeticaIt(int n, double d, double a0) throws Exception {
		if(n<0)
			throw new Exception();
		double suma = a0;
		double ai = a0;
		for (int i = 1; i<=n; i++) {
			ai=ai+d;
			suma+=ai;
		}
		return suma;	
	}
	
	
	
	
	public double aritmeticaForm(int n, double d, double a0) throws Exception {
		if(n<0)
			throw new Exception();
		double an = d*n + a0;
		return (n+1)*(a0+an)/2;	
	}	

}
