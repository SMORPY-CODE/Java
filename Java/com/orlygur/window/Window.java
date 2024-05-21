package com.orlygur.window;

import java.awt.*;
import java.awt.event.*;

public class Window extends Canvas {
    private Frame frame;
    private String customText;
    private int textX, textY;

    public Window(String name) {
        // Create a new Frame (window) with the specified title
        frame = new Frame(name);

        // Set the size of the frame
        frame.setSize(800, 600);

        // Add the Canvas (this Window instance) to the frame
        frame.add(this);

        // Make the frame visible
        frame.setVisible(true);

        // Add a window listener to handle window close events
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Close the window when the close button is clicked
            }
        });

        // Initialize custom text with default values
        customText = "Hello, World!";
        textX = 100;
        textY = 100;
    }

    // Method to set custom text and its position, then trigger a repaint
    public void addText(String text, int x, int y) {
        customText = text;
        textX = x;
        textY = y;
        repaint(); // Request a repaint to update the drawing
    }

    @Override
    public void paint(Graphics g) {
        // Draw the custom text at the specified position
        g.drawString(customText, textX, textY);
    }

} //note i have no idea how this works
