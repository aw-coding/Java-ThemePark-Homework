package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);

        visitor1 = new Visitor(20, 202.1, 300);
        visitor2 = new Visitor(25, 130.5, 30);
        visitor3 = new Visitor(11, 150, 30);
        visitor4 = new Visitor(20, 180, 80);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canTestForAgeAndPass() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }
    @Test
    public void canTestForAgeAndFailTooYoung() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }
    @Test
    public void canTestForAgeAndFailTooShort() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canChargeRegularPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor4), 0.0);
    }

    @Test
    public void canChargeDoublePrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.0);
    }
}