import java.util.Scanner;
public class diceroll {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.print("How many times would you like the coin to be flipped?");
		int x=0;
		int flips= in.nextInt();
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		int seven=0;
		int eight=0;
		int nine =0;
		int ten=0;
		int eleven=0;
		int twelve=0;
		int dice1=0;
		int dice2=0;
		
		System.out.print("Here is the sequence of sums, one for each toss:");
		for(x=0;x<flips;x++){
			int sum =dice1+dice2;
        	dice1= (int)(Math.random()*6) + 1;
            dice2= (int)(Math.random()*6) + 1;
        	System.out.println(dice1+dice2+" ");
        	if (sum==2)two++;
        	else if(sum==3)three++;
        	else if(sum==4)four++;
        	else if(sum==5)five++;
        	else if(sum==6)six++;
        	else if(sum==7)seven++;
        	else if(sum==8)eight++;
        	else if(sum==9)nine++;
        	else if(sum==10)ten++;
        	else if(sum== 11)eleven++;
        	else twelve++;
		}
		System.out.print("Two:");
		for (x=0;x<two;x++)
    		System.out.print("*");
		System.out.println();
		
		System.out.print("Three:");
			for (x=0;x<three;x++)
        		System.out.print("*");
			System.out.println();
			
			System.out.println("Four:");
			for (x=0;x<four;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Five:");
			for (x=0;x<five;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Six:");
			for (x=0;x<six;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Seven:");
			for (x=0;x<seven;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Eight:");
			for (x=0;x<eight;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Nine:");
			for (x=0;x<nine;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Ten:");
			for (x=0;x<ten;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Eleven:");
			for (x=0;x<eleven;x++)
        		System.out.print("*");
			System.out.println();
			System.out.print("Twelve:");
			for (x=0;x<twelve;x++)
        		System.out.print("*");
			System.out.println();
        	}
        			
  
   }
		
			
		
			
		
		
		

	


