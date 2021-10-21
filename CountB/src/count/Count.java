package count;

import java.io.IOException;
import java.util.Random;

import utils.Utilitaires;

public class Count {

	final static int MAX = 10;
	final static int NBRANDOMNUMBER = 10000000;
	final static String FILENAME = "./data.txt";
			
	int[] randomNumber = new int[NBRANDOMNUMBER];
	int[] tabIntRead = new int[NBRANDOMNUMBER];
	
	int[] intTabTest = new int[] {1,2,3,5,1,2,3,4};
	public void game() {
		for(int i = 0 ; i <20 ; i++) {
		Utilitaires.getXRandomNumber(NBRANDOMNUMBER, MAX, randomNumber);
		//Utilitaires.readIntTab(randomNumber);
		
		try {
			Utilitaires.writeFile(randomNumber, FILENAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			tabIntRead = Utilitaires.readFile(FILENAME, NBRANDOMNUMBER);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			System.out.println(Utilitaires.returnMaxLinkedIntFromTab(tabIntRead));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
