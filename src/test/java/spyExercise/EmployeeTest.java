package spyExercise;
/*
Przetestuj klasę Employee przy pomocy Spy’a - Stwórz nowego Employee.
Stwórz do niego Spy’a (nie przez adnotację, polecam spy()),
podmień JEDNĄ z metod, drugą zostaw nie podmienioną – sprawdź czy
działa prawidłowo.
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest {
    @Test
    public void spyTest() {
        Employee emp = new Employee("Name","Surname");
        Employee empSpy = Mockito.spy(emp);

        Mockito.when(empSpy.getFirstName()).thenReturn("gjhggj");
        assertEquals("Surname", empSpy.getLastName());
        assertEquals("gjhggj", empSpy.getFirstName());

    }
}
