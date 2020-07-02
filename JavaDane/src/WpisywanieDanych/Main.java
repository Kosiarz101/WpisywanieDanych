package WpisywanieDanych;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Pracownik[] pracownicy = new Pracownik[3];
        File file = new File("F:\\Users\\Kosiarz\\Documents\\Projekty\\Java\\WpisywanieDanych\\Dane.txt");
        Scanner sc = new Scanner(file);
        int j = 0;
        while(sc.hasNextLine()){
            System.out.println("Hello World!");
            Pracownik pracownik = new Pracownik();
            pracownik.setImieNazwisko(sc.nextLine());
            pracownik.setWiek(Integer.parseInt(sc.nextLine()));
            pracownik.setMiasto(sc.nextLine());
            System.out.println();
            pracownik.setZawod(sc.nextLine());
            pracownicy[j] = pracownik;
            j++;
        }
        for(byte i=0; i<pracownicy.length; i++){
            System.out.println(pracownicy[i].getImieNazwisko());
            System.out.println(pracownicy[i].getWiek());
            System.out.println(pracownicy[i].getMiasto());
            System.out.println(pracownicy[i].getZawod());
        }

    }
}
