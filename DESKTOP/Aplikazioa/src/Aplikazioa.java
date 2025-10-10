import java.util.*;

/**
 * Zinema aplikazioa — pelikulak, gelak eta ordutegia erakusten ditu.
 */
/**
 * Birfaktorizazioa:
 * 42 eta 48 lerroak: pelikulak listan sartzeko pelikulak.add erabili beharrean
 * denbora guztian, Arrays.asList erabili dugu adierazitako pelikula guztiak
 * sartzeko komando errepikakorra izan gabe. Gelak lista kasuan berdina.
 */
public class Aplikazioa {

    /** Kolore kodeak kontsolarako. */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    /** Agurra 1. */
    static String agurra1() {
        return "Kaixo, ongi etorri Zinema Usurbilera, ni Iker naiz.";
    }

    /** Agurra 2. */
    static String agurra2() {
        return "Kaixo, ongi etorri Zine Usurbilera, ni Urko naiz.";
    }

    /*Agurra 3 */
    static String agurra3() {
        return "\"Kaixo ongi etorria Zine Usurbil enpresara, enpresako bigarren kidea naiz, Ierai.";
    }
    /**
     * Programa nagusia — menua eta aukerak.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Pelikula eta gela zerrendak.
         */
        ArrayList<String> pelikulak = new ArrayList<>(Arrays.asList(
                "Lilo y Stich", "Una Pelicula de Minecraft", "Mufasa: El Rey Leon",
                "Como Entrenar a tu Dragon", "Capitan America: Brave New World",
                "Conclave", "Sonic 3", "Mision Imposible", "Blancanieves", "Thunderbolt",
                "Padre No Hay Mas Que Uno 5", "Wolfgang", "El Casoplon", "Un Funeral de Locos", "Sirat"));

        ArrayList<String> gelak = new ArrayList<>(Arrays.asList(
                "Umeen gela", "Superheroien gela", "Thriller gela", "Zientzia fikzioa", "Komedia gela"));

        boolean errepikatu = true;

        /** Menu nagusia. */
        while (errepikatu) {
            System.out.println(
                    ANSI_CYAN + "\n1. Aste eguna\n2. Pelikulak\n3. Kokapena\n4. Ordutegia\n5. Irten" + ANSI_RESET);
            System.out.print("Aukeratu: ");
            int aukera = sc.nextInt();

            switch (aukera) {
                /** Asteko egunaren arabera pelikulak. */
                case 1:
                    System.out.println(ANSI_YELLOW + "Aukeratu: (1) Astelehena / (2) Osteguna" + ANSI_RESET);
                    int eguna = sc.nextInt();
                    if (eguna == 1) {
                        for (int i = 0; i < 7; i++)
                            System.out.println(pelikulak.get(i));
                    } else {
                        for (int i = 7; i < pelikulak.size(); i++)
                            System.out.println(pelikulak.get(i));
                    }
                    break;

                /** Pelikulak eta gelak erakutsi. */
                case 2:
                    System.out.println(ANSI_BLUE + "\nPelikulak: " + pelikulak + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "Gelak: " + gelak + ANSI_RESET);
                    break;

                /** Kokapena erakutsi. */
                case 3:
                    System.out.println(ANSI_CYAN + "Usurbil, Errekatxiki kalea." + ANSI_RESET);
                    break;

                /** Ordutegia erakutsi. */
                case 4:
                    System.out.println(ANSI_GREEN + "Astelehena: 12:00–00:00 / Osteguna: 16:00–00:00" + ANSI_RESET);
                    break;

                /** Irten. */
                case 5:
                    System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
                    errepikatu = false;
                    break;

                /** Errorea. */
                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }

            /** Buklea jarraitu edo amaitu. */
            if (errepikatu) {
                System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
                if (sc.nextInt() != 1) {
                    System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
                    errepikatu = false;
                }
            }
        }
        sc.close();
    }
}
