package library_pkg;

import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("library");
		Library lib1 = new Library(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(lib1.Location);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("library");
		Library lib2 = new Library(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(lib2.Location);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("library");
		Library lib3 = new Library(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(lib3.Location);
		Scanner scan4 = new Scanner(System.in);
		System.out.println("library");
		Library lib4 = new Library(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(lib4.Location);
		Scanner scan5 = new Scanner(System.in);
		System.out.println("library");
		Library lib5 = new Library(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(lib5.Location);
		
		scan.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
		

	}
	

}
