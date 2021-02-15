/**
 * 
 */

/**
 * @author jluch
 *
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RandomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aleatorio Generador = new Aleatorio();
		int len = Generador.generarLen();
		int i = 0;
		String input = "";
		
		try {
		      FileWriter myWriter = new FileWriter("random.txt");
		      while(i < len){
					input = Generador.numeroRandom();
					myWriter.write(input);
					myWriter.write("\r\n");
					i = i + 1;
				}
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
