package captorExercise;

public class CarGeneratorService {


    ICarGenerator carGenerator;

    public CarGeneratorService(){
    }

    public CarGeneratorService(ICarGenerator carGenerator) {
        this.carGenerator = carGenerator;
    }

    public ICarGenerator getCarGenerator() {
        return carGenerator;
    }

    public void setCarGenerator(ICarGenerator carGenerator) {
        this.carGenerator = carGenerator;
    }


    public void generateCar(String make, String colour) {
        Car car = new Car();
        car.setMake(make);
        car.setColour(colour);
        carGenerator.generateCar(car);
    }
}
