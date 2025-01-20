// Consider an array that has the data shown below. Write a java program to do the following:
// The mean. mean = sum of all element/number of element.
// Print out the median. median = element at the middle
// The standard deviation = √∑▒(x_i−μ)^2/N 
// 	where N is size of population, μ is the population mean
// 	 x_i is each value from the population
	

public class standardDeviation {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double mean = 0;
        double median = 0;
        double standardDeviation = 0;
        double sumOfSquaredDifferences = 0;
        double N = arr.length;

        for (double element : arr) {
            sum += element;
        }
        mean = sum / N;

        for (double element : arr) {
            sumOfSquaredDifferences += Math.pow(element - mean, 2);
        }
        standardDeviation = Math.sqrt(sumOfSquaredDifferences / N);

        if (N % 2 == 0) {
            median = (arr[(int) (N / 2)] + arr[(int) (N / 2) - 1]) / 2;
        } else {
            median = arr[(int) (N / 2)];
        }

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}