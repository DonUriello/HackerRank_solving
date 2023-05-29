package eu.hackerank.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {

	/**
	 * Crea un buffer per la lettura dal console System.in
	 * @return BufferedReader
	 */
	public static BufferedReader createBufferForReadingLine() {
		return new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
	}
	
}
