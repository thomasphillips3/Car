package components;

/**
 * Created by thomas on 11/13/16.
 */
public class Engine {
    private String name;
    private int cylinders;
    private double horsepower;
    private double displacement;

    public Engine() {
        setCylinders(6);
    }
    public Engine(int cyl) {
        setCylinders(cyl);
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
        switch (cylinders) {
            case 2:
                setName("Honda GX200");
                setHorsepower(5.5);
                setDisplacement(11.9607);
                break;
            case 3:
                setName("BMW B38K15T0");
                setHorsepower(400);
                setDisplacement(91);
                break;
            case 4:
                setName("Porsche 718 Boxster 4-Cylinder");
                setHorsepower(300);
                setDisplacement(152.559);
                break;
            case 5:
                setName("Audi 2.5L 5-Cylinder");
                setHorsepower(360);
                setDisplacement(152.559);
                break;
            case 6:
                setName("Hyundai Genesis 3.8L V6");
                setHorsepower(311);
                setDisplacement(231.89);
                break;
            case 7:
                setName("AGCO Sisu 7-cylinder diesel engine");
                setHorsepower(500);
                setDisplacement(610.237);
                break;
            case 8:
                setName("Ford Shelby GT500");
                setHorsepower(662);
                setDisplacement(353.938);
                break;
            case 10:
                setName("Porshe Carera GT");
                setHorsepower(605);
                setDisplacement(347.835);
                break;
            case 12:
                setName("TVR Speed 12");
                setHorsepower(1000);
                setDisplacement(469.883);
                break;
        }
    }

    public String getName() {
        return name;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public double getDisplacement() {
        return displacement;
    }

    public int getCylinders() {
        return cylinders;
    }

    private void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    private void setName (String name) {
        this.name = name;
    }

    private void setDisplacement (double displacement) {
        this.displacement = displacement;
    }
}
