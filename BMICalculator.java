import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator implements ActionListener {
    JFrame frame;
    JLabel label_height;
    JLabel label_weight;
    JButton button;
    JTextField textField_height;
    JTextField textField_weight;
    JTextField result;
    public BMICalculator()
    {
        label_height = new JLabel();
        label_height.setText("please input your height in m");
        label_height.setBounds(10,50,200,50);

        textField_height = new JTextField();
        textField_height.setBounds(220,50,100,50);

        label_weight = new JLabel();
        label_weight.setText("please input your weight in kg");
        label_weight.setBounds(10,100,200,50);

        textField_weight = new JTextField();
        textField_weight.setBounds(220,100,100,50);

        result = new JTextField();
        result.setEditable(false);
        result.setBounds(10,160,300,50);

        button = new JButton();
        button.setText("calculate");
        button.setBounds(340,50,160,160);
        button.addActionListener(this);

        frame = new JFrame("BMICalculator");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(label_height);
        frame.add(textField_height);
        frame.add(label_weight);
        frame.add(textField_weight);
        frame.add(result);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            double height = Double.valueOf(textField_height.getText().toString());
            double weight = Double.valueOf(textField_weight.getText().toString());
            double Result = weight / (Math.pow(height,2));
            result.setText(Double.toString(Result));
        }
    }
}
