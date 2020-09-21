import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField InputText;

	private double firstNum;
	private double secNum;
	private String lastOp;
	private boolean afterEquals;
	private boolean isFirstDigit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		firstNum = 0;
		secNum = 0;
		lastOp = "";
		afterEquals = false;
		isFirstDigit = true;
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

		InputText = new JTextField();
		InputText.setText("0");
		InputText.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		InputText.setHorizontalAlignment(SwingConstants.RIGHT);
		InputText.setBounds(21, 17, 401, 39);
		frame.getContentPane().add(InputText);
		InputText.setColumns(10);


		JLabel ExpressionText = new JLabel("");
		ExpressionText.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		ExpressionText.setHorizontalAlignment(SwingConstants.RIGHT);
		ExpressionText.setBounds(21, 6, 401, 16);
		frame.getContentPane().add(ExpressionText);


		//NUMBERS
		JButton ZeroButton = new JButton("0");
		ZeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("0");
					ExpressionText.setText("");

				}
				else
					InputText.setText(InputText.getText() + "0");
				isFirstDigit = false;
			}
		});
		ZeroButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		ZeroButton.setBounds(94, 233, 70, 39);
		frame.getContentPane().add(ZeroButton);


		JButton OneButton = new JButton("1");
		OneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("1");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "1");
				isFirstDigit = false;
			}
		});
		OneButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		OneButton.setBounds(21, 192, 70, 39);
		frame.getContentPane().add(OneButton);


		JButton TwoButton = new JButton("2");
		TwoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("2");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "2");
				isFirstDigit = false;
			}
		});
		TwoButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		TwoButton.setBounds(94, 192, 70, 39);
		frame.getContentPane().add(TwoButton);


		JButton ThreeButton = new JButton("3");
		ThreeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("3");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "3");
				isFirstDigit = false;
			}
		});
		ThreeButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		ThreeButton.setBounds(168, 192, 70, 39);
		frame.getContentPane().add(ThreeButton);


		JButton FourButton = new JButton("4");
		FourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("4");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "4");
				isFirstDigit = false;
			}
		});
		FourButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		FourButton.setBounds(21, 151, 70, 39);
		frame.getContentPane().add(FourButton);


		JButton FiveButton = new JButton("5");
		FiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("5");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "5");
				isFirstDigit = false;
			}
		});
		FiveButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		FiveButton.setBounds(94, 151, 70, 39);
		frame.getContentPane().add(FiveButton);


		JButton SixButton = new JButton("6");
		SixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("6");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "6");
				isFirstDigit = false;
			}
		});
		SixButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		SixButton.setBounds(168, 151, 70, 39);
		frame.getContentPane().add(SixButton);


		JButton SevenButton = new JButton("7");
		SevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("7");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "7");
				isFirstDigit = false;
			}
		});
		SevenButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		SevenButton.setBounds(21, 111, 70, 39);
		frame.getContentPane().add(SevenButton);


		JButton EightButton = new JButton("8");
		EightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("8");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "8");
				isFirstDigit = false;
			}
		});
		EightButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		EightButton.setBounds(94, 111, 70, 39);
		frame.getContentPane().add(EightButton);


		JButton NineButton = new JButton("9");
		NineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isFirstDigit)
				{
					InputText.setText("9");
					ExpressionText.setText("");
				}
				else
					InputText.setText(InputText.getText() + "9");
				isFirstDigit = false;
			}
		});
		NineButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		NineButton.setBounds(168, 111, 70, 39);
		frame.getContentPane().add(NineButton);


		JButton DecimalPoint = new JButton(".");
		DecimalPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Input = InputText.getText();
				Character lastDigit = Input.charAt(Input.length()-1);
				if(lastDigit.equals('.'))
					InputText.setText("You cannot have multiple decimal points in one number.");
				//double input = Double.parseDouble(InputText.getText());
				else
					InputText.setText(InputText.getText() + ".");
			}
		});
		DecimalPoint.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		DecimalPoint.setBounds(168, 233, 70, 39);
		frame.getContentPane().add(DecimalPoint);


		//REGULAR OPERATIONS
		JButton AdditionButton = new JButton("+");
		AdditionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(afterEquals)
				{
					firstNum = Double.parseDouble(InputText.getText());
					return;
				}

				String Input = InputText.getText();
				Character lastDigit = Input.charAt(Input.length()-1);
				if(lastDigit.equals('+'))
					InputText.setText("You cannot have multiple addition signs together.");
				
				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + " + ");
				if(lastOp.equals(""))
					firstNum = Double.parseDouble(InputText.getText());
				else
					firstNum = performPrevOperation(firstNum, Double.parseDouble(InputText.getText()), lastOp);

				InputText.setText("");

				lastOp ="+";
			}
		});
		AdditionButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		AdditionButton.setBounds(270, 231, 70, 29);
		frame.getContentPane().add(AdditionButton);


		JButton SubtractionButton = new JButton("-");
		SubtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(afterEquals)
				{
					firstNum = Double.parseDouble(InputText.getText());
					return;
				}

				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + " - ");
				if(lastOp.equals(""))
					firstNum = Double.parseDouble(InputText.getText());
				else
					firstNum = performPrevOperation(firstNum, Double.parseDouble(InputText.getText()), lastOp);

				InputText.setText("");

				lastOp ="-";
			}
		});
		SubtractionButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		SubtractionButton.setBounds(270, 190, 70, 29);
		frame.getContentPane().add(SubtractionButton);


		JButton MultiplicationButton = new JButton("x");
		MultiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(afterEquals)
				{
					firstNum = Double.parseDouble(InputText.getText());
					return;
				}

				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + " x ");
				if(lastOp.equals(""))
					firstNum = Double.parseDouble(InputText.getText());
				else
					firstNum = performPrevOperation(firstNum, Double.parseDouble(InputText.getText()), lastOp);

				InputText.setText("");

				lastOp ="x";
			}
		});
		MultiplicationButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		MultiplicationButton.setBounds(270, 149, 70, 29);
		frame.getContentPane().add(MultiplicationButton);

		JButton DivisionButton = new JButton("\u00F7");
		DivisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(afterEquals)
				{
					firstNum = Double.parseDouble(InputText.getText());
					return;
				}

				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + "\u00F7");

				if(InputText.getText().equals("0"))
				{
					InputText.setText("You cannot divide by 0.");
				}
				else
					if(lastOp.equals(""))
						firstNum = Double.parseDouble(InputText.getText());
					else

						firstNum = performPrevOperation(firstNum, Double.parseDouble(InputText.getText()), lastOp);

				InputText.setText("");

				lastOp ="/";
			}
		});
		DivisionButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		DivisionButton.setBounds(270, 108, 70, 29);
		frame.getContentPane().add(DivisionButton);


		JButton NegatingButton = new JButton("\u00B1");
		NegatingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = InputText.getText();
				//			if(input.length()>10)
				//			{
				//				InputText.setText("This number is too large, try again.");
				//			}
				//			else
				//			{
				int input2 = Integer.parseInt(input);
				int negating = input2 * - 1;
				String negated = Integer.toString(negating);
				InputText.setText(negated);
			}
		});

		NegatingButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		NegatingButton.setBounds(21, 233, 70, 39);
		frame.getContentPane().add(NegatingButton);


		JButton CubeButton = new JButton("x" + "\u00B3");
		CubeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + "\u00B2");
				if( Math.pow( Double.parseDouble(InputText.getText()) , 2 )%1==0)
					InputText.setText(Integer.toString( (int)Math.pow( Double.parseDouble(InputText.getText()) , 3 )));
				else
					InputText.setText(Double.toString( Math.pow( Double.parseDouble(InputText.getText()) , 3 )));
			}
		});
		CubeButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		CubeButton.setBounds(352, 109, 92, 29);
		frame.getContentPane().add(CubeButton);

		JButton SquareButton = new JButton("x" + "\u00B2");
		SquareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + "\u00B2");
				if( Math.pow( Double.parseDouble(InputText.getText()) , 2 )%1==0)
					InputText.setText(Integer.toString( (int)Math.pow( Double.parseDouble(InputText.getText()) , 2 )));
				else
					InputText.setText(Double.toString( Math.pow( Double.parseDouble(InputText.getText()) , 2 )));
			}
		});
		SquareButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		SquareButton.setBounds(352, 150, 92, 29);
		frame.getContentPane().add(SquareButton);


		JButton SquareRootButton = new JButton("SQ RT");
		SquareRootButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpressionText.setText(ExpressionText.getText() + "\u221A" + InputText.getText());
				if( Math.sqrt( Double.parseDouble(InputText.getText()))%1==0)
					InputText.setText(Integer.toString( (int)Math.sqrt(Double.parseDouble(InputText.getText()))));
				else
					InputText.setText(Double.toString(Math.sqrt(Double.parseDouble(InputText.getText()))));
			}
		});
		SquareRootButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		SquareRootButton.setBounds(352, 191, 92, 29);
		frame.getContentPane().add(SquareRootButton);

		JButton ReciprocalButton = new JButton("1/x");
		ReciprocalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpressionText.setText(ExpressionText.getText() + "\u215F" + InputText.getText());
				if((1/Double.parseDouble(InputText.getText()))%1==0)
					InputText.setText(Integer.toString((int)(1/Double.parseDouble(InputText.getText()))));
				else
					InputText.setText(Double.toString(1/Double.parseDouble(InputText.getText())));
			}
		});
		ReciprocalButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		ReciprocalButton.setBounds(352, 231, 92, 29);
		frame.getContentPane().add(ReciprocalButton);

		JButton PercentButton = new JButton("%");
		PercentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = firstNum*Double.parseDouble(InputText.getText())/100.0;
				
				if(value%1==0)
					InputText.setText(Integer.toString((int)value));
				else
					InputText.setText(Double.toString(value));
				//ExpressionText.setText(ExpressionText.getText() + "%");
				//InputText.setText(Double.toString(Double.parseDouble(InputText.getText())/100.0));

			}
		});
		PercentButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		PercentButton.setBounds(352, 68, 92, 29);
		frame.getContentPane().add(PercentButton);


		//CLEARING
		JButton DeleteButton = new JButton("\u232B");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = InputText.getText();
				String Input2 = input.substring(0, input.length() - 1);
				InputText.setText(Input2);	
			}
		});
		DeleteButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		DeleteButton.setBounds(94, 60, 70, 39);
		frame.getContentPane().add(DeleteButton);

		//CLEAR ALL
		JButton ClearAllButton = new JButton("CE");
		ClearAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = 0;
				secNum = 0;
				lastOp = "";
				InputText.setText("0");
				ExpressionText.setText("");
				afterEquals = false;
			}
		});
		ClearAllButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		ClearAllButton.setBounds(21, 60, 70, 39);
		frame.getContentPane().add(ClearAllButton);

		//CLEAR LAST OPERATION
		JButton ClearLastOp = new JButton("C");
		ClearLastOp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				InputText.setText("");
			}
		});
		ClearLastOp.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		ClearLastOp.setBounds(270, 67, 70, 29);
		frame.getContentPane().add(ClearLastOp);

		//EQUALS
		JButton EqualsButton = new JButton("=");
		EqualsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ExpressionText.setText(ExpressionText.getText() + InputText.getText() + " = ");

				secNum = Double.parseDouble(InputText.getText());
				afterEquals=true;

				if(lastOp.equals("+"))
				{
					if((firstNum+secNum)%1==0)
						InputText.setText(Integer.toString((int)(secNum + firstNum)));
					else
						InputText.setText(Double.toString(firstNum+secNum));
					firstNum = secNum + firstNum;
				}
				else if(lastOp.equals("-"))
				{
					if((firstNum-secNum)%1==0)
						InputText.setText(Integer.toString((int)(secNum - firstNum)));
					else
						InputText.setText(Double.toString(firstNum-secNum));
					firstNum = firstNum - secNum;
				}
				else if(lastOp.equals("x"))
				{
					if((firstNum/secNum)%1==0)
						InputText.setText(Integer.toString((int)(secNum * firstNum)));
					else
						InputText.setText(Double.toString(firstNum*secNum));
					firstNum = firstNum * secNum;
				}
				else if(lastOp.equals("/"))
				{
					if(secNum == 0)
					{
						InputText.setText("You can't divide by 0.");
					}
					else
					{
						if((firstNum/secNum)%1==0)
							InputText.setText(Integer.toString((int)(firstNum / secNum)));
						else
							InputText.setText(Double.toString(firstNum/secNum));
						firstNum = firstNum / secNum;
					}
				}

			}
		});
		EqualsButton.setFont(new Font("Bradley Hand", Font.PLAIN, 16));
		EqualsButton.setBounds(168, 60, 70, 39);
		frame.getContentPane().add(EqualsButton);
	}


	//		public static String LargeChecker(String input)
	//		{
	//			if(input.length()>11)
	//			{
	//				input = "This number is too large, please try again.";
	//			}
	//			return input;
	//		}
	//
	//		public static String DivChecker(String secNum)
	//		{
	//			int SecNum = Integer.parseInt(secNum);
	//			if (SecNum == 0)
	//			{
	//				secNum = "You cannot divide by 0.";
	//			}
	//			return secNum;
	//		}

	public static double performPrevOperation(double firstNum, double secondNum, String lastOperation) 
	{
		double result = 0;
		if(lastOperation.equals("+"))
		{
			result = secondNum + firstNum;
		}
		else if(lastOperation.equals("-"))
		{
			result = firstNum - secondNum;
		}
		else if(lastOperation.equals("x"))
		{
			result = firstNum * secondNum;
		}
		else if(lastOperation.equals("/"))
		{
			result = firstNum / secondNum;
		}
		return result;
	}
}