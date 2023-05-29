package eu.hackerank.solutions.loop2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		List<String> lines = new ArrayList<>();
		
		int q = scanner.nextInt(); // Numero di righe da leggere sotto
		do {
			for (int i = 0; i <= q; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt(); 
				int n = scanner.nextInt();
				
				int sum = 0;
				StringBuilder output = new StringBuilder("");
				for (int k = 0; k < n; k++) {
					sum += a + Math.pow(2, k) * b;
					output.append(sum + " ");
				}
				System.out.println(output.toString().trim());
			}
		} while (q >= 0 && q <= 500);
	}
	
}
