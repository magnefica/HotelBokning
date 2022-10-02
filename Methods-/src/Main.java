import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Metohds myMetohds = new Metohds();
		Metohds1 myMetohds1 = new Metohds1();
		Metohds2 myMetohds2 = new Metohds2();
		
		
		System.out.println("Vällkommen till bookningen!!!");
		System.out.println("1. Bokarum");
		System.out.println("2. Avbokarum");
		
		
		while (myMetohds.input.hasNextInt()) {
		myMetohds.menu = myMetohds.input.nextInt();
		switch (myMetohds.menu) {
		case 1:
			Metohds1.BokaRum(null, 0);
			break;
		case 2:
			Metohds2.AvBokaRum(null, 0);
			break;
			default:
			System.out.println("------------------------------------------");
			System.out.println("Du har skrivit in fel, prova igen");
			System.out.println("1. Boka rum");
			System.out.println("2. Avboka rum");
			System.out.println("------------------------------------------");
		}
	}		
}

}
