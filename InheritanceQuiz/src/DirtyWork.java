
public class DirtyWork
	{
		static int q=0;
		static int r=0;
public static void question(int i,int j){
	q=i;
	r=j;
	System.out.println("if '");
	switch (i){
		case 0: System.out.println("Mountain m = new Mountain();");
		break;
		case 1:System.out.println("Mountain m = new Volcano();");
		break;
		case 2:System.out.println("Volcano v= new Mountain();");
		break;
		case 3:System.out.println("Volcano v= new Volcano();");
		break;
	}
	System.out.println("' And '");
	if (i<2){
		switch(j){
			case 0: System.out.println("m.erode();");
			break;
			case 1:System.out.println("m.obtainTourists();");
			break;
			case 2:System.out.println("m.explode();");
			break;
		}
	}
	else{
		switch(j){
		case 0: System.out.println("v.erode();");
		break;
		case 1:System.out.println("v.obtainTourists();");
		break;
		case 2:System.out.println("v.explode();");
		break;
		}
	}
	System.out.println("' Is called, what will be printed out?");
	System.out.println("a:'The mountain erodes over time'\nb:'KABOOM!'\nc:'People come to see the views'\nd:'People come tosee the lava'\ne:the compiler throws an error");
}
public static boolean checkQuestion(char ans){
	if (ans>96){
		ans=(char) (ans-32);
	}
	if (q==2){
		
	}
	switch(ans){
		case 65:if (r==0){
			return true;
		}
		else 
			break;
		case 66:
			break;
		case 67:
			break;
		case 68:
			break;
		case 69:if (q==2){
			return true;
		}
			break;
		default: System.out.println("You did not give a valid answer");
		return false;
	}
}
	}
