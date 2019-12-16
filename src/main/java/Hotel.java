package main.java;
import java.util.List;

public class Hotel {

    private String name;

    private List<Fee> fees;

    public Hotel(String name, List<Fee> fees) {
        this.name = name;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

}
