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

        System.out.println("Ciao benvenuto in EpiPLayer!");

        ElementoMultimediale[] elementiPlayer = new ElementoMultimediale[5];

        for (int i = 0; i < elementiPlayer.length; i++) {
            System.out.println("Scegli il tipo di file da inserire nel tuo player:");

            System.out.println("1. Immagine");
            System.out.println("2. Audio");
            System.out.println("3. Video");


            int scelta = scannerPlayer.nextInt();
            scannerPlayer.nextLine();

/*            System.out.println("Creazione elemento multimediale in corso");

            System.out.println("Scegli un titolo per il tuo file:");

            String titolo = scannerPlayer.nextLine();

            Ho deciso di implementare queste parti direttamente nei cases dello switch in modo da avere una UX migliore

            */

            switch (scelta) {
                case 1:
                    System.out.println("Creazione elemento immagine in corso...");
                    System.out.println("Scegli un titolo per il tuo file:");
                    String titoloImmagine = scannerPlayer.nextLine();
                    System.out.println("Scegli la luminosità");
                    int luminositaImmagine = Integer.parseInt(scannerPlayer.nextLine());
                    elementiPlayer[i] = new ElementoImmagine(titoloImmagine, luminositaImmagine);
                    break;
                case 2:
                    System.out.println("Creazione elemento audio in corso...");
                    System.out.println("Scegli un titolo per il tuo file:");
                    String titoloAudio = scannerPlayer.nextLine();
                    System.out.println("Scegli la durata");
                    int durataAudio = Integer.parseInt(scannerPlayer.nextLine());
                    System.out.println("Scegli il volume");
                    int volumeAudio = Integer.parseInt(scannerPlayer.nextLine());
                    elementiPlayer[i] = new ElementoAudio(titoloAudio, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Creazione elemento video in corso...");
                    System.out.println("Scegli un titolo per il tuo file:");
                    String titoloVideo = scannerPlayer.nextLine();
                    System.out.println("Scegli la durata");
                    int durataVideo = Integer.parseInt(scannerPlayer.nextLine());
                    System.out.println("Scegli il volume");
                    int volumeVideo = Integer.parseInt(scannerPlayer.nextLine());
                    System.out.println("Scegli la luminosità");
                    int luminositaVideo = Integer.parseInt(scannerPlayer.nextLine());
                    elementiPlayer[i] = new ElementoVideo(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
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


        while (true) {
            System.out.println();
            System.out.println("Questo è il tuo player: ");
            for (int i = 0; i < elementiPlayer.length; i++) {
                int numeroElemento = i + 1;
                String tipo = "";
                String durata = "";
                String volume = "";
                String luminosita = "";
                if (elementiPlayer[i] instanceof ElementoAudio) {
                    tipo = "Audio";
                    durata = String.valueOf(((ElementoAudio) elementiPlayer[i]).getDurata());
                    volume = String.valueOf(((ElementoAudio) elementiPlayer[i]).getVolume());
                    luminosita = "Assente";
                } else if (elementiPlayer[i] instanceof ElementoVideo) {
                    tipo = "Video";
                    durata = String.valueOf(((ElementoVideo) elementiPlayer[i]).getDurata());
                    volume = String.valueOf(((ElementoVideo) elementiPlayer[i]).getVolume());
                    luminosita = String.valueOf(((ElementoVideo) elementiPlayer[i]).getLuminosita());
                } else if (elementiPlayer[i] instanceof ElementoImmagine) {
                    tipo = "Immagine";
                    durata = "Assente";
                    volume = "Assente";
                    luminosita = String.valueOf(((ElementoImmagine) elementiPlayer[i]).getLuminosita());
                }
                System.out.println(numeroElemento + ". " + elementiPlayer[i].getTitolo() + " - " + tipo + " - Durata: " + durata + " - Volume: " + volume + " - Luminosità: " + luminosita);
                // Ho preferito inserire tutte le informazioni relative all'elemento multimediale in modo da rendere più facile la lettura
                // delle informazione relative alle stampe che avevamo nella traccia del progetto
            }

            System.out.println();

            System.out.println("Seleziona quale elemento vuoi eseguire ( 1 a 5 ) per iniziare la riproduzione oppure 0 per uscire");

            int sceltaRiproduzione = Integer.parseInt(scannerPlayer.nextLine());

            if (sceltaRiproduzione != 0 && sceltaRiproduzione <= elementiPlayer.length) {

                ElementoMultimediale elementoScelto = elementiPlayer[sceltaRiproduzione - 1];
                if (elementoScelto instanceof ElementoAudio) {
                    System.out.println("Elemento in esecuzione " + elementoScelto.getTitolo());
                    System.out.println("Scegli tra le seguenti opzioni:");
                    System.out.println("1. Riproduci Audio");
                    System.out.println("2. Cambia Volume");

                    int sceltaAudio = Integer.parseInt(scannerPlayer.nextLine());
                    switch (sceltaAudio) {
                        case 1:
                            ((ElementoAudio) elementoScelto).play();
                            break;
                        case 2:
                            System.out.println("Il volume corrente e': " + ((ElementoAudio) elementoScelto).getVolume());
                            System.out.println("Scegli tra le seguenti opzioni:");
                            System.out.println("1. Alza Volume");
                            System.out.println("2. Abbassa Volume");
                            int sceltaVolume = Integer.parseInt(scannerPlayer.nextLine());
                            switch (sceltaVolume) {
                                case 1:
                                    System.out.println("Inserisci il valore del volume da aumentare");
                                    int volumePlus = Integer.parseInt(scannerPlayer.nextLine());
                                    ((ElementoAudio) elementoScelto).alzaVolume(volumePlus);
                                    break;
                                case 2:
                                    System.out.println("Inserisci il valore del volume da diminuire");
                                    int volumeMinus = Integer.parseInt(scannerPlayer.nextLine());
                                    ((ElementoAudio) elementoScelto).abbassaVolume(volumeMinus);
                                    break;
                                default:
                                    System.out.println("Scelta non valida");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Scelta non valida");
                            break;
                    }

                    /*((ElementoAudio) elementoScelto).play();*/
                } else if (elementoScelto instanceof ElementoVideo) {
                    System.out.println("Elemento in esecuzione " + elementoScelto.getTitolo());
                    System.out.println("Scegli tra le seguenti opzioni:");
                    System.out.println("1. Riproduci Video");
                    System.out.println("2. Cambia Volume");
                    System.out.println("3. Cambia Luminosità");

                    int sceltaVideo = Integer.parseInt(scannerPlayer.nextLine());
                    switch (sceltaVideo) {
                        case 1:
                            ((ElementoVideo) elementoScelto).play();
                            break;
                        case 2:
                            System.out.println("Il volume corrente e': " + ((ElementoVideo) elementoScelto).getVolume());
                            System.out.println("Scegli tra le seguenti opzioni:");
                            System.out.println("1. Alza Volume");
                            System.out.println("2. Abbassa Volume");
                            int sceltaVolume = Integer.parseInt(scannerPlayer.nextLine());
                            switch (sceltaVolume) {
                                case 1:
                                    System.out.println("Inserisci il valore del volume da aumentare");
                                    int volumePlus = Integer.parseInt(scannerPlayer.nextLine());
                                    ((ElementoVideo) elementoScelto).alzaVolume(volumePlus);
                                    break;
                                case 2:
                                    System.out.println("Inserisci il valore del volume da diminuire");
                                    int volumeMinus = Integer.parseInt(scannerPlayer.nextLine());
                                    ((ElementoVideo) elementoScelto).abbassaVolume(volumeMinus);
                                    break;
                                default:
                                    System.out.println("Scelta non valida");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Il luminosità corrente e': " + ((ElementoVideo) elementoScelto).getLuminosita());
                            System.out.println("Scegli tra le seguenti opzioni:");
                            System.out.println("1. Alza Luminosità");
                            System.out.println("2. Abbassa Luminosità");
                            int sceltaLuminosita = Integer.parseInt(scannerPlayer.nextLine());
                            switch (sceltaLuminosita) {
                                case 1:
                                    System.out.println("Inserisci il valore della luminosità da aumentare");
                                    int luminositaPlus = Integer.parseInt(scannerPlayer.nextLine());
                                    ((ElementoVideo) elementoScelto).alzaLuminosita(luminositaPlus);
                                    break;
                                case 2:
                                    System.out.println("Inserisci il valore della luminosità da diminuire");
                                    int luminositaMinus = Integer.parseInt(scannerPlayer.nextLine());
                                    ((ElementoVideo) elementoScelto).abbassaLuminosita(luminositaMinus);
                                    break;
                                default:
                                    System.out.println("Scelta non valida");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Scelta non valida");
                            break;
                    }

                    /*((ElementoVideo) elementoScelto).play();*/
                } else if (elementoScelto instanceof ElementoImmagine) {

                    System.out.println("Elemento in esecuzione " + elementoScelto.getTitolo());
                    System.out.println("Scegli tra le seguenti opzioni:");
                    System.out.println("1. Visualizza Immagine");
                    int sceltaImmagine = Integer.parseInt(scannerPlayer.nextLine());
                    if (sceltaImmagine == 1) {
                        ((ElementoImmagine) elementoScelto).show();
                    } else {
                        System.out.println("Scelta non valida");
                    }

                    /*((ElementoImmagine) elementoScelto).show();*/
                }

            } else if (sceltaRiproduzione != 0 && sceltaRiproduzione > elementiPlayer.length) {
                System.out.println("Scelta non valida");
            } else {
                System.out.println("Arrivederci, a presto");
                break;
            }
        }
        ;


        scannerPlayer.close();


    }
}