package eu.hackerank.solutions.formatting;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	
    	String s1 = reader.readLine().trim();
    	String s2 = reader.readLine().trim();
    	String s3 = reader.readLine().trim();
    	
    	String[] strings = {s1, s2, s3};
    	
    	System.out.printf("================================\n");
    	for(int i = 0; i < strings.length; i++) {
    		String[] splittedString = strings[i].split(" ");
    		System.out.printf("%-14s %03d\n", splittedString[0], Integer.parseInt(splittedString[1]));
    	}
    	System.out.printf("================================\n");
    }
}