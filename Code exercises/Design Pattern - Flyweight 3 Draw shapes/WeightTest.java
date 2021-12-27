import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WeightTest extends JFrame {

    JButton drawFlyBtn;
    JButton drawHeavyBtn;

    int windowWidth = 900;
    int windowHeight = 650;

    int dashboardWidth = 200;
    int dashboardHeight = windowHeight;

    int buttonHeight = 40;

    int drawingWidth = windowWidth - dashboardWidth;
    int drawingHeight = windowHeight - buttonHeight;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
                         Color.blue, Color.pink, Color.cyan,
                          Color.magenta, Color.black, Color.gray};

    int ITER = 100000;

    public static void main(String[] args) {
        new WeightTest();
    }

    public WeightTest() {

        this.setSize(windowWidth, windowHeight);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Weight Test");

        // Create panels
        JPanel parentPanel = new JPanel();
        JPanel drawingContainer = new JPanel();
        JPanel drawingPanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        JPanel dashboardPanel = new JPanel();

        // Button panel
        drawFlyBtn = new JButton("Draw light");
        drawHeavyBtn = new JButton("Draw heavy");
        buttonPanel.setSize(windowWidth, buttonHeight);
        buttonPanel.add(drawFlyBtn);
        buttonPanel.add(drawHeavyBtn);

        parentPanel.setLayout(new BorderLayout());
        drawingContainer.setLayout(new BorderLayout());
        drawingContainer.setSize(drawingWidth, windowHeight);
        drawingPanel.setSize(drawingWidth, drawingHeight);
        dashboardPanel.setSize(dashboardWidth, dashboardHeight);

        drawingContainer.add(drawingPanel, BorderLayout.CENTER);
        drawingContainer.add(buttonPanel, BorderLayout.SOUTH);

        parentPanel.add(drawingContainer, BorderLayout.CENTER);
        parentPanel.add(dashboardPanel, BorderLayout.EAST);

        // Button for FlyWeight Test
        drawFlyBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                int i;
                for(i = 0; i < ITER; ++i) {

                    FlyRect rect = RectFactory.getFlyRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                    /* Test
                      g.setColor(getRandColor());
                      g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());
                     */
                }

                long endTime = System.currentTimeMillis();

                System.out.println("FlyWeight test took " + (endTime - startTime));

            }
        });

        // Button for HeavyWeight Test
        drawHeavyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i=0; i < ITER; ++i) {
                    HeavyRect rect = new HeavyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                    rect.draw(g);
                }

                long endTiem = System.currentTimeMillis();

                System.out.println("HeavyWeight test took " + (endTiem - startTime));
            }
        });

        this.add(parentPanel);
        this.setVisible(true);

    }

    private Color getRandColor() {
        Random randGen = new Random();
        int randInt = randGen.nextInt(9);
        return shapeColor[randInt];
    }

    private int getRandX() { return (int)(Math.random() * windowWidth); }
    private int getRandY() { return (int)(Math.random() * windowHeight); }

}
