package playerMultimediale;

import interfaces.LuminositaVideoImmagine;
import interfaces.RiproduzioneAudioVideo;

public class ElementoVideo extends ElementoMultimediale implements RiproduzioneAudioVideo, LuminositaVideoImmagine {

    private int volume;
    private int luminosita;

    public ElementoVideo(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }


    @Override
    public void alzaLuminosita(int luminositaPlus) {
        this.luminosita += luminositaPlus;
    }

    @Override
    public void abbassaLuminosita(int luminositaMinus) {
        this.luminosita -= luminositaMinus;
    }

    @Override
    public void play() {
        System.out.println("Visualizzazione video in corso");
        System.out.println();
        for (int i = 0; i < this.getDurata(); i++) {
            System.out.print(this.getTitolo());
            for (int j = 0; j < this.volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < this.luminosita; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Override
    public void alzaVolume(int volumePlus) {
        this.volume += volumePlus;

    }

    @Override
    public void abbassaVolume(int volumeMinus) {
        this.volume -= volumeMinus;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
