import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class DrawShapes extends JFrame {

    // Draw or clear drawings on panel
    JButton drawBtn, clearBtn;

    int windowWidth = 1000;
    int windowHeight = 750;
    int ITER = 10000;
    int[] arcWidthRange = new int[ITER];
    int[] arcHeightRange = new int[ITER];

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow, Color.black,
                            Color.blue, Color.pink, Color.cyan, Color.magenta,
                            Color.white, Color.green, Color.darkGray};

    public static void main(String[] args) {

      new DrawShapes();

    }

    public DrawShapes(){

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Draw shapes");

        JPanel contentPane = new JPanel();
        // JPanel clearBtnPane = new JPanel();
        JPanel drawBtnPane = new JPanel();

        drawBtn = new JButton("Draw shapes");
        clearBtn = new JButton("Clear drawing");

        drawBtnPane.add(drawBtn);
        // clearBtnPane.add(clearBtn);

        final JPanel drawingPanel = new JPanel();

        contentPane.setLayout(new BorderLayout());
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        // contentPane.add(clearBtnPane, BorderLayout.NORTH);
        contentPane.add(drawBtnPane, BorderLayout.SOUTH);

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        drawBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Time the amount of time taken to draw
                long startTime = System.currentTimeMillis();

                for (int i=0; i < ITER; ++i) {
                    int arcWidth = getArcWidth();
                    int arcHeight = getArcHeight();

                    Graphics g = drawingPanel.getGraphics();

                    g.setColor(getRandColor());
                    g.fillRoundRect(getRandX(), getRandY(), getRandX(), getRandY(), arcWidth, arcHeight);

                    // collect arc width/height values
                    arcWidthRange[i] = arcWidth;
                    arcHeightRange[i] = arcHeight;

                    System.out.println("X value: " + getRandX() + "\n" +
                                        "Y value: " + getRandY() + "\n" +
                                        "Arc width: " + getArcWidth() + "\n" +
                                        "Arc height: " + getArcHeight());
                }

                long endTime = System.currentTimeMillis();

                Arrays.sort(arcWidthRange);
                Arrays.sort(arcHeightRange);

                int arcWidthMin = arcWidthRange[0];
                int arcWidthMax = arcWidthRange[arcWidthRange.length - 1];

                int arcHeightMin = arcHeightRange[0];
                int arcHeightMax = arcHeightRange[arcHeightRange.length - 1];

                System.out.println("\nThat took " + (endTime - startTime));
                System.out.println("Arc width range: " + arcWidthMin + " ~ " + arcWidthMax );
                System.out.println("Arc height range: " + arcHeightMin + " ~ " + arcHeightMax );

            }
        });

        // .add will make the contentPane appear inside the JFrame we are creating.
        this.add(contentPane);
        this.setVisible(true);

    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);
        return shapeColor[randInt];
    }

    private int getRandAngle() {
        Random randGen = new Random();
        int randInt = randGen.nextInt(10, 100);
        return randInt;
    }

    private int getRandX() { return (int)(Math.random() * windowWidth); }

    private int getRandY() { return (int)(Math.random() * windowWidth); }

    private int getArcWidth() { return (int)(Math.random() * getRandAngle()); }

    private int getArcHeight() { return (int)(Math.random() * getRandAngle()); }

}
