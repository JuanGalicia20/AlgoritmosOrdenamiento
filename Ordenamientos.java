import java.util.ArrayList;

public class Ordenamientos {

	public ArrayList<Integer> bubbleSort(ArrayList<Integer> lista)
	{
		int n = lista.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (lista.get(j) > lista.get(j+1)) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = lista.get(j);
                    lista.set(j, j+1);
                    //lista.get(j) = lista.get(j+1);
                    lista.set(j+1, temp);
                    //lista.get(j+1) = temp; 
                }
        return lista;
	}
	
	/**
	 * Método que utiliza recursividad para ordenar arreglos
	 * @param list lista desordenada
	 * @return merge(left, right) funcion que devuelve la lista ordenada
	 */
	public ArrayList<Integer> merge_sort(ArrayList<Integer> list) {
		//Si el arreglo tiene 0 o 1 elementos ya está ordenado.
		if(list.size() <= 1) {
			return list;
		}
		
		//Se crean dos arreglos, uno para el lado izquierdo del arreglo, otro para el derecho.
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		//Ciclo for para que la primera parte del arreglo list vaya a la izquierda y el resto a la derecha
		for(int i = 0; i < list.size(); i++) {
			if(i < list.size()/2) {
				left.add(list.get(i));
			}
			else {
				right.add(list.get(i));
			}
		}
		
		//Aplicando recursividad se hace el mismo proceso para los arreglos de izquierda y derecha
		left = merge_sort(left);
		right = merge_sort(right);
		
		return merge(left, right);
			
	}
	
	/**
	 * Método para unir dos arreglos a uno mismo ordenandolos
	 * @param left
	 * @param right
	 * @return arreglo ordenado y fusionado
	 */
	public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
		//Arreglo donde se fusionaran los arreglos de izquierda y derevha
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		//Ciclo que funciona mientras los arreglos de izquierda y derecha aun tengan valores
		while(left.size() > 0 & right.size() > 0) {
			
			//Condicion si el primer valor de izquierda es menor o igual al de derecha
			if(left.get(0).compareTo(right.get(0)) != 1) {
				
				//Se añade este valor al arreglo de result
				result.add(left.get(0));
				
				//Se remueve este valor del arreglo de izquierda para pasar con el siguiente
				left.remove(0);
			}
			
			//Si el valor de derecha es mayor al de izquierda
			else {
				
				//Se añade este valor al arreglo de result
				result.add(right.get(0));
				
				//Se remueve este valor del arreglo de derecha para pasar con el siguiente
				right.remove(0);
			}
		}
		
		//Ciclo que funciona cuando izquierda tenga valores pero derecha no
		while(left.size() > 0) {
			
			//Se añade el primer valor al arreglo de result
			result.add(left.get(0));
			
			//Se remueve este valor del arreglo de izquierda
			left.remove(0);
		}
		
		//Ciclo que funciona mientras derecha tenga valores pero izquierda no
		while(right.size() > 0) {
			
			//Se añade el primer valor al arreglo de result
			result.add(right.get(0));
			
			//Se remueve este valor del arreglo de derecha
			right.remove(0);
		}
		return result;
	}
	
	/**
	 * Metodo para ordenar arreglos utilizando algoritmo Gnome
	 * @param array arreglo desordenado
	 */
	public void gnome_sort(Integer[] array) {
		
		//Ciclo que se mantiene mientras i sea menor que el numero de elementos del arreglo
		for(int i = 1; i < array.length;) {
			
			//Condicion si el valor en indice i-1 es menor o igual al valor en indice i
			if(array[i-1].compareTo(array[i]) != 1){
				
				//Pasa al siguiente valor en la lista ya que esta pareja ya está ordenada
				i++;
			}
			
			//Condicion si el valor del indice i-1 es mayor al valor en indice i
			else {
				
				//Se crea variable temporal tipo Integer
				Integer temp;
				
				//La variable temporal toma el valor del indice i -1
				temp = array[i-1];
				
				//El valor en indice i-1 toma el valor en indice i
				array[i-1] = array[i];
				
				//El valor en indice i toma el valor temporal
				array[i] = temp;
				
				//Se reduce i en 1 para revisar la pareja anterior ya que estos valores intercambiaron
				i--;
			}
			
			//Condición en caso i llegue a ser 0
			if(i == 0) {
				
				//Ya que se evalua el indice i-1, esto daría error, entonces nuevamente i = 1
				i = 1;
			}
			
		}
	}
	
	
}
