public class Video extends ElementoMultimediale {

    private int luminosita;
    private int volume;
    private int durata;


    // costruttore
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }


    // metodi
    @Override
    public void abbassaVolume() {
        volume--;
        System.out.println("Scusa, sono sordo, abbassato con successo il volume!");
        System.out.println("il volume attuale è di: " + this.volume);
    }


    @Override
    public void alzaVolume() {
        volume++;
        System.out.println("Sei un po' sordo eh, alzato con successo il volume!");
        System.out.println("il volume attuale è di: " + this.volume);
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }


    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public String toString() {
        return "Titolo video: " + getTitolo() + " luminosita attuale: " + luminosita + " volume attuale: " + volume + " durata video " + durata;
    }
}
