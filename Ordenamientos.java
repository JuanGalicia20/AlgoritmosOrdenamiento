import java.util.ArrayList;

public class Ordenamientos {

	//-----------------------Bubble Sort----------------------------------------
	public Comparable[] bubbleSort(Comparable[] lista)
	{
		int n = lista.length;
		Comparable temp;
        for(int i=0; i<n;i++)
        {
        	for(int j=1;j<(n-i);j++)
        	{
        		if(lista[j-1].compareTo(lista[j])==1)
        		{
        			temp=lista[j-1];
        			lista[j-1]=lista[j];
        			lista[j]=temp;
        		}
        	}
        }
        return lista;
	}
    
	
	//-------------------------MERGE SORT------------------
 
    public Comparable[] sortGivenArray(Comparable[] inputArray){       
        inputArray=divide(0, inputArray.length-1, inputArray);
        return inputArray;
    }
    
    public Comparable[] divide(int startIndex,int endIndex, Comparable[] inputArray){
        
        //Divide till you breakdown your list to single element
        if(startIndex<endIndex && (endIndex-startIndex)>=1){
            int mid = (endIndex + startIndex)/2;
            divide(startIndex, mid, inputArray);
            divide(mid+1, endIndex,inputArray);        
            
            //merging Sorted array produce above into one sorted array
            inputArray=merger(startIndex,mid,endIndex, inputArray);
        }
        return inputArray;
    }   
    
    public Comparable[] merger(int startIndex,int midIndex,int endIndex, Comparable[] inputArray){
        
        //Below is the mergedarray that will be sorted array Array[i-midIndex] , Array[(midIndex+1)-endIndex]
        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();
        
        int leftIndex = startIndex;
        int rightIndex = midIndex+1;
        
        while(leftIndex<=midIndex && rightIndex<=endIndex){
            if(inputArray[leftIndex].compareTo(inputArray[rightIndex])==-1){
                mergedSortedArray.add((Integer) inputArray[leftIndex]);
                leftIndex++;
            }else{
                mergedSortedArray.add((Integer) inputArray[rightIndex]);
                rightIndex++;
            }
        }       
        
        //Either of below while loop will execute
        while(leftIndex<=midIndex){
            mergedSortedArray.add((Integer) inputArray[leftIndex]);
            leftIndex++;
        }
        
        while(rightIndex<=endIndex){
            mergedSortedArray.add((Integer) inputArray[rightIndex]);
            rightIndex++;
        }
        
        int i = 0;
        int j = startIndex;
        //Setting sorted array to original one
        while(i<mergedSortedArray.size()){
            inputArray[j]=mergedSortedArray.get(i++);
            j++;
        }
        return inputArray;
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
