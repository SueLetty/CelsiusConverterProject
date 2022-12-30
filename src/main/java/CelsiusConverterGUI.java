import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CelsiusConverterGUI extends JFrame {

  private JPanel mainPanel;
  private JTextField celsiusTextField;
  private JLabel celsiusLabel;
  private JButton button;
  private JLabel fahrenheitLabel;
  private JTextField fahrenheitTextField;

  public CelsiusConverterGUI(String title){
    super(title);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(mainPanel);
    this.pack();
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int tempFahr = (int) ((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
        fahrenheitTextField.setText(String.valueOf(tempFahr));
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new  CelsiusConverterGUI("My Celsius Converter");
    frame.setVisible(true);
  }
}
