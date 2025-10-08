import java.util.*;
import java.util.ArrayList;

public class Aplikazioa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Birfaktorizazioa: 61 eta 62 lerroetan */

        /* Listak hasieratzen */

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
        pelikulak.add("El Casoplon");
        pelikulak.add("Un Funeral de Locos");
        pelikulak.add("Sirat");

        /* Gelen lista */

        gelak.add("Umeen gela");
        gelak.add("Superheroien gela");
        gelak.add("Thriller gela");
        gelak.add("Zientzia fikziozko gela");
        gelak.add("Komedia gela");

        /* Menua bistaratu */

        System.out.println("Zein ikusi nahi duzu: \n" +
                "1. Aste eguna \n" +
                "2. Pelikulen informazio orokorra \n" +
                "3. Kokapena \n" +
                "4. Irekiera ordutegia \n" +
                "5. Irten");

        int aukera = sc.nextInt();

        switch (aukera) {
            case 1:
                /* Bi eguneko planteamendua */
                System.out.println("Aukeratu: 1 Astelehena  + 2 osteguna");
                int aukeraEguna = sc.nextInt();

                if (aukeraEguna == 1) {

                    String egun1;

                    for (int i = 0; i < 7; i++) {

                        egun1 = pelikulak.get(i);

                        System.out.println(egun1);
                    }
                } else if (aukeraEguna == 2) {

                    String egun2;

                    for (int i = 7; i < 15; i++) {

                        egun2 = pelikulak.get(i);

                        System.out.println(egun2);
                    }
                }

                

                case 2: 
                System.out.println("\n Pelikulen lista: \n" + pelikulak + "\n");
                System.out.println("Pelikula kopurua: " + pelikulak.size() + "\n");
                System.out.println("Gelak: " + gelak + "\n");
                System.out.println("Gela kopurua: " + gelak.size() + "\n");

                break;

                case 3: 

                System.out.println("Informazioa");

                break;

                case 4:

                System.out.println("Ordutegia");

                break;

                case 5:

                break;

        }

        sc.close();

    }

}
