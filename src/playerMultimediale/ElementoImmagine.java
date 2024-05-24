package playerMultimediale;

import interfaces.LuminositaVideoImmagine;

public class ElementoImmagine extends ElementoMultimediale implements LuminositaVideoImmagine {

    private int luminosita;

    public ElementoImmagine(String titolo, int luminosita) {
        super(titolo);
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

    public void show() {
        System.out.println("Visualizzazione immagine in corso...");
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.print(this.getTitolo());
            for (int j = 0; j < this.luminosita; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
