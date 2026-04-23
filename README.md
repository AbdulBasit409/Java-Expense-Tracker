# Java Expense Tracker

A simple command-line application built in Java to track daily expenses. It allows users to add, view, and calculate total expenses with persistent storage using a CSV file.

## Features

* Add new expenses with title, amount, category, and date
* View all recorded expenses
* Calculate total spending
* Data persistence using a CSV file (data is saved between runs)

## Project Structure

```
expense-tracker/
 ├─ src/
 │   ├─ Main.java
 │   ├─ model/Expense.java
 │   ├─ service/ExpenseService.java
 │   └─ util/FileUtil.java
 └─ expenses.csv
```

## How It Works

* The application runs in a loop with a menu-driven interface
* Expenses are stored in memory using a list
* Data is written to and read from `expenses.csv`
* On startup, previous expenses are loaded automatically

## Requirements

* Java JDK 8 or higher

## How to Run

### Compile

```
javac -d out src/Main.java src/model/*.java src/service/*.java src/util/*.java
```

### Run

```
java -cp out Main
```

## Example Usage

```
1. Add Expense
2. View Expenses
3. Total खर्च
4. Exit
```

## Future Improvements

* Edit and delete expenses
* Filter by category or date
* Monthly expense reports
* Switch to database storage

## Author

Abdul Basit
