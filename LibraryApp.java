import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LibraryApp extends JFrame {

    public static ArrayList<String> books = new ArrayList<>();

    public LibraryApp() {
        setTitle("Library Management System");

        // ===== Fullscreen =====
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== Main Container =====
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        add(mainPanel);

        // ===== LEFT : Gradient Panel =====
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                GradientPaint gradient = new GradientPaint(
                        0, 0, new Color(150, 220, 255),   // cyan
                        getWidth(), getHeight(), new Color(190, 160, 255) // lavender
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setLayout(new BorderLayout());
        gradientPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 70));

        JLabel leftText = new JLabel(
                "<html><b style='font-size:14px;'>Get access to your library management<br>system</b><br><br>" +
                "<span style='font-size:8px;'>your cozy and lovable library!</span></html>"
        );
        leftText.setForeground(Color.WHITE);
        gradientPanel.add(leftText, BorderLayout.SOUTH);

        // ===== RIGHT : Content Panel =====
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(200, 90, 80, 120));

        JLabel welcome = new JLabel("Welcome Back Librarian!");
        welcome.setFont(new Font("SansSerif", Font.BOLD, 27));
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);

        rightPanel.add(welcome);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 40)));

        // ===== Buttons =====
        JButton addBtn = createButton("Add Book");
        JButton searchBtn = createButton("Search Book");
        JButton borrowBtn = createButton("Borrow Book");
        JButton exitBtn = createButton("Exit");

        addBtn.addActionListener(e -> new AddBookFrame());
        searchBtn.addActionListener(e -> new SearchBookFrame());
        borrowBtn.addActionListener(e -> new BorrowBookFrame());
        exitBtn.addActionListener(e -> System.exit(0));

        rightPanel.add(addBtn);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        rightPanel.add(searchBtn);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        rightPanel.add(borrowBtn);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        rightPanel.add(exitBtn);

        // ===== Add Panels =====
        mainPanel.add(gradientPanel);
        mainPanel.add(rightPanel);

        setVisible(true);
    }

    // ===== Custom Button Style =====
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(220, 38));
        button.setFont(new Font("SansSerif", Font.PLAIN, 14));
        button.setBackground(new Color(90, 95, 255)); // blue-violet
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    public static void main(String[] args) {
        new LibraryApp();
    }
}
