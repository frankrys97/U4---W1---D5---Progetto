package playerMultimediale;

import interfaces.RiproduzioneAudioVideo;

public class ElementoAudio extends ElementoMultimediale implements RiproduzioneAudioVideo {

    private int volume;

    public ElementoAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }


    @Override
    public void play() {
        System.out.println("Riproduzione audio in corso");
    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }

}
