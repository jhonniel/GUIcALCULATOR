import javax.swing.*;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
public class CalculatorUI extends JFrame {

	
    JLabel lblFirst,lblSecond ,lblthe;
    JTextField txtFirst, txtSecond ;
    JButton btnAdd,btnSubtract,btnMultiply,btnDivide,btnClose,btnModulo;
    double ans;
    
    
    
public CalculatorUI() {
	lblFirst=new JLabel("First Number:");
	lblSecond=new JLabel("Second Number:");
    lblthe = new JLabel();
	txtFirst=new JTextField();
	txtSecond=new JTextField();
	
	btnAdd=new JButton("+");
	btnSubtract = new JButton("-");
	btnMultiply = new JButton("*");
	btnDivide = new JButton("/");
	btnModulo = new JButton("%");
	btnClose=new JButton("X");
	 
	setLayout(null);
	
	add(lblFirst).setBounds(10, 30, 100, 20);
	add(txtFirst).setBounds(110, 10, 250, 50);
	add(lblSecond).setBounds(10, 80, 130, 20);
	add(txtSecond).setBounds(110, 65, 250, 50);
	
	
	add(btnAdd).setBounds(20, 130, 100, 60);
	add(btnSubtract).setBounds(140, 130, 100, 60);
	add(btnMultiply).setBounds(260, 130, 100, 60);
	
	add(btnDivide).setBounds(20, 200, 100, 60);
	add(btnModulo).setBounds(140, 200, 100, 60);
	add(btnClose).setBounds(260, 200, 100, 60);
	
	add(lblthe).setBounds(20,260,500,30);
	
	
	
	
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			double num1=Double.parseDouble(txtFirst.getText());
			double num2=Double.parseDouble(txtSecond.getText());
			ans= num1+num2;
                 lblthe.setText("The sum is "+ ans);
                 txtFirst.setText("");
		         txtSecond.setText("");
		       
    	 
    	 
    	 
         }
	});	
	
	btnSubtract.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			double num1=Double.parseDouble(txtFirst.getText());
			double num2=Double.parseDouble(txtSecond.getText());
			ans= num1-num2;
		         lblthe.setText("The difference is "+ ans);
		         txtFirst.setText("");
		         txtSecond.setText("");
		       
			
		}
	});
	btnMultiply.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			double num1=Double.parseDouble(txtFirst.getText());
			double num2=Double.parseDouble(txtSecond.getText());
			ans= num1*num2;
		         lblthe.setText("The quotient is "+ ans);
		         txtFirst.setText("");
		         txtSecond.setText("");
		       
		         
	
		}
	});
	btnDivide.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			double num1=Double.parseDouble(txtFirst.getText());
			double num2=Double.parseDouble(txtSecond.getText());
			ans= num1/num2;
		         lblthe.setText("The quotient is "+ ans);
		         txtFirst.setText("");
		         txtSecond.setText("");
		       
		         
		 
			
		}
	});
	btnModulo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			double num1=Double.parseDouble(txtFirst.getText());
			double num2=Double.parseDouble(txtSecond.getText());
			ans= num1%num2;
		         lblthe.setText("The remainder is "+ ans);
		         txtFirst.setText("");
		         txtSecond.setText("");
		       
		 
			
		}
	});
	
	
	
	
   btnClose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	        System.exit(0);
		}});	  
   btnAdd.setFont(new Font("Calibri", Font.PLAIN, 50));
   btnMultiply.setFont(new Font("Calibri", Font.PLAIN, 50));
   btnSubtract.setFont(new Font("Calibri", Font.PLAIN, 50));
   btnDivide.setFont(new Font("Calibri", Font.PLAIN, 50));
   btnModulo.setFont(new Font("Calibri", Font.PLAIN, 50));
   btnClose.setFont(new Font("Calibri", Font.PLAIN, 50));
   lblthe.setFont(new Font("Calibri", Font.PLAIN, 25));
   txtFirst.setFont(new Font("Calibri", Font.PLAIN, 25));
   txtSecond.setFont(new Font("Calibri", Font.PLAIN, 25));
 
  lblthe.setForeground(Color.RED);
   
			setTitle("Calculator");
			setSize(400, 450);
			setLocationRelativeTo(null);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public static void main(String[] args) {
	new CalculatorUI();
}
}