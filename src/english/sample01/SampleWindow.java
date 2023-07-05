package english.sample01;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleWindow extends JFrame implements ActionListener{
	JPanel head;
	JPanel center;
	
	public SampleWindow(String title) {
	
		super(title);
		
		//aaa
		
		//bbb
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,800);
		Container contPane = getContentPane();
		//contPane.setBounds(10,10,610,410);
		contPane.setLayout(new BoxLayout( contPane, BoxLayout.Y_AXIS));
		
		
		head = new HeadPanel();
		head.setSize(new Dimension(100, 800));
		center = new CenterPanel();
		head.setSize(new Dimension(400, 800));
			
//		JButton btn1 = new JButton( "Click Me!") ;
//		btn1.addActionListener( this ) ;
//		JButton btn2 = new JButton( "Yes, yes, yes ----- !") ;
//		btn2.addActionListener( this ) ;

		contPane.add(head);
		contPane.add(center);
//		pack();

		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	


}
