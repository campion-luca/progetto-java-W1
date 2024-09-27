public class Immagine extends ElementoMultimediale {


    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }




@Override
public String toString() {
    return "Titolo immagine: " + getTitolo() + "luminosita attuale: " + luminosita;
}

    @Override
    public void play() {
        System.out.println("TITOLO : " + getTitolo() + "*".repeat(luminosita));
    }


    @Override
    public void alzaVolume() {
        luminosita++;
        System.out.println("Aumentata luminosità a: " + this.luminosita);
    }


    @Override
    public void abbassaVolume() {
        luminosita--;
        System.out.println("Diminuita luminosità a: " + this.luminosita);
    }
}
