
public class NonRep {
	 static int firstNonRepeating(int arr[]){ 
	        for (int i = 0; i <arr.length; i++) { 
	            int j;
	            for (j = 0; j < arr.length; j++) 
	                if (i != j && arr[i] == arr[j]) {
	                	
	                    break;
	                }
	               if (j == arr.length) {
	                return arr[i]; 
	        }
	        }
	  
	        return -1; 
	        
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        int arr[] = { 6,6,6,7,7,77,9,9}; 
	      
	        System.out.print(firstNonRepeating(arr)); 
	    } 
}
