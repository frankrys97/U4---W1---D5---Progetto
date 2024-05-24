package playerMultimediale;

import interfaces.RiproduzioneAudioVideo;

public class ElementoAudio extends ElementoMultimediale implements RiproduzioneAudioVideo {

    protected int volume;

    public ElementoAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }


    @Override
    public void play() {

        System.out.println("Riproduzione audio in corso");

        for (int i = 0; i < this.getDurata(); i++) {
            System.out.print(this.getTitolo());
            for (int j = 0; j < this.volume; j++) {
                System.out.print("!");
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
}
