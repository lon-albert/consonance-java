public class Dice {
	
	public static void main(String[] args){
		rollDice(2);
	}
	
	public static int rollDice(){
		int roll = (int)(Math.random() * 6 + 1);
		return roll;
	}
	
	public static void rollDice(int rollNo){
		int roll = rollDice();
		
		if(roll > rollNo)
			System.out.println("Invalid roll");
	}

}
