import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Reader {

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
		int x = 0;
		ArrayList<Integer> lista = new ArrayList<>();
		int insert;
		
		
		try {
            FileReader reader = new FileReader("random.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                insert = Integer.valueOf(line);
                lista.add(insert);
                x++;
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		int len = lista.size();
		int i = 0;
		Comparable ordenado;
		String insertar;
		
		try {
		      FileWriter myWriter = new FileWriter("randomOrdenado.txt");
		      while(i < len){
		    	  ordenado =  lista.get(i);
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
		
		Ordenamientos o = new Ordenamientos();
		Comparable[] lista2 = lista.toArray(new Integer[0]);
		int n = lista2.length; 
        for (int k=0; k<n; ++k) 
            System.out.print(lista2[k] + " "); 
        System.out.println();
		
        System.out.println("--------------------------\n\n");
        Comparable[] result = o.bubbleSort(lista2);
        for (int k=0; k<n; ++k) 
            System.out.print(lista2[k] + " "); 
        System.out.println();
	}
}
