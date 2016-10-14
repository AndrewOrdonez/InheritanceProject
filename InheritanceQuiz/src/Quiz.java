import java.util.Scanner;
public class Quiz
	{

		public static void main(String[] args) throws InterruptedException
			{
Scanner scan=new Scanner(System.in);
System.out.println("Lets Take A Quiz!\nIt Will Be On Inheritance And Polymorphism!\nTo Submit an answer, type it's letter into the console and press enter.\n");
	int correct = 0;
	System.out.println("how many questions would you like to anser?");
	int que=scan.nextInt();
System.out.println("you have five seconds to prepare yourself.");
	for (int i=5;i>0;i--){
	System.out.println(i);
	Thread.sleep(1000);
}
				//see if you need to ask for questions
for (int i=0;i<que;i++){
		DirtyWork.question((int)(Math.random()*4), (int)(Math.random()*3));
		String str=scan.next();
		char[] car=new char[10];
		str.getChars(0, 1, car, 0);
		if(DirtyWork.checkQuestion(car[0])){
			correct++;
			System.out.println("correct");
		}
		else {System.out.println("incorrect");}
	Thread.sleep(750);
}
System.out.println(" you have finished, you got "+correct+" out of "+que+" correct");
			
			
			}

	}
