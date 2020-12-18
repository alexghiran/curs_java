package ro.trc.ziua3.clase;

import java.time.LocalDate;

public class Tablou {
    private String denumire;
    private Artist artist;
    private LocalDate data;

    public Tablou(String denumire, Artist artist, LocalDate data) {
        this.denumire = denumire;
        this.artist = artist;
        this.data = data;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
