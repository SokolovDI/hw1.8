import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAction implements ActionListener {


    public void actionPerformed(ActionEvent e) {
        String name = ((JButton) e.getSource()).getText();
        if (name.equals("=") || name.equals("С")) {
        } else {
            CalculatorArea.input.setText(CalculatorArea.input.getText() + name);
        }
        if (name.equals("=")) result();
        if (name.equals("С")) CalculatorArea.input.setText("");
        if (name.equals("√")) {
            double sqrt = Math.sqrt(Double.parseDouble(removeLastChar(CalculatorArea.input.getText())));
            CalculatorArea.input.setText(Double.toString(sqrt));
        }
        CalculatorFrame.frame.repaint();
    }

    private void result() {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            CalculatorArea.input.setText("" + engine.eval(CalculatorArea.input.getText()));
        } catch (ScriptException e1) {
        }
    }
    public String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }
}
