package Model;

public class Produkte {
    private String name;
    private int preis;
    private String universum;

    public Produkte(String name, int preis, String herkunftsregion) {
        this.name = name;
        this.preis = preis;
        this.universum = herkunftsregion;
    }

    public Produkte() {
        this.name = null;
        this.preis = 0;
        this.universum = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getUniversum() {
        return universum;
    }

    public void setUniversum(String universum) {
        this.universum = universum;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", herkunftsregion='" + universum + '\'' +
                '}';
    }
}

