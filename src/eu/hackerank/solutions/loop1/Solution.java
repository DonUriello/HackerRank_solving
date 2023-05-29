package eu.hackerank.solutions.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = 0;
        do {
        	N = Integer.parseInt(bufferedReader.readLine().trim());
        } while(N < 2 || N > 20);

        for(int i = 1; i <= 10; i++) {
        	System.out.println(N + " x " + i + " = " + (N*i));
        }
        
        bufferedReader.close();
    }
}
