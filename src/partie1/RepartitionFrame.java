package partie1;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import partie2.Repartition;


public class RepartitionFrame extends JFrame{
	public RepartitionFrame(Repartition r) {
		super("Repartition");
		JPanel mainPanel = new JPanel();
		GridLayout g1 = new GridLayout(1, 2);
		mainPanel.setLayout(g1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1));
		JTextField texte = new JTextField(10);
		panel.add(texte);
		JButton b = new JButton("Ok");
		panel.add(b);
		
		JTextArea textArea = new JTextArea();
		b.addActionListener(new AfficherListener(texte,r,textArea));
		
		mainPanel.add(panel);
			
		textArea.setEditable(false);
		mainPanel.add(textArea);
		
		add(mainPanel);
		
	}
}