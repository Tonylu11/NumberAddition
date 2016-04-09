package my.numberaddition;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Number Addition GUI.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class NumberAdditionUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstNumberJTxtField;
	private JTextField secondNumberJTextField;
	private JTextField resultJTxtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberAdditionUI frame = new NumberAdditionUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NumberAdditionUI() {
		setTitle("Number Addition");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Number Addition", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 19, 325, 145);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel firstNumberLabel = new JLabel("First Number:");
		firstNumberLabel.setBounds(10, 29, 89, 14);
		panel.add(firstNumberLabel);

		JLabel secondNumberLabel = new JLabel("Second Number:");
		secondNumberLabel.setBounds(10, 54, 121, 14);
		panel.add(secondNumberLabel);

		JLabel resultLabel = new JLabel("Result:");
		resultLabel.setBounds(10, 79, 89, 14);
		panel.add(resultLabel);

		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				try {
					num1 = Float.parseFloat(firstNumberJTxtField.getText());
					num2 = Float.parseFloat(secondNumberJTextField.getText());
					result = num1 + num2;
					resultJTxtField.setText(String.valueOf(result));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(contentPane, "ERROR. Deben de ser números.", "Error.",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		addButton.setBounds(64, 111, 89, 23);
		panel.add(addButton);

		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumberJTxtField.setText("");
				secondNumberJTextField.setText("");
				resultJTxtField.setText("");
			}
		});
		clearButton.setBounds(163, 111, 89, 23);
		panel.add(clearButton);

		firstNumberJTxtField = new JTextField();
		firstNumberJTxtField.setBounds(109, 26, 200, 20);
		panel.add(firstNumberJTxtField);
		firstNumberJTxtField.setColumns(10);

		secondNumberJTextField = new JTextField();
		secondNumberJTextField.setBounds(109, 51, 200, 20);
		panel.add(secondNumberJTextField);
		secondNumberJTextField.setColumns(10);

		resultJTxtField = new JTextField();
		resultJTxtField.setEditable(false);
		resultJTxtField.setBounds(109, 76, 200, 20);
		panel.add(resultJTxtField);
		resultJTxtField.setColumns(10);

		JButton btnJbutton = new JButton("Exit");
		btnJbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnJbutton.setBounds(246, 175, 89, 23);
		contentPane.add(btnJbutton);
	}
}
