import java.util.Scanner;

public class Metohds1 { // boka rum 

	public static void BokaRum(Scanner input, int menu) {

		Metohds mrMetohds = new Metohds();
		Metohds2 mrMetohds2 = new Metohds2();
		Main mrMain = new Main();
		
		int[] Pris = mrMetohds.getNumArray();
		int[] AntalRum = mrMetohds.getNumArray1();
		String[] Text = mrMetohds.getNumArray2();
		
		
		for (int i = 0; i <= 8; i++)
			System.out.println(Text[i]);
		
		while (mrMetohds.input.hasNextInt()) {
			menu = mrMetohds.input.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println(" ");
				System.out.println("Du har valt ett Standard rum och priset är " + Pris[0] + "kr");
				mrMetohds.bokadeStandardrum = AntalRum[0] -= 1;
				System.out.println("Nu finns det " + AntalRum[0] + " standardrum kvar");
				System.out.println("Du återvänder nu till bokningsmenyn");
				for (int i = 0; i <= 8; i++)
					System.out.println(Text[i]);
				break;
			case 2:
				System.out.println(" ");
				System.out.println("Du har valt ett Deluxe rum och priset är " + Pris[1] + "kr");
				mrMetohds.bokadeDeluxrum = AntalRum[1] -= 1;
				System.out.println("Nu finns det " + AntalRum[1] + " Deluxrum kvar");
				System.out.println("Du återvänder nu till huvudmenyn");
				for (int i = 0; i <= 8; i++)
					System.out.println(Text[i]);
				break;
			case 3:
				System.out.println(" ");
				System.out.println("Du har valt ett Källarsviten och priset är " + Pris[2] + "kr");
				mrMetohds.bokadeKällarSviten = AntalRum[2] -= 1;
				System.out.println("Nu finns det " + AntalRum[2] + " Källarsvitter kvar");
				System.out.println("Du återvänder nu till huvudmenyn");
				for (int i = 0; i <= 8; i++)
					System.out.println(Text[i]);
				break;
			case 4:
				System.out.println("Det finns kvar Standardrum: " +AntalRum[0]);
				System.out.println("Det finns kvar Deluxrum: " +AntalRum[1]);
				System.out.println("Det finns kvar Källarsvitten: " +AntalRum[2]);
				for (int i = 0; i <= 8; i++)
					System.out.println(Text[i]);
				break;
			case 5:
				Metohds2.AvBokaRum(input, menu);
			case 6:
				Main.main(Text);
				break;
			case 7:
				System.out.println("Dina bokningar");
				System.out.println("------------------------------------------");
				System.out.println("Bokade Standardrum");
				System.out.println(mrMetohds.totaltAntalRumStandard - AntalRum[0]);
				System.out.println("Bokade Deluxrum");
				System.out.println(mrMetohds.totaltAntalDeluxrum - AntalRum[1]);
				System.out.println("Bokade Källarsvitter");
				System.out.println(mrMetohds.totaltAntalKällarsvitter - AntalRum[2]);
				for (int i = 0; i <= 8; i++)
					System.out.println(Text[i]);
				break;
				default:
				System.out.println("Du har skrivit in fel, prova igen");
				System.out.println("1. Boka rum");
				System.out.println("2. Avboka rum");
				}
			}
		
}
}
