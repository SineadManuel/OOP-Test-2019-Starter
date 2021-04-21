package ie.tudublin;

import processing.data.TableRow;

public class Color {
    private String colour;
    public int r, g, b, value;

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public Color(String colour, int r, int g, int b, int value) {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    public Color(TableRow r) {
        this(r.getString("colour"), r.getInt("r"), r.getInt("g"), r.getInt("b"), r.getInt("value"));
    }

    public Color() {
    }
    
    @Override
    public String toString() {
        return "Class [colour=" + colour + ", r=" + r + ", g=" + g + ", b=" + b + ", value=" + value + "]";
    }
}
