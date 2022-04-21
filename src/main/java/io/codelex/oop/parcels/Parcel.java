package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private int sum = xLength + yLength + zLength;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (sum < 300 && xLength > 30 && yLength > 30 && zLength > 30) {
            if (weight < 30 && !isExpress) {
                return true;
            } else if (weight < 15 && isExpress) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
