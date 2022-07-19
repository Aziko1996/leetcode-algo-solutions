package commonproblems.first;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            int difference = prices[i] - min;
            if (difference > maxProfit) maxProfit = difference;
        }
        return maxProfit;
    }

}
