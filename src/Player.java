import playerMultimediale.ElementoAudio;
import playerMultimediale.ElementoImmagine;
import playerMultimediale.ElementoMultimediale;
import playerMultimediale.ElementoVideo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Player {
    public static void main(String[] args) {

/*        ElementoImmagine immagine = new ElementoImmagine("Immagine", 10);
        immagine.show();

        immagine.alzaLuminosita();
        immagine.show();*/

  /*      ElementoAudio audio = new ElementoAudio("Audio", 10, 10);
        audio.abbassaVolume(5);
        audio.play();*/

  /*      ElementoVideo video = new ElementoVideo("Video", 10, 10, 10);
        video.abbassaVolume(5);
        video.play();*/

   /*     ElementoImmagine immagine = new ElementoImmagine("Immagine", 10);
        immagine.abbassaLuminosita(5);
        immagine.show();*/


        Scanner scannerPlayer = new Scanner(System.in);

        ElementoMultimediale[] elementiPlayer = new ElementoMultimediale[5];

        for (int i = 0; i < elementiPlayer.length; i++) {
            System.out.println("Scegli il tipo di file da inserire nel tuo player:");

            System.out.println("1. Immagine");
            System.out.println("2. Audio");
            System.out.println("3. Video");


            int scelta = scannerPlayer.nextInt();
            scannerPlayer.nextLine();

            System.out.println("Creazione elemento multimediale in corso");

            System.out.println("Scegli un titolo per il tuo file:");

            String titolo = scannerPlayer.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Creazione elemento immagine in corso...");
                    System.out.println("Scegli la luminosita'");
                    int luminosita = Integer.parseInt(scannerPlayer.nextLine());
                    scannerPlayer.nextLine();
                    elementiPlayer[i] = new ElementoImmagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Creazione elemento audio in corso...");
                    System.out.println("Scegli la durata");
                    int durata = Integer.parseInt(scannerPlayer.nextLine());
                    scannerPlayer.nextLine();
                    System.out.println("Scegli il volume'");
                    int volume = Integer.parseInt(scannerPlayer.nextLine());
                    scannerPlayer.nextLine();
                    elementiPlayer[i] = new ElementoAudio(titolo, durata, volume);
                    break;
                case 3:
                    System.out.println("Creazione elemento video in corso...");
                    System.out.println("Scegli la durata");
                    int durataVideo = Integer.parseInt(scannerPlayer.nextLine());
                    scannerPlayer.nextLine();
                    System.out.println("Scegli il volume'");
                    int volumeVideo = Integer.parseInt(scannerPlayer.nextLine());
                    scannerPlayer.nextLine();
                    System.out.println("Scegli la luminosita'");
                    int luminositaVideo = Integer.parseInt(scannerPlayer.nextLine());
                    scannerPlayer.nextLine();
                    elementiPlayer[i] = new ElementoVideo(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Scelta non valida, scelte possibile da 1 a 3");
                    i--; // Per fare in modo che se l'utente va nel caso default il ciclo possa andare avanti per completare l'array
                    // che ha bisogno dei 5 elementi, da testare!!!!!!!!!
                    break;
            }

        }

        // possibilità di eseguire il player appena creato


        System.out.println("Player caricato correttamente, premi invio per iniziare la riproduzione");
        scannerPlayer.nextLine();

        System.out.println("Caricamento in corso...");
        System.out.println("Questo è il tuo player: ");
        for (int i = 0; i < elementiPlayer.length; i++) {
            System.out.println(elementiPlayer[i].getTitolo());
        }

        System.out.println("Seleziona quale elemento vuoi eseguire ( 1 a 5 ) per iniziare la riproduzione oppure 0 per uscire");

        int sceltaRiproduzione = scannerPlayer.nextInt();
        scannerPlayer.nextLine();
        if (sceltaRiproduzione != 0 && sceltaRiproduzione <= elementiPlayer.length) {

            ElementoMultimediale elementoScelto = elementiPlayer[sceltaRiproduzione - 1];
            if (elementoScelto instanceof ElementoAudio) {
                ((ElementoAudio) elementoScelto).play();
            } else if (elementoScelto instanceof ElementoVideo) {
                ((ElementoVideo) elementoScelto).play();
            } else if (elementoScelto instanceof ElementoImmagine) {
                ((ElementoImmagine) elementoScelto).show();
            }

        } else {
            System.out.println("Arrivederci");
        }


        scannerPlayer.close();


    }
}