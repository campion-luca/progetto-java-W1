public class RegistrazioneAudio extends ElementoMultimediale{


    private int volume;
    private int durata;


    // costruttore
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        // assegno un valore di default come i veri player ( scala 1 a 10 )
        this.durata = durata;
        this.volume = volume;
    }



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

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume));
        }
    }

    @Override
    public String toString() {
        return "Titolo traccia audio: " + getTitolo() + " volume attuale: " + volume + " durata audio: " + durata;
    }
}
