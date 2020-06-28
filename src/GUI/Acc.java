package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class Acc extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Acc frame = new Acc();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Acc()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(10, 90));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 48, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(68, 9, 96, 20);
		panel.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(178, 12, 68, 13);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(256, 9, 96, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 46, 48, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(68, 44, 96, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Birthdate:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(178, 47, 68, 13);
		panel.add(lblNewLabel_3);
		
		JButton Createbtn = new JButton("Create");
		Createbtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Createbtn.setBounds(425, 64, 91, 25);
		panel.add(Createbtn);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(256, 40, 124, 24);
		panel.add(dob);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(634, 0, 17, 100);
		panel.add(scrollBar_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 245));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_1.add(scrollBar);
		
		table_1 = new JTable();
		table_1.setRowSelectionAllowed(false);
		table_1.setPreferredSize(new Dimension(500, 150));
		panel_1.add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		table = new JTable();
		panel_1.add(table);
	}
}
