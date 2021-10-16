public class Main{
	public static void main(String[] args){
		
		String name="Java string ";
		int number = 5;
		boolean bool = true;
		System.out.println("Hello world");
		System.out.println(name + bool);
		System.out.println(number*number);

		//type casting
		int myInt = 9;
		double myDouble = myInt;

		System.out.println(myInt);
		System.out.println(myDouble);

		String txt = "ABCDEFGYWE";
		System.out.println(txt.length());
		System.out.println(Math.random() * 3);

		String cars[] = {"a","b","c"};
		for (String j: cars){
			System.out.println(j);
		}

		String f = "John";
		String l = "Doe";
		String nam = f.concat(l);
		System.out.println(nam);

		//sequence \\
		String text = "It\'s good";
		System.out.println(text);

		//Javamath
		System.out.println(Math.max(105, 1001));
		System.out.println(Math.random());
		System.out.print((int)(Math.random() * 101));
		}	
}