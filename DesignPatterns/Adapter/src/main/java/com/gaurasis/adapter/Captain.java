package com.gaurasis.adapter;

public class Captain {

    private  final RowBoat  boat;

    public Captain(RowBoat boat) {
        this.boat = boat;
    }
    public void row(){
        boat.row();
    }

    public static void main(String[] args) {
        Captain captain  = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
