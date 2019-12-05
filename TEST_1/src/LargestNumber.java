import java.util.*; 
public class LargestNumber {
public static void main(String[] args) {
	int arr[] = {8,5,7,2};
	int len= arr.length;
	int x = MaxNum(arr,len);
	System.out.println(x);
}
public static int MaxNum(int arr[], int len) { 
	Arrays.sort(arr);
	int num = arr[0];
	for(int i=len-1;i>=0;i--) {
		num= num*10+arr[i];
	}
	
  return num;
	
}
}
