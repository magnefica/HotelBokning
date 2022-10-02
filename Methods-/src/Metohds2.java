import java.util.Scanner;

public class Metohds2 {
	public static void AvBokaRum(Scanner input, int menu) {
		
		Metohds mrMetohds = new Metohds();
		Metohds1 mrMetohds1 = new Metohds1();
		Main mrMain = new Main();
		
		int[] AntalRum = mrMetohds.getNumArray1();
		String[] Text = mrMetohds.getNumArray2();

		System.out.println("Här kan du göra dina avbokningar");
		System.out.println("1. Avbokning");
		System.out.println("2. Se dina bokningar");
		System.out.println("3. Gå till dina bokningar");
		System.out.println("4. Gå till start menyn");
		
		while (mrMetohds.input.hasNextInt()) {
			menu = mrMetohds.input.nextInt();

			
			switch (menu) {
			case 1:
				System.out.println("Avdelningen för avboka ett rum");
				System.out.println("1. Avbokning av Standardrum");
				System.out.println("2. Avbokning av Deluxrum");
				System.out.println("3. Avbokning av Källarsviten");
				
		while (mrMetohds.input.hasNextInt()) {
			menu = mrMetohds.input.nextInt();
				switch (menu) {
				case 1:
					AntalRum[0] += 1;
					System.out.println("Dit rum är nu avbokat");
					AvBokaRum(input, menu);
					break;
				case 2:
					AntalRum[1] += 1;
					System.out.println("Dit rum är nu avbokat");
					AvBokaRum(input, menu);
					break;
				case 3:
					AntalRum[2] += 1;
					System.out.println("Dit rum är nu avbokat");
					AvBokaRum(input, menu);
					break;
				default:
					System.out.println("Fel!!!!!!! Du kan bara välja mellan 1 - 3");
					System.out.println("Avdelningen för avboka ett rum");
					System.out.println("1. Avbokning av Standardrum");
					System.out.println("2. Avbokning av Deluxrum");
					System.out.println("3. Avbokning av Källarsviten");
				}
				}
			break;
			case 2:
				System.out.println("Dina bokningar");
				System.out.println("------------------------------------------");
				System.out.println("Bokade Standardrum");
				System.out.println(mrMetohds.totaltAntalRumStandard - AntalRum[0]);
				System.out.println("Bokade Deluxrum");
				System.out.println(mrMetohds.totaltAntalDeluxrum - AntalRum[1]);
				System.out.println("Bokade Källarsvitter");
				System.out.println(mrMetohds.totaltAntalKällarsvitter - AntalRum[2]);
				System.out.println("Här kan du göra dina avbokningar");
				System.out.println("1. Avbokning");
				System.out.println("2. Se dina bokningar");
				System.out.println("3. Gå till dina bokningar");
				System.out.println("4. Gå till start menyn");
				break;
			case 3:
				Metohds1.BokaRum(input, menu);
				break;
			case 4:
				Main.main(Text);
				break;
			default:
				System.out.println("Du har skrivit in fel, prova igen");
				System.out.println("1. Boka rum");
				System.out.println("2. Avboka rum");
				}
			}
}
}
