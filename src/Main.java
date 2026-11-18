

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) + " for " + names[p] + " mattress: ");
                sales[p][m] = in.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.PrintHeader();
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();
    }
}
