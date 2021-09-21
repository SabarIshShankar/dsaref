import java.util.Scanner;

class Main{
	static int MAX = 10;
	static void Reverse(int array[], int start, int end, int n){
		int temp;
		while(start < end){
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("\t\t\t\tReversed Array");
		for(int i = 0; i<n ; i++){
			System.out.println(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args){
		int array[] = new int[MAX];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of elements to be reversed");
		int n = input.nextInt();
		System.out.println("Enter elements to be rev");
		for(int i = 0; i<n; i++){
			array[i] = input.nextInt();
		}
		int start = 0;
		int size = n - 1;
		Reverse(array, start, size, n);
		input.close();
	} 
}