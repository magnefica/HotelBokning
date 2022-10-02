import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

class Metohds {
	
	

	int x = 5;
	int menu = 3;
	
	Scanner input = new Scanner(System.in);
	
	private String text[] = new String [9]; {
	text[0] = " ";
	text[1] = "Rum att välja bland";
	text[2] = "1. Standard";
	text[3] = "2. Deluxe";
	text[4] = "3. Källarsviten";
	text[5] = "4. Se hur många lediga rum det finns av respektive typ";
	text[6] = "5. Gå till avbokning";
	text[7] = "6. Gå tillbaka till startmenyn";
	text[8] = "7. Se dina bokningar";
	
	}
	public String[] getNumArray2() {
		return text.clone();
		
	}
	
	private int[] pris = {1000, 1500, 2000};
	
	
	 public int[] getNumArray() {
	        return pris.clone();
	        
	 }
	 
	private int[] antalRum = {5, 5, 5};
	
	 public int[] getNumArray1() {
	        return antalRum.clone();
	   	 
	}

	int totaltAntalRumStandard = 5;
	int totaltAntalDeluxrum = 5;
	int totaltAntalKällarsvitter = 5;
	
	int bokadeStandardrum = 0;
	int bokadeDeluxrum = 0;
	int bokadeKällarSviten = 0;
	int avbokning = 0;
}
