import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Login_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fld_h_tc;
	private JTextField fld_h_sf;
	private JTextField fld_d_tc;
	private JTextField fld_d_sf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
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
	public Login_GUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_logo = new JLabel("");
		ImageIcon original = new ImageIcon(getClass().getResource("/ıcon2.png"));
		Image originalImage = original.getImage();
		Image editImage = originalImage.getScaledInstance(246, 413, Image.SCALE_SMOOTH);
		ImageIcon ıcon = new ImageIcon(editImage);
		lbl_logo.setIcon(ıcon);
		lbl_logo.setBounds(0, 0, 246, 413);
		contentPane.add(lbl_logo);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(128, 128, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(333, 25, 146, 56);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(272, 91, 279, 255);
		contentPane.add(tabbedPane);
		
		JPanel w_panel_hasta_giris = new JPanel();
		w_panel_hasta_giris.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Hasta Girişi", null, w_panel_hasta_giris, null);
		w_panel_hasta_giris.setLayout(null);
		
		JLabel lbl_h_tc = new JLabel("T.C Numaranız :");
		lbl_h_tc.setForeground(new Color(0, 0, 0));
		lbl_h_tc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_h_tc.setBounds(23, 25, 149, 25);
		w_panel_hasta_giris.add(lbl_h_tc);
		
		JLabel lbl_h_sf = new JLabel("Şifreniz :");
		lbl_h_sf.setForeground(new Color(0, 0, 0));
		lbl_h_sf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_h_sf.setBounds(23, 95, 149, 25);
		w_panel_hasta_giris.add(lbl_h_sf);
		
		fld_h_tc = new JTextField();
		fld_h_tc.setBackground(new Color(255, 255, 255));
		fld_h_tc.setBounds(23, 54, 124, 25);
		w_panel_hasta_giris.add(fld_h_tc);
		fld_h_tc.setColumns(10);
		
		fld_h_sf = new JTextField();
		fld_h_sf.setColumns(10);
		fld_h_sf.setBounds(23, 124, 124, 25);
		w_panel_hasta_giris.add(fld_h_sf);
		
		JButton btn_h_sifre = new JButton("Kayıt Ol");
		btn_h_sifre.setForeground(new Color(255, 255, 255));
		btn_h_sifre.setBackground(new Color(128, 128, 192));
		btn_h_sifre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_h_sifre.setBounds(23, 166, 109, 30);
		w_panel_hasta_giris.add(btn_h_sifre);
		
		JButton btn_h_giris = new JButton("Giriş Yap");
		btn_h_giris.setForeground(new Color(255, 255, 255));
		btn_h_giris.setBackground(new Color(128, 128, 192));
		btn_h_giris.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_h_giris.setBounds(142, 166, 109, 30);
		w_panel_hasta_giris.add(btn_h_giris);
		
		JPanel w_panel_doktor_giris = new JPanel();
		w_panel_doktor_giris.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Doktor Girişi", null, w_panel_doktor_giris, null);
		w_panel_doktor_giris.setLayout(null);
		
		JLabel lbl_d_tc_ = new JLabel("T.C Numaranız :");
		lbl_d_tc_.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_d_tc_.setBounds(20, 20, 149, 25);
		w_panel_doktor_giris.add(lbl_d_tc_);
		
		fld_d_tc = new JTextField();
		fld_d_tc.setColumns(10);
		fld_d_tc.setBounds(20, 55, 130, 25);
		w_panel_doktor_giris.add(fld_d_tc);
		
		JLabel lbl_d_sf = new JLabel("Şifreniz :");
		lbl_d_sf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_d_sf.setBounds(20, 90, 149, 25);
		w_panel_doktor_giris.add(lbl_d_sf);
		
		fld_d_sf = new JTextField();
		fld_d_sf.setColumns(10);
		fld_d_sf.setBounds(20, 119, 130, 25);
		w_panel_doktor_giris.add(fld_d_sf);
		
		JButton btn_d_giris = new JButton("Giriş Yap");
		btn_d_giris.setForeground(new Color(255, 255, 255));
		btn_d_giris.setBackground(new Color(128, 128, 192));
		btn_d_giris.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_d_giris.setBounds(63, 168, 149, 30);
		w_panel_doktor_giris.add(btn_d_giris);
	}

}
