package edu.neu.mgen.Lab3;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColorSelector extends JFrame {
    private JComboBox<String> colorDropdown;
    private JLabel colorLabel;
    private JPanel circlePanel;

    public ColorSelector() {
        setTitle("Color Selector");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] colors = { "Red", "Blue", "Green" };
        colorDropdown = new JComboBox<>(colors);
        colorLabel = new JLabel("Choose a color:");
        circlePanel = new CirclePanel();

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(colorLabel);
        topPanel.add(colorDropdown);
        add(topPanel, BorderLayout.NORTH);
        add(circlePanel, BorderLayout.CENTER);

        colorDropdown.addActionListener(e -> {
            String selectedColor = (String) colorDropdown.getSelectedItem();
            ((CirclePanel) circlePanel).setColor(selectedColor);
            colorLabel.setText("Selected color: " + selectedColor);
        });
    }

    private class CirclePanel extends JPanel {
        private Color color;
        private final Map<String, Color> colorMap;
        private String colorName = ""; // Store the color name for displaying text

        public CirclePanel() {
            this.color = Color.WHITE; // Initial color is white (clear)
            this.colorMap = new HashMap<>();
            colorMap.put("Red", Color.RED);
            colorMap.put("Blue", Color.BLUE);
            colorMap.put("Green", Color.GREEN);
        }

        public void setColor(String colorName) {
            this.color = colorMap.getOrDefault(colorName, Color.WHITE);
            this.colorName = colorName; // Update the color name
            repaint(); // Repaint the panel to reflect the new color and text
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(this.color);
            int diameter = Math.min(getWidth(), getHeight()) - 10; // Reduced margin for bigger circle
            int x = (getWidth() - diameter) / 2;
            int y = (getHeight() - diameter) / 2;
            g.fillOval(x, y, diameter, diameter);

            // Draw the color name inside the circle
            g.setColor(Color.BLACK); // Text color
            FontMetrics metrics = g.getFontMetrics();
            int textWidth = metrics.stringWidth(colorName);
            int textHeight = metrics.getHeight();
            int textX = x + (diameter - textWidth) / 2; // Center text horizontally
            int textY = y + ((diameter - textHeight) / 2) + metrics.getAscent(); // Center text vertically
            g.drawString(colorName, textX, textY);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorSelector colorSelector = new ColorSelector();
            colorSelector.setVisible(true);
        });
    }
}
