import javax.swing.*;
import java.awt.*;

public class BorrowBookFrame extends JFrame {

    public BorrowBookFrame() {
        setTitle("Borrow Book");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel bookLabel = new JLabel("Book Title:");
        JLabel userLabel = new JLabel("Borrower Name:");

        JTextField bookField = new JTextField();
        JTextField userField = new JTextField();

        JButton borrowBtn = new JButton("Validate");

        borrowBtn.addActionListener(e -> {
            if (bookField.getText().isEmpty() || userField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Fields cannot be empty!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (!LibraryApp.books.contains(bookField.getText())) {
                JOptionPane.showMessageDialog(this,
                        "Book not available!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Book borrowed successfully!");
                dispose();
            }
        });

        setLayout(new GridLayout(3, 2, 5, 5));
        add(bookLabel); add(bookField);
        add(userLabel); add(userField);
        add(new JLabel()); add(borrowBtn);

        setVisible(true);
    }
}

