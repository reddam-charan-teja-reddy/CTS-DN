package factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.toLowerCase().equals("bike")){
            return new Bike();
        } else if (type.toLowerCase().equals("car")) {
            return new Car();
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
