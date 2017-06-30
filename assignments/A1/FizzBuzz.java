public class FizzBuzz {
	
	public static void main(String[] args){
		fizzBuzz();
	}
	
	public static void fizzBuzz(){
		String number;
		
		for(int num = 0; num < 101; num++){
			if(num % 3 != 0 && num % 5 != 0)
				number = num + "";
			else if(num % 3 == 0 && num % 5 != 0)
				number = "fizz";
			else if(num % 3 != 0 && num % 5 == 0)
				number = "buzz";
			else
				number = "fizzbuzz";
			
		System.out.println(number);
		}
		
		
	}
}
