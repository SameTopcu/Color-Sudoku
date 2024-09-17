import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorSudoku {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorSudoku window = new ColorSudoku();
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
	public ColorSudoku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.getContentPane().setForeground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 803, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("COLOR SUDOKU WITH 4 COLOR :) ");
		JLabel lblNewLabel = new JLabel("WELCOME TO SUDOKU GAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(76, 32, 392, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Help");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				frame.getContentPane().setBackground(new Color(224, 255, 255));
				frame.getContentPane().setForeground(new Color(128, 128, 0));
				frame.setBounds(100, 100, 637, 231);
				frame.getContentPane().setLayout(null);
				frame.setTitle("RULES");
				frame.setVisible(true);
				JLabel lblNewLabel = new JLabel("First Rule -->> All colors should be found in each line and all colors should be used once.");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setBounds(43, 36, 610, 45);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Second Rule -->>All colors must be found in each column and must be used once.");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel_1.setBounds(43, 80, 570, 33);
				frame.getContentPane().add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Thirt Rule -->> Same Colors cannot be found side by side or under each other.");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel_2.setBounds(43, 123, 570, 32);
				frame.getContentPane().add(lblNewLabel_2);
				
			}
		});
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setForeground(new Color(178, 34, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(594, 104, 99, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label1 = new JLabel("");
		label1.setOpaque(true);
		label1.setBackground(Color.LIGHT_GRAY);
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				
				JButton btncyan=new JButton("CYAN");
				btncyan.setBackground(Color.CYAN);
				btncyan.setForeground(Color.CYAN);
				frame.getContentPane().add(btncyan);
				
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label1.setOpaque(true);
						label1.setBackground(Color.yellow);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label1.setOpaque(true);
						label1.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label1.setOpaque(true);
						label1.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label1.setOpaque(true);
						label1.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label1.setBounds(60, 103, 79, 54);
		frame.getContentPane().add(label1);
		
		
		JLabel label2 = new JLabel("");
		label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label2.setOpaque(true);
						label2.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label2.setOpaque(true);
						label2.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label2.setOpaque(true);
						label2.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label2.setOpaque(true);
						label2.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label2.setOpaque(true);
		label2.setBackground(Color.LIGHT_GRAY);
		label2.setBounds(168, 103, 79, 54);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		label3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label3.setOpaque(true);
						label3.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label3.setOpaque(true);
						label3.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label3.setOpaque(true);
						label3.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label3.setOpaque(true);
						label3.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label3.setOpaque(true);
		label3.setBackground(Color.LIGHT_GRAY);
		label3.setBounds(272, 104, 79, 54);
		frame.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("");
		label4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label4.setOpaque(true);
						label4.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label4.setOpaque(true);
						label4.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label4.setOpaque(true);
						label4.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label4.setOpaque(true);
						label4.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label4.setOpaque(true);
		label4.setBackground(Color.LIGHT_GRAY);
		label4.setBounds(376, 103, 79, 54);
		frame.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("");
		label5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label5.setOpaque(true);
						label5.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label5.setOpaque(true);
						label5.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label5.setOpaque(true);
						label5.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label5.setOpaque(true);
						label5.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label5.setOpaque(true);
		label5.setBackground(Color.LIGHT_GRAY);
		label5.setBounds(60, 186, 79, 54);
		frame.getContentPane().add(label5);
		
		JLabel label9 = new JLabel("");
		label9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label9.setOpaque(true);
						label9.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label9.setOpaque(true);
						label9.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label9.setOpaque(true);
						label9.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label9.setOpaque(true);
						label9.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label9.setOpaque(true);
		label9.setBackground(Color.LIGHT_GRAY);
		label9.setBounds(60, 268, 79, 54);
		frame.getContentPane().add(label9);
		
		JLabel label13 = new JLabel("");
		label13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label13.setOpaque(true);
						label13.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label13.setOpaque(true);
						label13.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label13.setOpaque(true);
						label13.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label13.setOpaque(true);
						label13.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label13.setOpaque(true);
		label13.setBackground(Color.LIGHT_GRAY);
		label13.setBounds(60, 348, 79, 54);
		frame.getContentPane().add(label13);
		
		JLabel label6 = new JLabel("");
		label6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label6.setOpaque(true);
						label6.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label6.setOpaque(true);
						label6.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label6.setOpaque(true);
						label6.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label6.setOpaque(true);
						label6.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		
		label6.setOpaque(true);
		label6.setBackground(Color.LIGHT_GRAY);
		label6.setBounds(168, 186, 79, 54);
		frame.getContentPane().add(label6);
		
		JLabel label10 = new JLabel("");
		label10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label10.setOpaque(true);
						label10.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label10.setOpaque(true);
						label10.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label10.setOpaque(true);
						label10.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label10.setOpaque(true);
						label10.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		
		label10.setOpaque(true);
		label10.setBackground(Color.LIGHT_GRAY);
		label10.setBounds(168, 268, 79, 54);
		frame.getContentPane().add(label10);
		
		JLabel label14 = new JLabel("");
		label14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label14.setOpaque(true);
						label14.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label14.setOpaque(true);
						label14.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label14.setOpaque(true);
						label14.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label14.setOpaque(true);
						label14.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label14.setOpaque(true);
		label14.setBackground(Color.LIGHT_GRAY);
		label14.setBounds(168, 348, 79, 54);
		frame.getContentPane().add(label14);
		
		JLabel label7 = new JLabel("");
		label7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label7.setOpaque(true);
						label7.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label7.setOpaque(true);
						label7.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label7.setOpaque(true);
						label7.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label7.setOpaque(true);
						label7.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label7.setOpaque(true);
		label7.setBackground(Color.LIGHT_GRAY);
		label7.setBounds(272, 186, 79, 54);
		frame.getContentPane().add(label7);
		
		JLabel label11 = new JLabel("");
		label11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label11.setOpaque(true);
						label11.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label11.setOpaque(true);
						label11.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label11.setOpaque(true);
						label11.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label11.setOpaque(true);
						label11.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label11.setOpaque(true);
		label11.setBackground(Color.LIGHT_GRAY);
		label11.setBounds(272, 268, 79, 54);
		frame.getContentPane().add(label11);
		
		JLabel label15 = new JLabel("");
		label15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label15.setOpaque(true);
						label15.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label15.setOpaque(true);
						label15.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label15.setOpaque(true);
						label15.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label15.setOpaque(true);
						label15.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label15.setOpaque(true);
		label15.setBackground(Color.LIGHT_GRAY);
		label15.setBounds(272, 348, 79, 54);
		frame.getContentPane().add(label15);
		
		JLabel label8 = new JLabel("");
		label8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label8.setOpaque(true);
						label8.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label8.setOpaque(true);
						label8.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label8.setOpaque(true);
						label8.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label8.setOpaque(true);
						label8.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label8.setOpaque(true);
		label8.setBackground(Color.LIGHT_GRAY);
		label8.setBounds(376, 186, 79, 54);
		frame.getContentPane().add(label8);
		
		JLabel label12 = new JLabel("");
		label12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label12.setOpaque(true);
						label12.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label12.setOpaque(true);
						label12.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label12.setOpaque(true);
						label12.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label12.setOpaque(true);
						label12.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		label12.setOpaque(true);
		label12.setBackground(Color.LIGHT_GRAY);
		label12.setBounds(376, 268, 79, 54);
		frame.getContentPane().add(label12);
		
		JLabel label16 = new JLabel("");
		label16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame = new JFrame();
				frame.setSize(400,400);
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
				JButton btnyellow = new JButton("YELLOW");
				btnyellow.setFont(UIManager.getFont("Button.font"));
				btnyellow.setBackground(new Color(255, 255, 0));
				btnyellow.setForeground(new Color(255, 255, 0));
				btnyellow.setBounds(41, 10, 145, 118);
				frame.getContentPane().add(btnyellow);
				
				JButton btnRed = new JButton("RED");
				btnRed.setForeground(new Color(255, 0, 0));
				btnRed.setBackground(new Color(255, 0, 0));
				btnRed.setBounds(217, 10, 145, 118);
				frame.getContentPane().add(btnRed);
				
				JButton btnBlue = new JButton("BLUE");
				btnBlue.setBackground(new Color(100, 149, 237));
				btnBlue.setForeground(new Color(100, 149, 237));
				btnBlue.setBounds(41, 138, 145, 115);
				frame.getContentPane().add(btnBlue);
				
				JButton btngreen = new JButton("GREEN");
				btngreen.setForeground(new Color(154, 205, 50));
				btngreen.setBackground(new Color(154, 205, 50));
				btngreen.setBounds(217, 138, 145, 115);
				frame.getContentPane().add(btngreen);
				
				btnyellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label16.setOpaque(true);
						label16.setBackground(Color.YELLOW);
						
					}
				});
				
				btnRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label16.setOpaque(true);
						label16.setBackground(Color.RED);
						
					}
				});
				
				btnBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label16.setOpaque(true);
						label16.setBackground(Color.BLUE);
						
					}
				});
				
				btngreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label16.setOpaque(true);
						label16.setBackground(Color.GREEN);
						
					}
				});
				
	
			}
		});
		
		label16.setOpaque(true);
		label16.setBackground(Color.LIGHT_GRAY);
		label16.setBounds(376, 348, 79, 54);
		frame.getContentPane().add(label16);
		
		JButton btnNewButton_1 = new JButton("RESULT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(label1.getBackground()!=label2.getBackground() && label1.getBackground()!=label3.getBackground() && label1.getBackground()!=label4.getBackground() && label1.getBackground()!=label5.getBackground() && label1.getBackground()!=label9.getBackground() && label1.getBackground()!=label13.getBackground()) {
				
				if(label2.getBackground()!=label3.getBackground() && label2.getBackground() != label4.getBackground() && label2.getBackground()!=label6.getBackground() && label2.getBackground() != label10.getBackground() && label2.getBackground()!= label14.getBackground()) {
					
					if(label3.getBackground()!=label4.getBackground() && label3.getBackground()!=label7.getBackground()&& label3.getBackground()!=label11.getBackground()&&label3.getBackground()!=label15.getBackground()) {
						
						if(label4.getBackground()!=label8.getBackground() && label4.getBackground()!=label12.getBackground()&& label4.getBackground()!=label16.getBackground()) {
							
							if(label5.getBackground()!=label6.getBackground() &&label5.getBackground()!=label7.getBackground() && label5.getBackground()!=label8.getBackground() && label5.getBackground()!=label9.getBackground() && label5.getBackground()!=label13.getBackground()) {
								
								if(label6.getBackground()!=label7.getBackground() && label6.getBackground()!=label8.getBackground() &&label6.getBackground()!=label10.getBackground()&&label6.getBackground()!=label14.getBackground()) {
									
									if(label7.getBackground()!=label8.getBackground() && label7.getBackground()!=label11.getBackground() && label7.getBackground()!=label15.getBackground()){
										
										if(label8.getBackground()!=label12.getBackground()&& label8.getBackground()!=label12.getBackground()&&label8.getBackground()!=label16.getBackground()) {
											
											if(label9.getBackground()!=label10.getBackground()&&label9.getBackground()!=label11.getBackground()&&label9.getBackground()!=label12.getBackground()&&label9.getBackground()!=label13.getBackground()) {
												
												if(label10.getBackground()!=label11.getBackground()&&label10.getBackground()!=label12.getBackground() && label10.getBackground()!=label14.getBackground()) {
													
													if(label11.getBackground()!=label12.getBackground()&&label11.getBackground()!=label15.getBackground()) {
														
														if(label12.getBackground()!=label16.getBackground()) {
															
															if(label13.getBackground()!=label14.getBackground()&&label13.getBackground()!=label15.getBackground()&&label13.getBackground()!=label16.getBackground()) {
																
																if(label14.getBackground()!=label15.getBackground()&& label14.getBackground()!=label6.getBackground()) {
																	
																	if(label15.getBackground()!=label16.getBackground()) {
																		
																		JOptionPane.showMessageDialog(null,"TEBRIKLER KAZANDINIZ..");
																		
																		
																		
																	 }else {
																			JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
																		}
																   }else {
																		JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
																	}
															   }else {
																	JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
																}
															}else {
																JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
															}	
														}else {
															JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
														}	
													}else {
														JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
													}		
												}else {
													JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
												}
											}else {
												JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
											}		
										}else {
											JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
										}
									}else {
										JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
									}
								}else {
									JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
								}
							}else {
								JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
							}		
						}else {
							JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
						}
					}else {
						JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
					}
				}else {
					JOptionPane.showMessageDialog(null,"Hatalý Yerler Var Tekrar Gözden Geçir..");
				}
	        
			
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBackground(SystemColor.controlShadow);
		btnNewButton_1.setBounds(594, 186, 99, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("SHOW CORRECT SUDOKU");
		btnNewButton_1_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (frame == null) {
		            frame = new JFrame();
		            frame.setBounds(100, 100, 1305, 1010);
		            frame.setVisible(true);
		            frame.getContentPane().setLayout(null); // Layout manager kullanmýyoruz
		        } else {
		            frame.getContentPane().removeAll(); // Önceki bileþenleri kaldýr
		            frame.repaint(); // Yeniden çiz
		        }

		        JLabel lblNewLabel = new JLabel("EXAMPLE 1");
		        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("color1.png")));
		        lblNewLabel.setBounds(10, 10, 511, 416); // Bu görselin konumu ve boyutu
		        frame.getContentPane().add(lblNewLabel);

		        JLabel lblNewLabel_1 = new JLabel("EXAMPLE 2");
		        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("color2.png")));
		        lblNewLabel_1.setBounds(530, 10, 511, 416); // Bu görseli, birinci görselin yanýnda konumlandýrdýk
		        frame.getContentPane().add(lblNewLabel_1);

		        JLabel lblNewLabel_2 = new JLabel("EXAMPLE 3");
		        lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("color3.png")));
		        lblNewLabel_2.setBounds(10, 440, 511, 416); // Bu görseli, ilk görselin altýna yerleþtirdik
		        frame.getContentPane().add(lblNewLabel_2);

		        JLabel lblNewLabel_3 = new JLabel("EXAMPLE 4");
		        lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("color4.png")));
		        lblNewLabel_3.setBounds(530, 440, 511, 416); // Bu görseli, ikinci görselin altýna yerleþtirdik
		        frame.getContentPane().add(lblNewLabel_3);

		        JLabel lblNewLabel_4 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		        lblNewLabel_4.setBounds(10, 860, 1305, 37); // Bu etiketi, tüm görsellerin altýna koyduk
		        frame.getContentPane().add(lblNewLabel_4);

		        frame.revalidate(); // Ýçeriði yeniden doðrula
		        frame.repaint(); // Yeniden çiz
		    }
		});

		btnNewButton_1_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_1.setBackground(SystemColor.controlShadow);
		btnNewButton_1_1.setBounds(515, 256, 264, 35);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
