package service;

import model.Expense;
import util.FileUtil;
import java.util.*;

public class ExpenseService {
    private List<Expense> expenses;

    public ExpenseService() {
        expenses = FileUtil.load();
    }

    public void add(Expense e) {
        expenses.add(e);
        FileUtil.save(expenses);
    }

    public void list() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found");
            return;
        }
        expenses.forEach(System.out::println);
    }

    public void total() {
        double sum = expenses.stream().mapToDouble(e -> e.getAmount()).sum();
        System.out.println("Total spent: ₹" + sum);
    }
}