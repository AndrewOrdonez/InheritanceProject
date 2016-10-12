
public abstract class Weapons
	{
protected boolean dirty;
protected String cleaningTools;
protected int range;
public abstract void usage();
public void cleaning() {
	if (dirty==false){
		System.out.println("The weapon was already clean");
	}
	if (dirty==true){
		System.out.println("You cleaned the weapon using a(n) "+cleaningTools+".");
		dirty=false;
	}
}

	}	
