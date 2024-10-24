import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class IC {

	private JFrame ICFrame;
	private JTextField ttf;
	private JTextField nop;
	private JTextField mtda;
	String TTF,NOP,MTDA,T_8,I_8,PP_8,R_8,T_9,I_9,PP_9,R_9,T_1,I_1,PP_1,R_1,T_1_1,I_1_1,PP_1_1,R_1_1;
	int TTF_1,NOP_1,MTDA_1,t_8,r_8,t_9,r_9,t_1,r_1,t_1_1,r_1_1;
    double i_8,i_9,i_1,i_1_1,pp_8,pp_9,pp_1,pp_1_1;
    int per, Mtda_1,f_8,rf_8,f_9,rf_9,f_1,rf_1,f_1_1,rf_1_1;
    String Mtda, Per, F_8, RF_8,F_9, RF_9,F_1, RF_1,F_1_1, RF_1_1 ;
    LocalDate date = LocalDate.now();
    int day = date.getDayOfMonth();
    int cd = 31-day;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IC window = new IC();
					window.ICFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ICFrame = new JFrame();
		ICFrame.getContentPane().setBackground(new Color(222, 184, 135));
		ICFrame.setBounds(100, 100, 800, 406);
		ICFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ICFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(205, 133, 63));
		panel.setBounds(10, 11, 338, 32);
		ICFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Incentive Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 0, 283, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setBorder(new TitledBorder(null, "Calculator", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 54, 338, 109);
		ICFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Target");
		lblNewLabel_1.setBounds(10, 31, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("No of P");
		lblNewLabel_1_1.setBounds(10, 56, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MTD ACHMT");
		lblNewLabel_1_2.setBounds(10, 81, 71, 14);
		panel_1.add(lblNewLabel_1_2);
		
		ttf = new JTextField();
		ttf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nop.requestFocus();
			}
		});
		ttf.setFont(new Font("Tahoma", Font.BOLD, 12));
		ttf.setBounds(106, 28, 159, 20);
		panel_1.add(ttf);
		ttf.setColumns(10);
		
		nop = new JTextField();
		nop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mtda.requestFocus();
			}
		});
		nop.setFont(new Font("Tahoma", Font.BOLD, 12));
		nop.setColumns(10);
		nop.setBounds(106, 53, 159, 20);
		panel_1.add(nop);
		
		mtda = new JTextField();
		mtda.setFont(new Font("Tahoma", Font.BOLD, 12));
		mtda.setColumns(10);
		mtda.setBounds(106, 78, 159, 20);
		panel_1.add(mtda);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(244, 164, 96));
		panel_2.setBorder(new TitledBorder(null, "80 %", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(358, 11, 201, 152);
		ICFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("80 % target :");
		lblNewLabel_3.setBounds(10, 33, 82, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Total incentive :");
		lblNewLabel_3_1.setBounds(10, 58, 94, 14);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Per Person :");
		lblNewLabel_3_2.setBounds(10, 83, 82, 14);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("RRR :");
		lblNewLabel_3_3.setBounds(10, 108, 82, 14);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel t_8_0 = new JLabel("0");
		t_8_0.setFont(new Font("Tahoma", Font.BOLD, 13));
		t_8_0.setBounds(102, 33, 89, 14);
		panel_2.add(t_8_0);
		
		JLabel i_8_0 = new JLabel("0");
		i_8_0.setFont(new Font("Tahoma", Font.BOLD, 13));
		i_8_0.setBounds(102, 58, 89, 14);
		panel_2.add(i_8_0);
		
		JLabel pp_8_0 = new JLabel("0");
		pp_8_0.setFont(new Font("Tahoma", Font.BOLD, 13));
		pp_8_0.setBounds(102, 83, 89, 14);
		panel_2.add(pp_8_0);
		
		JLabel rrr_8_0 = new JLabel("0");
		rrr_8_0.setFont(new Font("Tahoma", Font.BOLD, 13));
		rrr_8_0.setBounds(102, 108, 89, 14);
		panel_2.add(rrr_8_0);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(244, 164, 96));
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "91 %", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(573, 11, 201, 152);
		ICFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3_4 = new JLabel("91 % target :");
		lblNewLabel_3_4.setBounds(10, 36, 82, 14);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Total incentive :");
		lblNewLabel_3_1_1.setBounds(10, 61, 90, 14);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Per Person :");
		lblNewLabel_3_2_1.setBounds(10, 86, 82, 14);
		panel_3.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("RRR :");
		lblNewLabel_3_3_1.setBounds(10, 113, 82, 14);
		panel_3.add(lblNewLabel_3_3_1);
		
		JLabel t_9_1 = new JLabel("0");
		t_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		t_9_1.setBounds(102, 36, 89, 14);
		panel_3.add(t_9_1);
		
		JLabel i_9_1 = new JLabel("0");
		i_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		i_9_1.setBounds(102, 61, 89, 14);
		panel_3.add(i_9_1);
		
		JLabel pp_9_1 = new JLabel("0");
		pp_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		pp_9_1.setBounds(102, 86, 89, 14);
		panel_3.add(pp_9_1);
		
		JLabel rrr_9_1 = new JLabel("0");
		rrr_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rrr_9_1.setBounds(102, 113, 89, 14);
		panel_3.add(rrr_9_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 160, 122));
		panel_4.setBorder(new TitledBorder(null, "Onwards", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 208, 338, 148);
		ICFrame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("The sales :");
		lblNewLabel_3_3_4.setBounds(10, 23, 82, 14);
		panel_4.add(lblNewLabel_3_3_4);
		
		JLabel lblNewLabel_3_3_5 = new JLabel("For 80 % :");
		lblNewLabel_3_3_5.setBounds(10, 48, 82, 14);
		panel_4.add(lblNewLabel_3_3_5);
		
		JLabel lblNewLabel_3_3_6 = new JLabel("RRR :");
		lblNewLabel_3_3_6.setBounds(198, 48, 33, 14);
		panel_4.add(lblNewLabel_3_3_6);
		
		JLabel lblNewLabel_3_3_7 = new JLabel("For 91 %  :");
		lblNewLabel_3_3_7.setBounds(10, 73, 82, 14);
		panel_4.add(lblNewLabel_3_3_7);
		
		JLabel lblNewLabel_3_3_8 = new JLabel("RRR :");
		lblNewLabel_3_3_8.setBounds(198, 73, 33, 14);
		panel_4.add(lblNewLabel_3_3_8);
		
		JLabel lblNewLabel_3_3_9 = new JLabel("For 101 %  :");
		lblNewLabel_3_3_9.setBounds(10, 98, 82, 14);
		panel_4.add(lblNewLabel_3_3_9);
		
		JLabel lblNewLabel_3_3_10 = new JLabel("RRR :");
		lblNewLabel_3_3_10.setBounds(198, 98, 33, 14);
		panel_4.add(lblNewLabel_3_3_10);
		
		JLabel lblNewLabel_3_3_11 = new JLabel("For 111 %  :");
		lblNewLabel_3_3_11.setBounds(10, 123, 82, 14);
		panel_4.add(lblNewLabel_3_3_11);
		
		JLabel lblNewLabel_3_3_12 = new JLabel("RRR :");
		lblNewLabel_3_3_12.setBounds(198, 123, 33, 14);
		panel_4.add(lblNewLabel_3_3_12);
		
		JLabel lblNewLabel_3_3_13 = new JLabel("Percentage:");
		lblNewLabel_3_3_13.setBounds(198, 23, 82, 14);
		panel_4.add(lblNewLabel_3_3_13);
		
		JLabel tia = new JLabel("0");
		tia.setFont(new Font("Tahoma", Font.BOLD, 13));
		tia.setBounds(99, 23, 89, 14);
		panel_4.add(tia);
		
		JLabel f_8_0 = new JLabel("0");
		f_8_0.setFont(new Font("Tahoma", Font.BOLD, 13));
		f_8_0.setBounds(99, 48, 89, 14);
		panel_4.add(f_8_0);
		
		JLabel f_9_1 = new JLabel("0");
		f_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		f_9_1.setBounds(99, 73, 89, 14);
		panel_4.add(f_9_1);
		
		JLabel f_1_0_1 = new JLabel("0");
		f_1_0_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		f_1_0_1.setBounds(99, 98, 89, 14);
		panel_4.add(f_1_0_1);
		
		JLabel f_1_1_1 = new JLabel("0");
		f_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		f_1_1_1.setBounds(99, 123, 89, 14);
		panel_4.add(f_1_1_1);
		
		JLabel tap = new JLabel("0");
		tap.setFont(new Font("Tahoma", Font.BOLD, 13));
		tap.setBounds(268, 23, 60, 14);
		panel_4.add(tap);
		
		JLabel r_8_0 = new JLabel("0");
		r_8_0.setFont(new Font("Tahoma", Font.BOLD, 13));
		r_8_0.setBounds(241, 48, 89, 14);
		panel_4.add(r_8_0);
		
		JLabel r_9_1 = new JLabel("0");
		r_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r_9_1.setBounds(241, 73, 89, 14);
		panel_4.add(r_9_1);
		
		JLabel r_1_0_1 = new JLabel("0");
		r_1_0_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r_1_0_1.setBounds(241, 98, 89, 14);
		panel_4.add(r_1_0_1);
		
		JLabel r_1_1_1 = new JLabel("0");
		r_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r_1_1_1.setBounds(239, 123, 89, 14);
		panel_4.add(r_1_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(244, 164, 96));
		panel_5.setBorder(new TitledBorder(null, "101 %", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(358, 174, 201, 143);
		ICFrame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3_5 = new JLabel("101 % target :");
		lblNewLabel_3_5.setBounds(10, 36, 82, 14);
		panel_5.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Total incentive :");
		lblNewLabel_3_1_2.setBounds(10, 62, 101, 14);
		panel_5.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Per Person :");
		lblNewLabel_3_2_2.setBounds(10, 87, 82, 14);
		panel_5.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("RRR :");
		lblNewLabel_3_3_2.setBounds(10, 112, 82, 14);
		panel_5.add(lblNewLabel_3_3_2);
		
		JLabel t_1_0_1 = new JLabel("0");
		t_1_0_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		t_1_0_1.setBounds(102, 36, 89, 14);
		panel_5.add(t_1_0_1);
		
		JLabel i_1_0_1 = new JLabel("0");
		i_1_0_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		i_1_0_1.setBounds(102, 62, 89, 14);
		panel_5.add(i_1_0_1);
		
		JLabel pp_1_0_1 = new JLabel("0");
		pp_1_0_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		pp_1_0_1.setBounds(102, 87, 89, 14);
		panel_5.add(pp_1_0_1);
		
		JLabel rrr_1_0_1 = new JLabel("0");
		rrr_1_0_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rrr_1_0_1.setBounds(102, 112, 89, 14);
		panel_5.add(rrr_1_0_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(244, 164, 96));
		panel_6.setBorder(new TitledBorder(null, "111 %", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(573, 174, 201, 143);
		ICFrame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_3_6 = new JLabel("111 % target :");
		lblNewLabel_3_6.setBounds(10, 36, 82, 14);
		panel_6.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Total incentive :");
		lblNewLabel_3_1_3.setBounds(10, 61, 94, 14);
		panel_6.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Per Person :");
		lblNewLabel_3_2_3.setBounds(10, 86, 82, 14);
		panel_6.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("RRR :");
		lblNewLabel_3_3_3.setBounds(10, 111, 82, 14);
		panel_6.add(lblNewLabel_3_3_3);
		
		JLabel t_1_1_1 = new JLabel("0");
		t_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		t_1_1_1.setBounds(102, 36, 89, 14);
		panel_6.add(t_1_1_1);
		
		JLabel i_1_1_1 = new JLabel("0");
		i_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		i_1_1_1.setBounds(102, 61, 89, 14);
		panel_6.add(i_1_1_1);
		
		JLabel pp_1_1_1 = new JLabel("0");
		pp_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		pp_1_1_1.setBounds(102, 86, 89, 14);
		panel_6.add(pp_1_1_1);
		
		JLabel rrr_1_1_1 = new JLabel("0");
		rrr_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rrr_1_1_1.setBounds(102, 111, 89, 14);
		panel_6.add(rrr_1_1_1);
		
		JButton clear = new JButton("Clear ");
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setBackground(new Color(205, 133, 63));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ttf.setText("");
				nop.setText("");
				mtda.setText("");
				t_8_0.setText("0");
				i_8_0.setText("0");
				pp_8_0.setText("0");
				rrr_8_0.setText("0");
				t_9_1.setText("0");
				i_9_1.setText("0");
				pp_9_1.setText("0");
				rrr_9_1.setText("0");
				t_1_0_1.setText("0");
				i_1_0_1.setText("0");
				pp_1_0_1.setText("0");
				rrr_1_0_1.setText("0");
				t_1_1_1.setText("0");
				i_1_1_1.setText("0");
				pp_1_1_1.setText("0");
				rrr_1_1_1.setText("0");
				tia.setText("0");
				tap.setText("0");
				f_8_0.setText("0");
				r_8_0.setText("0");
				f_9_1.setText("0");
				r_9_1.setText("0");
				f_1_0_1.setText("0");
				r_1_0_1.setText("0");
				f_1_1_1.setText("0");
				r_1_1_1.setText("0");
			}
		});
		clear.setBounds(685, 333, 89, 23);
		ICFrame.getContentPane().add(clear);
		
		JButton exit = new JButton("Exit");
		exit.setFont(new Font("Tahoma", Font.BOLD, 14));
		exit.setBackground(new Color(205, 133, 63));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICFrame.dispose();
			}
		});
		exit.setBounds(573, 333, 89, 23);
		ICFrame.getContentPane().add(exit);
		
		JButton enter = new JButton("Enter");
		enter.setFont(new Font("Tahoma", Font.BOLD, 14));
		enter.setBackground(new Color(205, 133, 63));
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ttf.getText().equals("")||nop.getText().equals("")||mtda.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, " Please fill all details");
				}
				else
				{
					TTF = ttf.getText();
					TTF_1 = Integer.parseInt(TTF);
					NOP = nop.getText();
					NOP_1 = Integer.parseInt(NOP);
					
					t_8 = TTF_1 * 80/100;
					T_8 = Integer.toString(t_8);
					t_8_0.setText(T_8);
					
					
					i_8 = t_8 * 0.005;
					I_8 = Double.toString(i_8);
					i_8_0.setText(I_8);
					
					pp_8 = i_8/NOP_1;
					PP_8 = Double.toString(pp_8);
					pp_8_0.setText(PP_8);
					
					r_8 = t_8/31;
					R_8 = Integer.toString(r_8);
					rrr_8_0.setText(R_8);
					
					t_9 =  TTF_1*91/100;
					T_9 = Integer.toString(t_9);
					t_9_1.setText(T_9);
					
					i_9 = t_9 * 0.01;
					I_9 = Double.toString(i_9);
					i_9_1.setText(I_9);
					
					pp_9 = i_9/NOP_1;
					PP_9 = Double.toString(pp_9);
					pp_9_1.setText(PP_9);
					
					r_9 = t_9/31;
					R_9 = Integer.toString(r_9);
					rrr_9_1.setText(R_9);
					
					t_1 = TTF_1*101/100;
					T_1 = Integer.toString(t_1);
					t_1_0_1.setText(T_1);
					
					i_1 = t_1 * 0.015;
					I_1 = Double.toString(i_1);
					i_1_0_1.setText(I_1);
					
					pp_1 = i_1/NOP_1;
					PP_1 = Double.toString(pp_1);
					pp_1_0_1.setText(PP_1);
					
					r_1 = t_1/31;
					R_1 = Integer.toString(r_1);
					rrr_1_0_1.setText(R_1);
					
					t_1_1 = TTF_1*111/100;
					T_1_1 = Integer.toString(t_1_1);
					t_1_1_1.setText(T_1_1);
					
					i_1_1 = t_1_1 * 0.02;
					I_1_1 = Double.toString(i_1_1);
					i_1_1_1.setText(I_1_1);
					
					pp_1_1 = i_1_1/NOP_1;
					PP_1_1 = Double.toString(pp_1_1);
					pp_1_1_1.setText(PP_1_1);
					
					r_1_1 = t_1_1/31;
					R_1_1 = Integer.toString(r_1_1);
					rrr_1_1_1.setText(R_1_1);
					
					//------------------------------------------
					 Mtda = mtda.getText();
					    Mtda_1 = Integer.parseInt(Mtda);
					    
					    tia.setText(Mtda);
					    
					    per = 100*Mtda_1/TTF_1;
					    Per = Integer.toString(per);
					    tap.setText(Per);
					    
					    f_8 = t_8 - Mtda_1;
					    F_8 = Integer.toString(f_8);
					    f_8_0.setText(F_8);
					    
					    rf_8 = f_8/cd;
					    RF_8 = Integer.toString(rf_8);
					    r_8_0.setText(RF_8);
					    
					    f_9 = t_9 - Mtda_1;
					    F_9 = Integer.toString(f_9);
					    f_9_1.setText(F_9);
					    
					    rf_9 = f_9/cd;
					    RF_9 = Integer.toString(rf_9);
					    r_9_1.setText(RF_9);
					    
					    f_1 = t_1 - Mtda_1;
					    F_1 = Integer.toString(f_1);
					    f_1_0_1.setText(F_1);
					    
					    rf_1 = f_1/cd;
					    RF_1 = Integer.toString(rf_1);
					    r_1_0_1.setText(RF_1);
					    
					    f_1_1 = t_1_1 - Mtda_1;
					    F_1_1 = Integer.toString(f_1_1);
					    f_1_1_1.setText(F_1_1);
					    
					    rf_1_1 = f_1_1/cd;
					    RF_1_1 = Integer.toString(rf_1_1);
					    r_1_1_1.setText(RF_1_1);
				}
			}
		});
		enter.setBounds(259, 174, 89, 23);
		ICFrame.getContentPane().add(enter);
	}
}
