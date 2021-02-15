package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(20, 202.1, 300);
        visitor2 = new Visitor(25, 130.5, 30);
        visitor3 = new Visitor(11, 150, 30);
        visitor4 = new Visitor(20, 180, 80);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeRegularPrice(){
        assertEquals(4.50, dodgems.priceFor(visitor1), 0.0);
    }

    @Test
    public void canChargeHalfPrice(){
        assertEquals(2.25, dodgems.priceFor(visitor3), 0.0);
    }
}
