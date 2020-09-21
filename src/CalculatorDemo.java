import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class CalculatorDemo {

	private JFrame frame;
	private JTextField textFieldFirst;
	private JTextField textFieldSecond;
	private JButton Division;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorDemo window = new CalculatorDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Number: ");
		lblNewLabel.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 6, 100, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSecondNumber = new JLabel("Second Number: ");
		lblSecondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondNumber.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		lblSecondNumber.setBounds(28, 38, 100, 34);
		frame.getContentPane().add(lblSecondNumber);
		
		JLabel AnswerLabel = new JLabel("Answer: ");
		AnswerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AnswerLabel.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		AnswerLabel.setBounds(39, 174, 100, 34);
		frame.getContentPane().add(AnswerLabel);
		
		textFieldFirst = new JTextField();
		textFieldFirst.setBounds(140, 8, 130, 26);
		frame.getContentPane().add(textFieldFirst);
		textFieldFirst.setColumns(10);
		
		textFieldSecond = new JTextField();
		textFieldSecond.setColumns(10);
		textFieldSecond.setBounds(140, 40, 130, 26);
		frame.getContentPane().add(textFieldSecond);
		
		JLabel Answer = new JLabel("0");
		Answer.setHorizontalAlignment(SwingConstants.LEFT);
		Answer.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		Answer.setBounds(156, 174, 294, 34);
		frame.getContentPane().add(Answer);
		
		
		//ADDING
		JButton Plus = new JButton("+");
		Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int firstNum = Integer.parseInt(textFieldFirst.getText());
				int secondNum = Integer.parseInt(textFieldSecond.getText());
				int result = firstNum + secondNum;
				
				Answer.setText(Integer.toString(result));
				
			}
		});
		Plus.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		Plus.setBounds(38, 87, 40, 26);
		frame.getContentPane().add(Plus);
		
		
		//SUBTRACTION
		JButton Subtraction = new JButton("-");
		Subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int firstNum = Integer.parseInt(textFieldFirst.getText());
				int secondNum = Integer.parseInt(textFieldSecond.getText());
				int result = firstNum - secondNum;
				
				Answer.setText(Integer.toString(result));
			}
		});
		Subtraction.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		Subtraction.setBounds(99, 87, 40, 26);
		frame.getContentPane().add(Subtraction);
		
		
		//MULTIPLICATION
		JButton Multiplication = new JButton("x");
		Multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int firstNum = Integer.parseInt(textFieldFirst.getText());
				int secondNum = Integer.parseInt(textFieldSecond.getText());
				int result = firstNum * secondNum;
				
				Answer.setText(Integer.toString(result));
			}
		});
		Multiplication.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		Multiplication.setBounds(156, 87, 40, 26);
		frame.getContentPane().add(Multiplication);
		
		
		//DIVISION
		Division = new JButton("/");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int firstNum = Integer.parseInt(textFieldFirst.getText());
				int secondNum = Integer.parseInt(textFieldSecond.getText());
				double FirstNum = Double.parseDouble(textFieldFirst.getText());
				double SecondNum = Double.parseDouble(textFieldSecond.getText());
				if(secondNum == 0)
				{
					Answer.setText("You cannot divide by 0");
				}
				else
					{
					int result = firstNum / secondNum;
					int Remainder = firstNum % secondNum;
					double resultWithDec = FirstNum/SecondNum;
					
					
					Answer.setText(Integer.toString(result) + " with a remainder of " + Integer.toString(Remainder) + " or " + resultWithDec);
					}
			}
		});
		Division.setFont(new Font("Bradley Hand", Font.PLAIN, 13));
		Division.setBounds(230, 87, 40, 26);
		frame.getContentPane().add(Division);
	}
}
