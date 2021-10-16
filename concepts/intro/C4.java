public class Main{
	public static void main(String[] args){
		//array
		String[] c = {"v","e","t","y"};
		System.out.println(c[0]);
		System.out.println(c.length);
		for(int i = 0; i< c.length; i++){
			System.out.println(c[i]);
		}

		for(String i:c){
			System.out.println(i);
		}

		//multidimensional

		int[][] mat = {{1,2,3},{1,2,3}};
		System.out.println(mat);


		int [][] myNumbers = {{1,2,3,4},{5,6,7}};
		for(int i = 0; i<myNumbers.length; ++i){
			for(int j = 0; j<myNumbers[i].length; ++j){
				System.out.println(myNumbers[i][j]);
			}
		}
	}	
}