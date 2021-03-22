import javax.swing.JButton;
import java.awt.event.ActionListener;

public class CalculatorButtons {
    public CalculatorButtons() {
        addButton();
    }

    private void addButton() {

        String[] symbol = new String[]{"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*",
                ".", "0", "=", "/", "(", ")", "С", "√"};
        JButton[] jButtons = new JButton[symbol.length];
        int num = 0;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 4; k++) {
                jButtons[num] = new JButton();
                jButtons[num].setText(symbol[num]);
                jButtons[num].setBounds(15 + k * 60, 60 + i * 60, 60, 60);
                CalculatorFrame.frame.add(jButtons[num]);

                ActionListener numButton = new CalculatorAction();
                jButtons[num].addActionListener(numButton);
                if (num < symbol.length - 1) num++;
                else break;
            }
        }
    }
}
