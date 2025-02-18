package Model;

import java.util.ArrayList;
import java.util.List;

public class Charaktere {
    private int id;
    private String name;
    private String region;
    private List<Produkte> produkte;

    public Charaktere(int id, String name, String region, List<Produkte> produkte) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.produkte = produkte;
    }

    public Charaktere(int id, String name, String region) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.produkte = new ArrayList<>();
    }

    public Charaktere() {
        this.id = 0;
        this.name = null;
        this.region = null;
        this.produkte = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Produkte> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkte> produkte) {
        this.produkte = produkte;
    }

    @Override
    public String toString() {
        return "Charaktere{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", herkunftsort='" + region + '\'' +
                ", produkte=" + produkte +
                '}';
    }
}
