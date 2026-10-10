public class P1 {
	/**
	 * Determina cuántas veces aparece numero en la lista de enteros.
	 * @param lista lista de enteros en que buscamos
	 * @param numero número buscado
	 * @return número de veces que aparece numero en lista. Si numero no está en la lista, devuelve 0.
	 */
	public int cuantasVeces(int[]lista, int numero) {
		int contador = 0;
		for(int num: lista)
			if(num==numero)
				contador++;
		return contador;
	}
	
	/**
	 * Determina cuántas veces aparece numero en la lista de enteros.
	 * @param lista lista de enteros en que buscamos
	 * @param numero número buscado
	 * @return número de veces que aparece numero en lista. Si numero no está en la lista, devuelve 0.
	 */
	public int cuantasVecesRecursivo(int[]lista, int numero) {
		return cuantasVeces(lista,numero,0);
	}
	
	/**
	 * Determina, mediante recursividad, cuántas veces aparece numero en la lista de enteros, 
	 * desde cierto índice n.
	 * @param lista lista de enteros en que buscamos
	 * @param numero número buscado
	 * @param indice índice en el que se empieza a buscar
	 * @return número de veces que aparece numero en lista. Si numero no está en la lista, devuelve 0.
	 */
	private int cuantasVeces(int[]lista, int numero, int indice) {
		if(indice== lista.length)
			return 0;
		if(numero == lista[indice])
			return 1 + cuantasVeces(lista,numero,indice+1);
		return cuantasVeces(lista,numero,indice+1);
	}
}
