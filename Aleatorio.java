
/**
 * @author jluch
 *
 */
public class Aleatorio {
	
	public int randomInt (int min, int max) {
		  return (int) (Math.floor(Math.random() * (max - min) ) + min);
		}
	
	
	public int generarLen() {
		int len = randomInt(10,3000);
		return len;
		
	}
		
	public String numeroRandom() {
		int rand = randomInt(1,10000);
		String insert = String.valueOf(rand);
		return insert;	
			
	}

}
