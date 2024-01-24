// Harekam Kohli
// SBU ID- 115148763
// CSE-114

import java.util.*;
public class lab_4_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String n = input.next();
		System.out.println("Enter a value for spin: ");
		int s = input.nextInt();
		

		if (s < n.length()|| -s > -n.length()) {
			if (s > 0) {
		String v1 = n.substring(0, s);
		String v2 = n.substring(s, n.length());
		
		
		System.out.println(  v2+ v1);
			}
			else {
				String v1 = n.substring(n.length()+ s, n.length());
				String v2 = n.substring(0, n.length() + s);
				System.out.println(v1+v2);
			
			}
		}
		else
			System.out.println("Invalid spin number.");


	}

}
