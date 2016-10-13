import java.util.Scanner;
public class Quiz
	{

		public static void main(String[] args) throws InterruptedException
			{
Scanner scan=new Scanner(System.in);
System.out.println("Lets Take A Quiz!\nIt Will Be On Inheritance And Polymorphism!\nTo Submit an answer, type it's letter into the console and press enter.\nyou have five seconds to prepare yourself.");
	int correct = 0;
for (int i=5;i>0;i--){
	System.out.println(i);
	Thread.sleep(1000);
}
for (int i=0;i<4;i++){
	for(int j=0;j<3;j++){
		DirtyWork.question(i, j);
		String str=scan.next();
		char[] car=new char[10];
		str.getChars(0, 1, car, 0);
		if(DirtyWork.checkQuestion(car[0])){
			correct++;
		}
	}
}
System.out.println();
			
			
			}

	}
