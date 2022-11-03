public class Car extends MotorVehicle {

    int carDoors;

    String powerSupply; //diesel o benzina

    Car(int id, String brand, int year, int displacement, int carDoors, String powerSupply) {
        super(id, brand, year, displacement);
        this.carDoors = carDoors;
        this.powerSupply = powerSupply;
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

    public int getCarDoors() {
        return carDoors;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String toString() {
        String text = getId() + ". " + getBrand() + " " + getYear() + " " + getDisplacement() + " " + getCarDoors() + " " + getPowerSupply();
        return text;
    }
}
