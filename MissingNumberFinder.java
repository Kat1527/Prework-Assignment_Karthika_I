import java.util.Scanner;
class MissingNumberFinder {
public static int missingNumberFinder(int array[], int n) 
       {  
        int sum=((n)*(n+1))/2;
        for(int i=0; i<n-1; i++)
          sum-=array[i];
        return sum;
       }


public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();

	int[] arr = new int[size];
	
	
	for(int i=0; i<size-1; i++)
	arr[i] = in.nextInt();

	System.out.println(missingNumberFinder(arr, size));
       }
}

