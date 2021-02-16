import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OrdenamientoTest {

	@Test
	public void testBubbleSort() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.bubbleSort(tester);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}
	
	public void testSortGivenArray() {
		Ordenamientos test = new Ordenamientos();
		Comparable[] tester = new Comparable[] {43,15,32,70,8};
		Comparable[] run = test.sortGivenArray(tester);
		Comparable[] testing = new Comparable[] {8,15,32,43,70};
		assertArrayEquals(testing ,run);
	}
	

}
