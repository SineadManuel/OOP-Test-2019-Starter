package ie.tudublin;

public class Resistor {
    public int value, ones, tens, hundreds;

    public Resistor(int value) {
        this.value = value;

        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
    }

}
