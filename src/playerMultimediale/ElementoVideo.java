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
    public void alzaLuminosita() {

    }

    @Override
    public void abbassaLuminosita() {

    }

    @Override
    public void play() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
