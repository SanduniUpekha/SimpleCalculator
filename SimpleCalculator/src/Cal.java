import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cal implements ActionListener{

	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("San Serif",Font.BOLD,35);
	
	double num1=0, num2=0, result=0;
	char operator;
	
	Cal(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
