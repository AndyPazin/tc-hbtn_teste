import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setup() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthDate = cal.getTime();

        person = new Person("Paul", "McCartney", birthDate, true, true, true, 1200);
    }

    @Test
    void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary() {
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthDate = cal.getTime();
        person = new Person("Paul", "McCartney", birthDate, false, false, false, 10000);
        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthDate = cal.getTime();

        person = new Person("Paul", "McCartney", birthDate, true, true, true, 10000);
        assertFalse(person.isMEI());
    }
}