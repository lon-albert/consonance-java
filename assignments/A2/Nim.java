import java.util.Scanner;

public class NimGame {
	
	public static void main(String[] args){
		String player1, player2;
		int A, B, C, check=0;
		char pile1;
		char pile2;
		
		Scanner input = new Scanner(System.in);
		// take in names from users
		System.out.print("Player 1, enter your name: ");
		player1 = input.nextLine();
		
		System.out.print("Player 2, enter your name: ");
		player2 = input.nextLine();
		
		A = (int)(Math.random()*5 + 1);
		B = (int)(Math.random()*5 + 1);
		C = (int)(Math.random()*5 + 1);
		
		//Display the piles
		System.out.printf("\nA: %d\tB: %d\tC: %d\n", A, B, C);
		
    	do{
    		int remove;
			
	    	do{
	    		System.out.print("\n" + player1 + ", choose a pile: ");
			    pile1 = Character.toUpperCase(input.next().charAt(0));
			    switch(pile1){
			    case 'A':
			    	check=A;
			    	break;
			    case 'B':
			    	check = B;
			    	break;
			    case 'C':
			    	check = C;
			    	break;
			    }
			  }
			while(check==0);
			
		    System.out.printf("How many to remove from pile %c: ", pile1);
			remove = input.nextInt();

			switch(pile1){
			case 'A':
				A = A - remove;
				if(A < 0)
					A=0;
				break;
				
			case 'B':
				B = B - remove;
				if(B < 0)
					B=0;
				break;
				
			case 'C':
				C = C - remove;
				if(C < 0)
					C=0;
				break;	
			}
			
			System.out.printf("\nA: %d\tB: %d\tC: %d\n", A, B, C);
			
			switch(A +B + C ){
			case 0:
				System.out.println("\n" + player2 + ", there are no counters left, so you WIN!");
				continue;
			}
			do{
	    		System.out.print("\n" + player2 + ", choose a pile: ");
			    pile2 = Character.toUpperCase(input.next().charAt(0));
			    switch(pile2){
			    case 'A':
			    	check=A;
			    	break;
			    case 'B':
			    	check = B;
			    	break;
			    case 'C':
			    	check = C;
			    	break;
			    }
			  }
			
			while(check==0);
			
			System.out.printf("How many to remove from pile %c: ", pile2);
			remove = input.nextInt();
			
			switch(pile2){
			case 'A':
				A = A - remove;
				if(A < 0)
					A=0;
				break;
			case 'B':
				B = B - remove;
				if(B < 0)
					B=0;
				break;
			case 'C':
				C = C - remove;
				if(C < 0)
					C=0;
				break;
			}
			System.out.printf("\nA: %d\tB: %d\tC: %d\n", A, B, C);
			
			switch(A +B + C ){
			case 0:
				System.out.println("\n" + player1 + ", there are no counters left, so you WIN!");
				break;
			}
        }
		while((A+B+C)>0);
	}

}
