package eu.hackerank.solutions.inputstdin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num1 = Integer.parseInt(reader.readLine().trim());
    	double num2 = Double.parseDouble(reader.readLine().trim());
    	String s = reader.readLine();
    	
    	System.out.println("String: "+s);
    	System.out.println("Double: "+num2);
    	System.out.println("Int: "+num1);
    }
}