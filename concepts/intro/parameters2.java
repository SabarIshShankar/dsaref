public class Main{
	static void checkAge(int age){
		if(age<18){
			System.out.println("not old");
		} else {
			System.out.println("old");
		}
	}
	public static void main(String args[]){
		checkAge(20);
	}
}