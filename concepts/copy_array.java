//copy array

import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		System.out.println("Enter number of first array's elements");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int firstArray[] = new int[n];
		System.out.println("Enter"+n+"Elements");
		for(int i = 0;i < n; i++){
			firstArray[i] = input.nextInt();
		}
		System.out.print("Enter number of second array's element");
		int n1 = input.nextInt();
		System.out.print("Enter"+n1+"Elements");
		int secondArray[] = new int[n1];
		for(int i = 0; i<n1; i++){
			secondArray[i] = input.nextInt();
		}
		int[] result = new int[n+n1];

		System.arraycopy(firstArray, 0, result, 0, n);
		System.arraycopy(secondArray, 0, result, n, n1);
		System.out.print(Arrays.toString(result));
		input.close();
	}
}