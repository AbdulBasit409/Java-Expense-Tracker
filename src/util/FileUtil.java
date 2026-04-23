package util;

import model.Expense;
import java.io.*;
import java.util.*;

public class FileUtil {
    private static final String FILE = "expenses.csv";

    public static List<Expense> load() {
        List<Expense> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Expense.fromCSV(line));
            }
        } catch (IOException ignored) {}
        return list;
    }

    public static void save(List<Expense> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            for (Expense e : list) {
                bw.write(e.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data");
        }
    }
}