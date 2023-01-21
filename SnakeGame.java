import java.awt.Color;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.Timer;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 800, HEIGHT = 600;

    private Timer timer;

    public SnakeGame() {
        setFocusable(true);
        addKeyListener(this);
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        timer = new Timer(1000 / 60, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new SnakeGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            // move snake up
        } else if (key == KeyEvent.VK_DOWN) {
            // move snake down
        } else if (key == KeyEvent.VK_LEFT) {
            // move snake left
        } else if (key == KeyEvent.VK_RIGHT) {
            // move snake right
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
