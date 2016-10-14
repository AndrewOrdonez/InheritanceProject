
public class DirtyWork
	{
		static int q=0;
		static int r=0;
public static void question(int i,int j){
	q=i;
	r=j;
	System.out.print("if '");
	switch (i){
		case 0: System.out.print("Mountain m = new Mountain();");
		break;
		case 1:System.out.print("Mountain m = new Volcano();");
		break;
		case 2:System.out.print("Volcano m= new Mountain();");
		break;
		case 3:System.out.print("Volcano m= new Volcano();");
		break;
	}
	System.out.print("' And '");
		switch(j){
			case 0: System.out.print("m.erode();");
			break;
			case 1:System.out.print("m.obtainTourists();");
			break;
			case 2:System.out.print("m.explode();");
			break;
		}
	

	System.out.println("' are called, what will be printed out?");
	System.out.println("a:'The mountain erodes over time'\nb:'KABOOM!'\nc:'People come to see the views'\nd:'People come to see the lava'\ne:the compiler throws an error");
}
public static boolean checkQuestion(char ans){
	if (ans>96){
		ans=(char) (ans-32);
	}
	if (q==2){
		if (ans==69){
			return true;
		}
		else if (q==0&&r==2){
			return true;
		}
		else {return false;}
	}
	switch(ans){
		case 65:if (r==0){
			return true;
		}
		else {return false;}
	case 66:if((q==1||q==3)&&r==2){return true;}
	else {return false;}
		case 67:if (r==1&&q==0){
			return true;
		}
		else {return false;}
		case 68:if(r==1&&(q==1||q==3)){
			return true;
		}
		else {return false;}
		
		default: System.out.println("You did not give a valid answer");
		return false;
	}
}
	}



























