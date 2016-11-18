package components;

/**
 * Created by thomas on 11/13/16.
 */
public class Body {
    private Boolean sunroof;
    private Boolean spoiler;
    private int doors;
    private int wheels = 4;
    private Color color;

    private enum Color {
        BLACK,
        WHITE,
        RED,
        BLUE,
        SILVER,
        YELLOW;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if ((doors == 2) || (doors == 4))
            this.doors = doors;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean hasSunroof() {
        return sunroof;
    }

    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }

    public Boolean hasSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }
}
