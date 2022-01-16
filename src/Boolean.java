
public class Boolean {
	public static void main(String []args) {
		/*
		int a = 0;
		boolean f = false;
		boolean t = true;
		boolean b = (a == 0);
		
		System.out.println(f);
		System.out.println(t);
		System.out.println(b);
		
		if(true){
			System.out.println("We are in the if statement");
		}
		*/
		
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean allDoorsPassed = false;
		int doorCount = 0;
		
		if(passedDoor) {
			System.out.println("We passed the fisrt door");
//			doorCount = doorCount + 1
			doorCount++;
		}
		
		if(missedDoor) {
			System.out.println("We passed the second door");
			doorCount++;
		}
		
		if(passedDoor) {
			System.out.println("We passed the third door");
			doorCount++;
		}
		
		if(doorCount == 3) {
			allDoorsPassed = true;
		} 
		
		if(allDoorsPassed) {
			System.out.println("You've passed all doors!");
		} else {
			System.out.println("You haven't passed the hole doors!");
		}
	}
}
