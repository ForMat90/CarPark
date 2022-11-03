public class Motorcycle extends MotorVehicle {

    private int stroke; // 2, 4 tempi

    Motorcycle(int id, String brand, int year, int displacement, int stroke) {
        super(id, brand, year, displacement);
        this.stroke = stroke;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getStroke() {
        return stroke;
    }

    public String toString() {
        String text = getId() + ". " + getBrand() + " " + getYear() + " " + getDisplacement() + " " + getStroke();
        return text;
    }
}
