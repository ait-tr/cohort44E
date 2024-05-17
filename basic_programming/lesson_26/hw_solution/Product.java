public class Product {
    private String bezeichnung;
    private double preis;
    private double bewertung;
    private int anzahlDerStückeAufLager;

     public Product(String bezeichnung, double preis, double bewertung, int anzahlDerStückeAufLager) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.bewertung = bewertung;
        this.anzahlDerStückeAufLager = anzahlDerStückeAufLager;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public double getBewertung() {
        return bewertung;
    }

    public int getAnzahlDerStückeAufLager() {
        return anzahlDerStückeAufLager;
    }

    @Override
    public String toString() {
        return "Product "+"bezeichnung: " + bezeichnung +",  preis " + preis +" €,   bewertung _" + bewertung +"_,   anzahlDerStückeAufLager :" + anzahlDerStückeAufLager ;
    }
}