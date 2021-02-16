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
		//Genera el archivo txt con numeros aleatorios
		Aleatorio Generador = new Aleatorio();
		int len1 = Generador.generarLen();
		int j = 1;
		String input = "";
		//Crea el archivo
		try {
		      FileWriter myWriter = new FileWriter("random.txt");
		      while(j < len1){
					input = Generador.numeroRandom();
					myWriter.write(input);
					myWriter.write("\r\n");
					j = j + 1;
				}
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		//Lee el archivo generado
		Ordenamientos ordenador = new Ordenamientos();
		Comparable[] lista = new Comparable[3000];
		int insert;
		
		
		try {
            FileReader reader = new FileReader("random.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                insert = Integer.valueOf(line);
                int x = 0;
                System.out.println(x);
                lista[x]=insert;
                x++;
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println(lista);
		ordenador.bubbleSort(lista);
		System.out.println(lista);
		int len = lista.length;
		int i = 0;
		int ordenado;
		String insertar;
		
		try {
		      FileWriter myWriter = new FileWriter("randomOrdenado.txt");
		      while(i < len){
		    	  ordenado = (int) lista[i];
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
