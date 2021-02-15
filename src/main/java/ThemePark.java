import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> offerings;

    public ThemePark(ArrayList<IReviewed> offerings){
        this.offerings = new ArrayList<IReviewed>();
    }

    public int getNumberOfIreviewed(){
        return offerings.size();
    }

    public void addNewOffering(IReviewed iReviewed){
        offerings.add(iReviewed);
    }
}
