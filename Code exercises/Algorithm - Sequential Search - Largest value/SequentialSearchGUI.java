import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class SequentialSearchGUI extends JFrame {

    public static int input;
    JTextField inputField;

    int windowWidth = 500;
    int windowHeight = 350;

    int textAreaWidth = 400;
    int textAreaHeight = 300;

    public static void main(String[] args) { new SequentialSearchGUI(); }

    public SequentialSearchGUI() {

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sequential Search Algorithm Demo");

        // Create components (panel and button)
        JPanel gui = new JPanel();
        JTextArea textArea = new JTextArea();

        // dashboard panel
        textArea.setSize(textAreaWidth, textAreaHeight);
        textArea.setBorder(BorderFactory.createLineBorder(Color.blue));

        // input panel - perform search computation`
        inputField = new JTextField("", 1);
        inputField.setPreferredSize(new Dimension(100, 30));
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                input = Integer.parseInt(inputField.getText());
                NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);
                DecimalFormat df = new DecimalFormat("#.000");

                SequentialSearch ss = new SequentialSearch();
                ss.searchSequence();

                Font font = new Font("Arial", Font.BOLD, 17);
                textArea.setFont(font);
                textArea.setText("Input size: " + nf.format(input) +
                                 "\nLargest index: " + ss.largestPosition +
                                 "\nLargest value: " + ss.arr[ss.findLargest(ss.arr)] +
                                 "\nArray: " + Arrays.toString(Arrays.copyOfRange(ss.arr, 0, 10)) +
                                 "\nRuntime: " + df.format((ss.endTime - ss.startTime) * 0.001) + " seconds \n");
            }
        });

        // mother panel
        gui.setSize(windowWidth, windowHeight);
        gui.setLayout(new BorderLayout());
        gui.add(textArea, BorderLayout.CENTER);
        gui.add(inputField, BorderLayout.SOUTH);

        this.add(gui);
        this.setVisible(true);
    }


}
