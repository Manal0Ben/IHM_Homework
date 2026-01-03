import javax.swing.*;
import java.awt.*;

public class SearchBookFrame extends JFrame {

    public SearchBookFrame() {
        setTitle("Search Book");
        setSize(350, 200);
        setLocationRelativeTo(null);

        JLabel searchLabel = new JLabel("Book Title:");
        JTextField searchField = new JTextField();
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        JButton searchBtn = new JButton("Search");

        searchBtn.addActionListener(e -> {
            String title = searchField.getText();
            if (LibraryApp.books.contains(title)) {
                resultArea.setText("Book found: " + title);
            } else {
                resultArea.setText("Book not found.");
            }
        });

        setLayout(new BorderLayout());
        JPanel top = new JPanel(new GridLayout(1, 3));
        top.add(searchLabel);
        top.add(searchField);
        top.add(searchBtn);

        add(top, BorderLayout.NORTH);
        add(resultArea, BorderLayout.CENTER);

        setVisible(true);
    }
}