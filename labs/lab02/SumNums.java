import java.io.*; 
import java.util.*;
public class SumNums {

	/**
	 * @param args the command line arguments, we expect user supplied 
	 * integers STARTNUM and ENDNUM
	 */
	
	public static void main(String[] args) {
		try {
			if(args.length!=2){
				System.out.println("Usage: java SumNums STARTNUM ENDNUM");
				return;
					}
			int startNum = Integer.parseInt(args[0]);
			int endNum = Integer.parseInt(args[1]);
			int sum = sumup(startNum , endNum);
			//You have something to fix here!
			{System.out.println("The sum from "+startNum+ " to "+ endNum + " is: "+ sum);}

		} catch (NumberFormatException e){
			System.out.println("One of the command line arguments is not an integer");
		}
	}

	// Create static method sumup(s,e) which returns the sum s+(s+1)+...+(e-1)+e
	// or 0 if this sum does not make sense (ie sumup(3,-4)).
	public static int sumup(int s, int e) {
		int current = s;
		int sum = 0;
		while (current != (e+1)) {
			// System.out.println("sum" + sum + "current" + current + "s" + s + "e" + e);
			sum += current;
			current ++;
			}
		return sum;
			}


}
