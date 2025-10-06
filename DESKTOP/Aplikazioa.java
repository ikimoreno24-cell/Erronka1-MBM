import java.util.*;
import java.util.ArrayList;

public class Aplikazioa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pelikulak = new ArrayList<>();
        ArrayList<String> gelak = new ArrayList<>();

        /* Pelikulen lista */

        pelikulak.add("Lilo y Stich");
        pelikulak.add("Una Pelicula de Minecraft");
        pelikulak.add("Mufasa: El Rey Leon");
        pelikulak.add("Como Entrenar a tu Dragon");
        pelikulak.add("Capitan America: Brave New World");
        pelikulak.add("Conclave");
        pelikulak.add("Sonic 3: La Pelicula");
        pelikulak.add("Mision Imposible: Sentencia Final");
        pelikulak.add("Blancanieves");
        pelikulak.add("Thunderbolt");
        pelikulak.add("Padre No Hay Mas Que Uno 5");
        pelikulak.add("Wolfgang (Extraordinario)");
        pelikulak.add("Un Funeral de Locos");
        pelikulak.add("Sirat");

        /* Gelen lista */

        gelak.add("Umeen gela");
        gelak.add("Superheroien gela");
        gelak.add("Thriller gela");
        gelak.add("Zientzia fikziozko gela");
        gelak.add("Komedia gela");


        System.out.println("Zein ikusi nahi duzu: \n" + 
        "1. Aste eguna \n" +
        "2. Pelikulen informazio orokorra \n" +
        "3. Kokapena \n" +
        "4. Irekiera ordutegia \n" +
        "5. Irten");

        int aukera = sc.nextInt();

        switch (aukera) {
            case 1:
                
                break;
        
        }
    }
}