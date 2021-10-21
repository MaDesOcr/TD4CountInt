package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Utilitaires {

	// getRandomNumber(int max)
	// return an int between 1 and max
	public static int getRandomNumber(int max) {
		Random r = new Random();
		return r.nextInt(max) + 1;
	}

	public static int[] getXRandomNumber(int x, int MAX, int[] randomNumber) {
		for (int i = 0; i < x; i++) {
			randomNumber[i] = getRandomNumber(MAX);
		}
		return randomNumber;
	}

	// methode de lecture
	public static void readIntTab(int[] tabInt) {
		for (int i : tabInt) {
			System.out.println(i);
		}
	}
	
	public static void writeFile(int[] tabIntToWrite, String fileName) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    
		StringBuffer str = new StringBuffer();
		for (int i : tabIntToWrite) {
			str.append(i);
			str.append("\n");
		}
		str.delete(str.length()-1, str.length());
		writer.write(str.toString()); 
	    writer.close();
	}
	
	//read the content in -filename-
	//return an array with the content of the file
	public static int[] readFile(String fileName, int size) throws IOException{
	    int[] tabToFill = new int[size];
	    int indexTab = 0;
	    Scanner scanner = new Scanner(new File(fileName));
		while(scanner.hasNextLine()) {
			tabToFill[indexTab] = scanner.nextInt();
			indexTab++;
		}
		return tabToFill;
	}
	
	
	
	public static int returnMaxLinkedIntFromTab(int[] tabToBeSearched) {
		int intMax = 0;
		for(int i = 0; i < tabToBeSearched.length ; i++) {
			if(tabToBeSearched[i]==1) {
				int intTemp = 1;
				int indexTemp = i;
				while(indexTemp<tabToBeSearched.length-1 &&
						tabToBeSearched[indexTemp+1]==intTemp+1 ) {
					indexTemp++;
					intTemp++;
				}
				if(intMax<intTemp) intMax = intTemp;
			}
		}
		
		return intMax;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
