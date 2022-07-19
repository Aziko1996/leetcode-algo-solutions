package commonproblems.first;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] numberOfPassengersInEachStopArray = new int[1001];
        for (int[] trip : trips) {
            numberOfPassengersInEachStopArray[trip[1]] += trip[0];
            numberOfPassengersInEachStopArray[trip[2]] -= trip[0];
        }
        for (int numberOfPassengers : numberOfPassengersInEachStopArray) {
            capacity -= numberOfPassengers;
            if (capacity  < 0) {
                return false;
            }
        }
        return true;
    }
}
