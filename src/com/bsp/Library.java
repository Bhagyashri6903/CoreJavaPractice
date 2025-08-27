package com.bsp;
import java.sql.*;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Information");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book Quantity");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
     

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();

                    System.out.print("Enter Year Published: ");
                    int yearPublished = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    PreparedStatement insert = c.prepareStatement(
                        "INSERT INTO library VALUES (?, ?, ?, ?, ?, ?, ?)"
                    );
                    insert.setInt(1, bookId);
                    insert.setString(2, title);
                    insert.setString(3, author);
                    insert.setString(4, publisher);
                    insert.setInt(5, yearPublished);
                    insert.setString(6, isbn);
                    insert.setInt(7, quantity);

                    insert.executeUpdate();
                    System.out.println("Book added.");
                    break;

                case 2:
                    PreparedStatement select = c.prepareStatement("SELECT * FROM library");
                    ResultSet rs = select.executeQuery();

                    System.out.println("\n--- Book List ---");
                    while (rs.next()) {
                        System.out.println(
                            "ID: " + rs.getInt("bookId") + ", " +
                            "Title: " + rs.getString("title") + ", " +
                            "Author: " + rs.getString("author") + ", " +
                            "Publisher: " + rs.getString("publisher") + ", " +
                            "Year: " + rs.getInt("yearPublished") + ", " +
                            "ISBN: " + rs.getString("isbn") + ", " +
                            "Quantity: " + rs.getInt("quantity")
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to update quantity: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new Quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine();

                    PreparedStatement update = c.prepareStatement("UPDATE library SET quantity = ? WHERE bookId = ?");
                    update.setInt(1, newQuantity);
                    update.setInt(2, updateId);

                    int updateCount = update.executeUpdate();
                    if (updateCount > 0) {
                        System.out.println("Book quantity updated.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();

                    PreparedStatement delete = c.prepareStatement("DELETE FROM library WHERE bookId = ?");
                    delete.setInt(1, deleteId);

                    int deleteCount = delete.executeUpdate();
                    if (deleteCount > 0) {
                        System.out.println("Book deleted.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    c.close();
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}








