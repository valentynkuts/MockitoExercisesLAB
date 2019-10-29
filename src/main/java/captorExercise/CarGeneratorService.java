package captorExercise;

public class CarGeneratorService {
    ICarGenerator carGenerator;


    public void generateCar(String make, String colour) {
        Car car = new Car();
        car.setMake(make);
        car.setColour(colour);
        carGenerator.generateCar(car);
    }
}
