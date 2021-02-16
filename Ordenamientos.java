import java.util.ArrayList;
import java.util.Arrays;

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
    
    
    //------------------Gnome Sort------------------------------
    public Comparable[] gnomeSort(Comparable[] arr) 
    { 
		int i = 1;
		while(i<arr.length)
		{
			if(arr[i-1].compareTo(arr[i])<=0)
			{
				i++;
			}
			else
			{
				Comparable n = arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=n;
				if(--i==0)
				{
					i=1;
				}
			}
		}
		return arr;
    } 
    
    
    
    
    //-----------------QuickSort-----------------------------------
    public int partition(Comparable[] arr,int low,int high) 
    {
        Comparable pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j].compareTo(pivot)==-1) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                Comparable temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        Comparable temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public Comparable[] sort(Comparable[] arr,int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
        return arr;
    } 
	
    
    //-------------------Radix Sort------------------------
    public Comparable max(Comparable[] arr, int n){
        Comparable mayor = arr[0];
        for (int i=1; i<n; i++){
            if (arr[i].compareTo(mayor)==1){
                mayor = arr[i];
            }
        }
        return mayor;
    }
    public Comparable[] count(Comparable[] arr, int n, int exp){
        int[] fArray = new int[n]; 
        int i;
        int[] cArray = new int[10];
        Arrays.fill(cArray, 0);
        

        for (i=0; i<n; i++){
        	cArray[(((int)arr[i])/exp)%10]++; //guarda el conteo
        }
        // Cambiar la cuenta para que contenga la posicion actual del digito de salida
        for (i=1; i<10; i++){
        	cArray[i]+= cArray[i-1];
        }
        //Construir el array ordenado
        for (i=n-1; i>=0; i--){
        	fArray[cArray[((int)arr[i]/exp)%10]-1] = (int)arr[i];
        	cArray[((int)arr[i]/exp)%10]--;
        }
        //Copiar el array ordenado para que el original contenga el ordenado
        for (i=0; i<n; i++){
        	arr[i] = fArray[i];
        }
        return arr;
    }
    public Comparable[] radix(Comparable[] arr){
        int n = arr.length;
        //Encuentra el numero mayor 
        Comparable mayorm = max(arr, n);
        int mayormo= (int)mayorm;
        // Contar ordenando cada digito 
        for (int exp=1; mayormo/exp>0; exp*=10){
            count(arr, n, exp);
        }
        return arr;
    }
    
}
