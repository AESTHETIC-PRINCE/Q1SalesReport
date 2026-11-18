

public class PrintProduct {
    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026\n");
        System.out.println("*".repeat(45));
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        double avg = product.GetAverageProductSold();
        String text = (avg == Math.floor(avg)) ? String.valueOf((int) avg) : String.format("%.2f", avg);
        System.out.println("AVERAGE PRODUCT SALES: " + text);
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
