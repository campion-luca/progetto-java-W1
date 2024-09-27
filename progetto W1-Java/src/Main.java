import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio finale W1");


//        // ----------------- test creazione "Audio" -----------------
//        ElementoMultimediale a1 = new RegistrazioneAudio("Katy perry",7,8);
//
//
//        // test metodo " alza volume "
//        a1.alzaVolume();
//        // test metodo " abbassa volume "
//        a1.abbassaVolume();
//
//
//        // test metodo play x audio
//        a1.play();
//
//
//        // ----------------- test creazione " Video " -----------------
//        ElementoMultimediale v1 = new Video("Rocky Balboa best moments",10,6,10);
//
//        // test metodo " alza volume "
//        v1.alzaVolume();
//
//        // test metodo " abbassa volume "
//        v1.abbassaVolume();
//
//        // test metodo play x video
//        v1.play();
//
//
//        // ----------------- test creazione " Immagine " -----------------
//        ElementoMultimediale i1 = new Immagine("Io e Cristina in vacanza ",7);
//
//        // test metodo " alza luminosità "
//        i1.alzaVolume();
//
//        // test metodo " abbassa luminosità "
//        i1.abbassaVolume();
//
//        // test metodo show x immagine
//        i1.play();



        // -----------------  PLAYER -----------------
            Scanner scan = new Scanner(System.in);
            ElementoMultimediale[] Elemento = new ElementoMultimediale[5]; // array di file multimediali in input


            for (int i = 1; i < Elemento.length + 1; i++) {

                System.out.println(i + ") Inserisci il titolo del nuovo elemento : ");
                String titoloStr = scan.nextLine();


                System.out.println(i + ") E' un immagine? ( s : si || n : no )");

                if (Objects.equals(scan.nextLine(), "n")) { // NON è img

                    System.out.println(i + ") E' un video? ( s : si || n : no )");

                    if (Objects.equals(scan.nextLine(), "s")) { // E' un video

                        System.out.println(i+ ") Inserisci la luminosita iniziale: ");
                        int luminositaStr = scan.nextInt();
                        scan.nextLine(); // test ridondanza

                        System.out.println(i+ ") Inserisci il volume iniziale: ");
                        int volumeStr = scan.nextInt();
                        scan.nextLine(); // test ridondanza

                        System.out.println(i + ") Inserisci la durata: ");
                        int durataStr = scan.nextInt();
                        scan.nextLine(); // test ridondanza

                        ElementoMultimediale multi = new Video(titoloStr, luminositaStr, volumeStr, durataStr); // VIDEO
                        Elemento[i] = multi;


                    } else { // NON è un video, quindi AUDIO

                        System.out.println(i + ") Inserisci la durata: ");
                        int durataStr = scan.nextInt();
                        scan.nextLine(); // test ridondanza

                        System.out.println(i + ") Inserisci il volume iniziale: ");
                        int volumeStr = scan.nextInt();
                        scan.nextLine(); // test ridondanza

                        ElementoMultimediale multi = new RegistrazioneAudio(titoloStr, durataStr, volumeStr); // AUDIO
                        Elemento[i] = multi;
                    }

//                    (Objects.equals(scan.nextLine(), "s"))
                } else { // è IMG
                    System.out.println(i + ") Inserisci la luminosità iniziale: ");
                    int luminositaStr = scan.nextInt();
                    scan.nextLine(); // test ridondanza

                    ElementoMultimediale multi = new Immagine(titoloStr, luminositaStr); // IMMAGINE
                    Elemento[i] = multi;
                }

            } // chiusura ciclo for

            while(true) {

                System.out.println("Quale elemento multimediale vuoi riprodurre da 1 a 5 ? ( per fermarti scrivi 0 )");
                int i = scan.nextInt();

                // sostituibile con "play( ) " per stampare le altre cose più carine
                System.out.println(Elemento[i]);
                if(i == 0) {
                    break;
                }
            } // chiusura while

    }
}