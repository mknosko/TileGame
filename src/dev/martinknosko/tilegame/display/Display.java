package dev.martinknosko.tilegame.display;

import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame frame;
    private Canvas canvas;

    private String title;
    private int width, height;

    public Display(String title, int width, int height)
    {
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    private void createDisplay()
    {
        frame = new JFrame(title);  // vytvorenie noveho JFrame
        frame.setSize(width, height);   // nastavenie velkosti okna
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // aby sa pri zatvoreni okna skoncil aj program
        frame.setResizable(false);  // aby sme nemohli menit velkost okna
        frame.setLocationRelativeTo(null);  // aby sa okno zobrazilo v strede obrazovky
        frame.setVisible(true); // defaulte sa JFrame nezobrazuje a preto ho musime nastavit

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
