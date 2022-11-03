public class Van extends MotorVehicle {

    private int capacity;

    Van(int id, String brand, int year, int displacement, int capacity) {
        super(id,brand,year,displacement);
        this.capacity= capacity;
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
    public int getCapacity() {
        return capacity;
    }
    public String toString() {
        String text = getId() + ". " + getBrand() + " " + getYear()+ " " + getDisplacement()+ " " + getCapacity();
        return text;
    }
}
