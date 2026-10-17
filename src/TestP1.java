import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestP1 {
	private P1 p1;
	private int[] listaVacia;
	private int[] lista;
	
	@Before
	public void setUp() {
		p1 = new P1();
		listaVacia = new int[0];
		// lista = {7,9,9,9,3,3}; // esta línea no compilaría, eentiendes por qué?
		lista = new int[6];
		lista[0] = 7; lista[1] = 9; lista[2] = 9;
		lista[3] = 9; lista[4] = 3; lista[5] = 3;		
	}
	
	@Test
	public void testCuantasVeces() {		
		assertEquals(0,p1.cuantasVeces(listaVacia, 0));
		assertEquals(0,p1.cuantasVeces(lista, 4));
		assertEquals(1,p1.cuantasVeces(lista, 7));
		assertEquals(2,p1.cuantasVeces(lista, 3));
		assertEquals(3,p1.cuantasVeces(lista, 9));
	}
	
	@Test
	public void testCuantasVecesRecursivo() {		
		assertEquals(0,p1.cuantasVecesRecursivo(listaVacia, 0));
		assertEquals(0,p1.cuantasVecesRecursivo(lista, 4));
		assertEquals(1,p1.cuantasVecesRecursivo(lista, 7));
		assertEquals(2,p1.cuantasVecesRecursivo(lista, 3));
		assertEquals(3,p1.cuantasVecesRecursivo(lista, 9));
	}
}
