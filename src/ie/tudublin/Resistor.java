package ie.tudublin;

import processing.data.TableRow;

public class Resistor extends UI {
    public int value, ones, tens, hundreds;
    UI ui;

    public Resistor(UI ui, int value) {
        this.value = value;
        this.ui = ui;

        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
    }

    public Resistor(TableRow r) {
        // this(r.getInt());
    }

    @Override
    public String toString() {
        return "Resistor [hundreds=" + hundreds + ", ones=" + ones + ", tens=" + tens + ", value=" + value + "]";
    }

    // public Resistor(UI ui) {
    // }

    public void render() {
        ui.rectMode(CENTER);
        ui.rect(250,100,100,100);
    }
}
