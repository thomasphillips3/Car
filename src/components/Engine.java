package components;

/**
 * Created by thomas on 11/13/16.
 */
public class Engine {
    private int cylinders;
    private int horsepower;

    private static boolean IS_VALID_CYLINDERS(int cyl) {
        if ((cyl >3) && (cyl < 13) && (cyl % 2 == 0))
            return true;
        return false;
    }

    public Engine() {
        cylinders = 6;
        horsepower = 380;
    }
    public Engine(int cyl) {
        if (IS_VALID_CYLINDERS(cyl))
            System.out.print("aye");
        else
            System.out.print("nah");
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        if (IS_VALID_CYLINDERS(cylinders)){
            this.cylinders = cylinders;
        }
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
