import java.awt.Font;
import javax.swing.JTextField;

public class CalculatorArea {
    public static JTextField input = new JTextField();

    public CalculatorArea() {
        enterArea();
    }
    private void enterArea() {
        input.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
        input.setBounds(15, 10, 240, 40);
        input.setHorizontalAlignment(JTextField.RIGHT);
    }
}
