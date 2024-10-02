import java.util.ArrayList;

public class StockPriceAnalysis {

    // Method to calculate the average stock price from an array of prices
    public static float calculateAveragePrice(float[] stockPrices) {
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // Method to find the maximum stock price from an array of prices
    public static float findMaximumPrice(float[] stockPrices) {
        float maxPrice = stockPrices[0];
        for (float price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific price in an array of prices
    public static int countOccurrences(float[] stockPrices, float targetPrice) {
        int count = 0;
        for (float price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices in an ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Example array of stock prices (10 days of data as floats)
        float[] stockPricesArray = {100.5f, 102.3f, 98.6f, 101.8f, 97.2f, 103.5f, 104.0f, 99.8f, 98.4f, 100.2f};
        
        // Example ArrayList of stock prices
        ArrayList<Float> stockPricesList = new ArrayList<>();
        for (float price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculating and printing the average stock price
        System.out.println("Average Stock Price: " + calculateAveragePrice(stockPricesArray));

        // Finding and printing the maximum stock price
        System.out.println("Maximum Stock Price: " + findMaximumPrice(stockPricesArray));

        // Counting and printing the occurrences of a specific price
        float targetPrice = 100.5f;
        System.out.println("Occurrences of " + targetPrice + ": " + countOccurrences(stockPricesArray, targetPrice));

        // Computing and printing the cumulative sum of stock prices
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}
