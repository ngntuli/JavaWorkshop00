package main.java.ngntuli.chapter08;

public class StockItem {
    private static double salesTax;
    private final String stockNumber;
    private final String name;
    private double price;
    private int totalStock;

    public StockItem(String stockNumberIn, String nameIn, double priceIn) {
        stockNumber = stockNumberIn;
        name = nameIn;
        price = priceIn;
        totalStock = 0;
    }

    public static void setSalesTax(double salesTax) {
        StockItem.salesTax = salesTax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double priceIn) {
        price = priceIn;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void increaseTotalStock(int itemIn) {
        totalStock = totalStock + itemIn;
    }

    public double calculateTotalPrice() {
        return price * totalStock;
    }

}
