public class Main{
	public static void main(String[] args){
		for(int i=0; i<10; i++){
			if(i == 4){
				break;
			}
			System.out.println(i);
		}
		for(int i = 0; i<10; i++){
			if(i==4){
				continue;
			}
			System.out.println(i);
		}

		int i = 10;
		while(i < 10){
			System.out.println(i);
			i++;
			if(i == 4){
				break;
			}
		}
	}	
}