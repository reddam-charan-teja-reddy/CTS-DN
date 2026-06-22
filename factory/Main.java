package factory;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();
        bike.stop();

        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();
        car.stop();
    }
}
