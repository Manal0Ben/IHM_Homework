import javax.swing.*;
import java.awt.*;

public class AddBookFrame extends JFrame {

    public AddBookFrame() {
        setTitle("Add Book");
        setSize(300, 250);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Title:");
        JLabel authorLabel = new JLabel("Author:");
        JLabel yearLabel = new JLabel("Year:");

        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField yearField = new JTextField();

        JButton addBtn = new JButton("Add Book");

        addBtn.addActionListener(e -> {
            if (titleField.getText().isEmpty() ||
                authorField.getText().isEmpty() ||
                yearField.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "Please fill all fields!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                LibraryApp.books.add(titleField.getText());
                JOptionPane.showMessageDialog(this,
                        "Book added successfully!");
                dispose();
            }
        });

        setLayout(new GridLayout(4, 2, 5, 5));
        add(titleLabel); add(titleField);
        add(authorLabel); add(authorField);
        add(yearLabel); add(yearField);
        add(new JLabel()); add(addBtn);

        setVisible(true);
    }
}

