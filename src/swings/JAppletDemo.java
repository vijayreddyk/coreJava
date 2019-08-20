package swings;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JAppletDemo extends JApplet{
	JButton jbtnAlpha;
	JButton jbtnBeta;
	JLabel jlab;
	// Initialize the applet.
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable () {
				public void run() {
					makeGUI(); // initialize the GUI
				}
			});
		} catch(Exception exc) {
			System.out.println("Can’t create because of "+ exc);
		}
	}
	// This applet does not need to override start(), stop(),
	// or destroy().
	// Set up and initialize the GUI.
	private void makeGUI() {
		// Set the applet to use flow layout.
		setLayout(new FlowLayout());
		// Make two buttons.
		jbtnAlpha = new JButton("Alpha");
		jbtnBeta = new JButton("Beta");
		// Add action listener for Alpha.
		jbtnAlpha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Alpha was pressed.");
			}
		});
		// Add action listener for Beta.
		jbtnBeta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent le) {
				jlab.setText("Beta was pressed.");
			}
		});
		// Add the buttons to the content pane.
		add(jbtnAlpha);
		add(jbtnBeta);
		// Create a text-based label.
		jlab = new JLabel("Press a button.");
		// Add the label to the content pane.
		add(jlab);
	}
}

