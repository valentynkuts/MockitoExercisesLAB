package captorExercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.verify;

/*
Przetestuj klasę CarGeneratorService przy pomocy Captora – przechwyć
argumenty metody generateCar z CarGenerator, upewnij się, że argumenty
zostały dobrze zapisane w obiekcie.

 */
@RunWith(MockitoJUnitRunner.class)
public class CarGeneratorServiceTest {
    @Test
    public void captorTest() {
        ICarGenerator carGen = Mockito.mock(ICarGenerator.class);
        CarGeneratorService carGeneratorService = new CarGeneratorService(carGen);

        carGeneratorService.generateCar("BMW","grey");

        ArgumentCaptor<Car> arg = ArgumentCaptor.forClass(Car.class);

        Mockito.verify(carGen).generateCar(arg.capture());
        Car c = arg.getValue();
        assertEquals("grey", c.getColour());
        assertEquals("BMW", c.getMake());
    }
}
