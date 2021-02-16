import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Reader {

	/**
	 * Juan Galicia 20298
	 * José Andrés Lucha Nuila 18904
	 * Programa para calcular tiempo de ejecucion de algoritmos de ordenamiento
	 * 
	 * METODO PRINCIPAL DE EJECUCION
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
		
		System.out.println("Los numeros fueron generados con exito");
		Ordenamientos o = new Ordenamientos();
		Comparable[] lista2 = lista.toArray(new Integer[0]);
		Comparable[] l1=lista2;
		Comparable[] l2=lista2;
		Comparable[] l3=lista2;
		Comparable[] l4=lista2;
		Comparable[] l5=lista2;
		Scanner leer = new Scanner(System.in);
		int n = lista2.length; 
        for (int k=0; k<n; ++k) 
            System.out.print(lista2[k] + " "); 
        System.out.println();
		
        String op="";
        while(!op.equals("6"))
        {
        	System.out.println("Bienvenidos Seleccione una opcion para calcular el tiempo de ejecucion\n"
        			+ "Puede correr cada algoritmo con el array desordenado 1 vez, el array de cada uno es independiente"
            		+ "1.Bubble Sort\n"
            		+ "2.Merge Sort\n"
            		+ "3.Gnome Sort\n"
            		+ "4.Quick Sort\n"
            		+ "5.Radix Sort\n"
            		+ "6.Salir\n");
        	op=leer.next();
        	switch(op)
        	{
	        	case "1":
	        	{
	        		System.out.println("--------------------------\n\n");
	                Comparable[] result = o.bubbleSort(l1);
	                System.out.println("BUBBLE SORT:\n");
	                for (int k=0; k<n; ++k) 
	                    System.out.print(l1[k] + " "); 
	                System.out.println();
	                break;
	        	}
	        	case "2":
	        	{
	        		System.out.println("--------------------------\n\n");
	                Comparable[] result = o.sortGivenArray(l2);
	                System.out.println("MERGE SORT:\n");
	                for (int k=0; k<n; ++k) 
	                    System.out.print(l2[k] + " "); 
	                System.out.println();
	                break;
	        	}
	        	case "3":
	        	{
	        		System.out.println("--------------------------\n\n");
	                Comparable[] result = o.gnomeSort(l3);
	                System.out.println("GNOME SORT:\n");
	                for (int k=0; k<n; ++k) 
	                    System.out.print(l3[k] + " "); 
	                System.out.println();
	                break;
	        	}
	        	case "4":
	        	{
	        		System.out.println("--------------------------\n\n");
	                Comparable[] result = o.sort(l4,0,l4.length-1);
	                System.out.println("QUICK SORT:\n");
	                for (int k=0; k<n; ++k) 
	                    System.out.print(l4[k] + " "); 
	                System.out.println();
	                break;
	        	}
	        	case "5":
	        	{
	        		System.out.println("--------------------------\n\n");
	                Comparable[] result = o.radix(l5);
	                System.out.println("RADIX SORT:\n");
	                for (int k=0; k<n; ++k) 
	                    System.out.print(l5[k] + " "); 
	                System.out.println();
	                break;
	        	}
	        	case "6":
	        	{
	        		System.exit(0);
	        		 break;
	        	}
	        	default:
	        	{
	        		System.out.println("Ingrese un valor valido");
	        		 break;
	        	}
        	}
        }
	}
}
