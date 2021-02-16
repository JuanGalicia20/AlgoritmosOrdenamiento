import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenamientoTest {

	@Test
	public void testBubbleSort() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.bubbleSort(tester);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}
	
	@Test
	public void testSortGivenArray() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.sortGivenArray(tester);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}
	
	@Test
	public void testGnome() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.gnomeSort(tester);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}
	
	@Test
	public void testQuickSort() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.sort(tester,0,tester.length-1);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}
	
	@Test
	public void testRadix() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.radix(tester);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}

}
