import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    TobaccoStall tobaccoStall;
    ArrayList<IReviewed> offerings;

    @Before
    public void before() {
        themePark = new ThemePark(offerings);
        dodgems = new Dodgems("Fun rides!", 3);
        tobaccoStall = new TobaccoStall("Smoke Supreme",
                "Megan Marlboro", ParkingSpot.A1, 4);

    }

    @Test
    public void canAddOffering(){
        themePark.addNewOffering(dodgems);
        assertEquals(1, themePark.getNumberOfIreviewed());
    }

    @Test
    public void canReturnArrayListOfIreviewed(){
        themePark.addNewOffering(dodgems);
        themePark.addNewOffering(tobaccoStall);
        //ArrayList<IReviewed> answer = [dodgems, tobaccoStall];
        assertEquals(2, themePark.getAllReviewed().size());
    }

}
