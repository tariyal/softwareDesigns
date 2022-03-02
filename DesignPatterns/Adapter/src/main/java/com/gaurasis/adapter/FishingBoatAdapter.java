package com.gaurasis.adapter;

public class FishingBoatAdapter  implements RowBoat{
    private final FishingBoat boat;
    public FishingBoatAdapter(){
        this.boat = new FishingBoat();
    }
    public void row() {
        boat.sail();
    }
}
