

public class Product implements IProduct {
    private final String[] names;   // single-dimensional array
    private final int[][] sales;    // two-dimensional array [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++)
            for (int m = 0; m < sales[p].length; m++)
                total += sales[p][m];
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] row : sales) count += row.length;
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int best = -1;
        String bestName = "";
        for (int p = 0; p < sales.length; p++)
            for (int m = 0; m < sales[p].length; m++)
                if (sales[p][m] > best) {
                    best = sales[p][m];
                    bestName = names[p];
                }
        return bestName + "(" + best + ")";
    }
}