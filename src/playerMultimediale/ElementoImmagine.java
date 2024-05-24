package playerMultimediale;

import interfaces.LuminositaVideoImmagine;

public class ElementoImmagine extends ElementoMultimediale implements LuminositaVideoImmagine {

    private int luminosita;

    public ElementoImmagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    @Override
    public void alzaLuminosita() {

    }

    @Override
    public void abbassaLuminosita() {

    }

    public void show() {
        System.out.println("Titolo: " + getTitolo() + ", luminosita: " + luminosita);
    }
}
