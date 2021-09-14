import java.util.Scanner;

class Main{
	public static void createarray(int arr[]){
		int array[] = new int[5];

		array[0] = 10;
		array[1] = 13;
		array[2] = 14;
		array[3] = 15;
		array[4] = 10;

		System.out.println("Print arrays with index");
		System.out.println(array[1]);


		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}

		Scanner input = new Scanner(System.in);

		System.out.print("No of elements");
		int n = input.nextInt();

		int array_input[] = new int[n];
		System.out.println("Enter"+n+"elements");
		for(int i = 0; i < n; i++){
			array_input[i] = input.nextInt();
		}

		System.out.println("Showing the array with loop");
		for(int i = 0; i < n; i++){
			System.out.println("\t" + array_input[i]);
		}
		input.close();

		System.out.println("receiving array as a parameter");
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		
	}

	public static void main(String args[]){
		createarray(new int[] {10, 20, 40, 30});
	}
}