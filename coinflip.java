import java.util.Scanner;
public class coinflip {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int heads = 0;
	    int tails = 0;
	    System.out.println("How many times do you want to flip");
	    int flip= in.nextInt();
	    System.out.println("here is the sequence of coin flips");
	    for(int x=0;x<flip;x++){
	        if (Math.random() < 0.5) {
	        	System.out.print("T");
	          tails = tails +1;
	        } else {
	          heads = heads +1;
	          System.out.print("H");
	        }
	      }
	    System.out.println();
	      System.out.println("Heads total: " + heads);
	      System.out.println("Tails total: " + tails);

	}

}
