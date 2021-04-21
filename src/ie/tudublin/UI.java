package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet {
	Resistor res;
	
	ArrayList<Color> colors = new ArrayList<Color>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void loadColours() {
		Table t = loadTable("colours.csv", "header");
		for(TableRow r:t.rows())
        {
            Color color = new Color(r);
            colors.add(color);
        }
	}

	public void printColours() {
		for(Color c:colors) {
			println(c);
		}
	}

	public Color findColor(int value) {
		Color color = new Color();

		for(Color c:colors) {
			if(c.value == value) {
				color = c;
				break;
			}
		}
		
		return color;
	}

	public void loadResistors() {
		Table t = loadTable("resistors.csv");
		for(TableRow r:t.rows())
        {
            Resistor resistor = new Resistor(r);
            resistors.add(resistor);
        }
	}

	public void printResistors() {
		for(Resistor r:resistors) {
			println(r);
		}
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
		println(findColor(1));
		loadResistors();
		printResistors();
		res = new Resistor(this, 618);
	}
	
	public void draw()
	{
		res.render();
	}
}
