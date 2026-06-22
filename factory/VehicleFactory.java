package factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.toLowerCase()=="bike"){
            return new Bike();
        } else if (type.toLowerCase()=="car") {
            return new Car();
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
