import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import org.json.simple.JSONObject;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gitTask {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ButtonGroup group;
	JSONObject file = new JSONObject();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gitTask window = new gitTask();
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
	public gitTask() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		group = new ButtonGroup();
		frame.setForeground(Color.YELLOW);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 941, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 927, 479);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 78, 81, 32);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(123, 78, 138, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo.setForeground(Color.BLACK);
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollNo.setBounds(42, 139, 81, 32);
		panel.add(lblRollNo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 139, 138, 32);
		panel.add(textField_1);
		
		JLabel lblRollNo_1 = new JLabel("section");
		lblRollNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo_1.setForeground(Color.BLACK);
		lblRollNo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollNo_1.setBounds(42, 200, 81, 32);
		panel.add(lblRollNo_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 203, 138, 32);
		panel.add(textField_2);
		
		JLabel lblRollNo_1_1 = new JLabel("Gender");
		lblRollNo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo_1_1.setForeground(Color.BLACK);
		lblRollNo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollNo_1_1.setBounds(42, 272, 81, 32);
		panel.add(lblRollNo_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(136, 280, 60, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(214, 280, 72, 21);
		panel.add(rdbtnFemale);
		group.add(rdbtnFemale);
		group.add(rdbtnNewRadioButton);
		
		JLabel lblRollNo_1_2 = new JLabel("Batch");
		lblRollNo_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo_1_2.setForeground(Color.BLACK);
		lblRollNo_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollNo_1_2.setBounds(42, 354, 81, 32);
		panel.add(lblRollNo_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 357, 138, 32);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				file.put("Name", textField.getText().toString());
				file.put("Roll Number", Integer.parseInt(textField_1.getText().toString()));
				file.put("section", textField_2.getText().toString());
				if(rdbtnNewRadioButton.isSelected()) {
					file.put("Gender",rdbtnNewRadioButton.getText().toString());
				}
				else if (rdbtnFemale.isSelected()) {
					file.put("Gender",rdbtnFemale.getText().toString());
				}
				
				file.put("batch",textField_3.getText().toString());
				JOptionPane.showMessageDialog(null, "Data is stored in JSON File");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(123, 424, 81, 32);
		panel.add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println(file);
				JOptionPane.showMessageDialog(null, file);
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrint.setBounds(255, 424, 81, 32);
		panel.add(btnPrint);
	}
}
