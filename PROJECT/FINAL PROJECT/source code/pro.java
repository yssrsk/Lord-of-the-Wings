package finalna;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pro {

    JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	pro window = new pro();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public pro() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        // Load the image
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\User\\Downloads\\PRESS ANY KEY TO PROCEED.png");

        // Get the screen dimensions
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Get the image dimensions
        int imageWidth = originalIcon.getIconWidth();
        int imageHeight = originalIcon.getIconHeight();

        // Calculate the dimensions for the frame
        int frameWidth = Math.min(imageWidth, screenWidth);
        int frameHeight = Math.min(imageHeight, screenHeight);

        // Create a JLabel with the image
        JLabel lblNewLabel = new JLabel(originalIcon);

        // Set the preferred size of the JLabel to the image's actual size
        lblNewLabel.setPreferredSize(new Dimension(imageWidth, imageHeight));

        // Wrap the JLabel with a JScrollPane
        JScrollPane scrollPane = new JScrollPane(lblNewLabel);

        frame = new JFrame();
        frame.addKeyListener(new KeyAdapter() {
        	public void keyPressed(KeyEvent e) {
        		finalna finals = new finalna();
        		frame.dispose();
        		finals.frame.setVisible(true);
        	}
        });
        frame.setBounds(100, 100, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        scrollPane.setBounds(0, 0, frameWidth, frameHeight);
        frame.getContentPane().add(scrollPane);

        // Set the view position of the scroll pane to the top-left corner
        scrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));
    }
}