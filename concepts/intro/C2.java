public class Main{
	public static void main(String[] args){
		if(4>15){
			System.out.println("Greater");
		} else {
			System.out.println("Lesser");
		}

		if(22<10){
			System.out.println("good morning");
		} else if(22<20) {
			System.out.println("good day");
		} else {
			System.out.println("Good evening");
		}

		//java switch
		int day = 4;
		switch(day){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("wed");
			break;
			case 4:
			System.out.println("thurs");
			break;
			default:
			System.out.println("no");
		}

		//while loop
		int i = 0;
		while (i < 5){
			System.out.println(i);
			i++;
		}

		do{
			System.out.println(i);
			i++;
		}
		while(i < 5);



		//for loop
		for (int j=0; j<5; j++){
			System.out.println(i);
		}
	}	
}