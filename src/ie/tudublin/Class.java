package ie.tudublin;

public class Class {
    private String colour;
    public int r, g, b, value;

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public Class(String colour, int r, int g, int b, int value) {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Class [colour=" + colour + ", r=" + r + ", g=" + g + ", b=" + b + ", value=" + value + "]";
    }
}
