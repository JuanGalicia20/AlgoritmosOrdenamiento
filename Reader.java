import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author jluch
 *
 */
public class Reader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenamientos ordenador = new Ordenamientos();
		var lista = new Array(0);
		int insert;
		
		
		try {
            FileReader reader = new FileReader("random.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                insert = Integer.valueOf(line);
                lista.push(insert);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println(lista);
		Comparable[] c = new Comparable[] lista;
		Comparable[] result = ordenador.bubbleSort(c)
		System.out.println(result);
		int len = result.length;
		int i = 0;
		int ordenado;
		String insertar;
		
		try {
		      FileWriter myWriter = new FileWriter("randomOrdenado.txt");
		      while(i < len){
		    	  ordenado = result[i];
		    	  insertar = String.valueOf(ordenado);
					myWriter.write(insertar);
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
