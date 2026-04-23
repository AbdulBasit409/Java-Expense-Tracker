package model;

public class Expense {
    private String title;
    private double amount;
    private String category;
    private String date;

    public Expense(String title, double amount, String category, String date) {
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public String toCSV() {
        return title + "," + amount + "," + category + "," + date;
    }

    public static Expense fromCSV(String line) {
        String[] parts = line.split(",");
        return new Expense(parts[0], Double.parseDouble(parts[1]), parts[2], parts[3]);
    }

    public String toString() {
        return title + " | ₹" + amount + " | " + category + " | " + date;
    }

    public double getAmount() {
        return amount;
    }
}