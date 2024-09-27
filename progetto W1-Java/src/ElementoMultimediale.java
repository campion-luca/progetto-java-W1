public abstract class ElementoMultimediale implements Riproducibile {

    private String titolo;


    public ElementoMultimediale(String titolo) {
        this.titolo= titolo;
    }

    // getter :
    public String getTitolo() {
        return titolo;
    }

}
