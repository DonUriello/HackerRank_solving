package eu.hackerank.solutions.oddeven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Elia Uriani
 */
public class Solution {

	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
		
		int n = Integer.parseInt(reader.readLine().trim());
		
		if(n % 2 != 0) { // ODD = Dispari
			System.out.println("Weird");
		} else {
			if(n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			} else if(n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else if(n > 20) {
				System.out.println("Not Weird");
			}
		}
	}
}
