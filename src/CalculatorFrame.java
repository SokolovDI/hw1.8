import javax.swing.JFrame;

public class CalculatorFrame {

    public static JFrame frame = new JFrame("Calculator v1.0");
    public CalculatorFrame() {
        frame.setSize(280, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        new CalculatorArea();
        new CalculatorButtons();
        frame.add(CalculatorArea.input);
        frame.setVisible(true);
    }
}

