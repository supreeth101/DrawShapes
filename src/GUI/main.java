package GUI;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

import javax.swing.JFrame;
import javax.swing.border.Border;

import ControllerAndExpert.Circle;
import ControllerAndExpert.Line;
import ControllerAndExpert.Square;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main extends JFrame implements MouseListener{

	private JFrame frmHwGui;
	private Canvas canvas;
	
	String buttonClicked;
	Stack<String> stackOfButtons = new Stack<>();
	String[] popButton;
//	List<Shape> shapes = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmHwGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void mouseClicked(MouseEvent e) 
	{
	}
	public void mouseMoved(MouseEvent e) 
    { 
    } 
	public void mouseDragged(MouseEvent e) 
	{
	}
    public void mouseExited(MouseEvent e) 
    { 
    }
    public void mouseEntered(MouseEvent e) 
    { 
    } 
  
    public void mouseReleased(MouseEvent e) 
    { 
    } 
  
    public void mousePressed(MouseEvent e) 
    { 
    } 
    
	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHwGui = new JFrame();
		frmHwGui.setTitle("HW1 GUI");
		frmHwGui.setBounds(100, 100, 748, 428);
		frmHwGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHwGui.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Line");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = "Line";
			}
		});
		btnNewButton.setBounds(12, 13, 97, 25);
		frmHwGui.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Box");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = "Square";
			}
		});
		btnNewButton_1.setBounds(12, 51, 97, 25);
		frmHwGui.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Circle");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = "Circle";
				
			}
		});
		
		btnNewButton_2.setBounds(12, 89, 97, 25);
		frmHwGui.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Undo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonClicked = "Undo";
				if(!stackOfButtons.isEmpty()) {
		        		String str = stackOfButtons.lastElement();
		        		System.out.println("Deepika " + str);
		        	}
//		        

				
//				popButton = stackOfButtons.pop().split("_");
//				System.out.print("" + popButton);
//				Graphics g = canvas.getGraphics();
				// g.clearRect(Integer.parseInt(popButton[1]), Integer.parseInt(popButton[2]), Integer.parseInt(popButton[3]), Integer.parseInt(popButton[4]));
			}
		});
		btnNewButton_3.setBounds(12, 127, 97, 25);
		frmHwGui.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Redo");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(12, 165, 97, 25);
		frmHwGui.getContentPane().add(btnNewButton_4);
	
	
	canvas = new Canvas() {
		public void paint(Graphics g) {
		}
	};
	canvas.setBackground(Color.WHITE);
	canvas.setBounds(136, 13, 571, 358);
	canvas.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = canvas.getGraphics();
			int x, y; 
	        x = e.getX(); 
	        y = e.getY();
	        System.out.print(buttonClicked);
	        if (buttonClicked == "Line") {
	        		Line line = new Line(x, y, g);
	        		line.drawLine();
	        		stackOfButtons.push(buttonClicked+x+y+x+(y+200));
	        }
	        else if (buttonClicked == "Square") {
	        		Square square = new Square(x, y, g);
	        		square.drawSquare();
	        		stackOfButtons.push(buttonClicked+x+y+40+40);	                
	        }
	        else if (buttonClicked == "Circle") {
	        		Circle circle = new Circle(x, y, g);
	        		circle.drawCircle();
	        		stackOfButtons.push(buttonClicked+x+y+80+80);
	        }
//	        else if(buttonClicked == "Undo") {
//	        	if(!stackOfButtons.isEmpty()) {
//	        		String str = stackOfButtons.lastElement();
//	        		System.out.println("Deepika " + str);
//	        	}
//	        }
	        System.out.print(stackOfButtons);
		}
		});
	frmHwGui.getContentPane().add(canvas);
}
}