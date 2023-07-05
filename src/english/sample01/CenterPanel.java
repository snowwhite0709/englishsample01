package english.sample01;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CenterPanel extends JPanel {
	Object[][]  data = {
			{ "太郎",      "犬",  5 },  
			{ "ミケ",      "猫",  2 },
			{ "ショーン",  "羊",  4 },
			{ "次郎",      "犬",  4 },
			{ "タマ",      "猫",  3 },
			{ "マル",      "猫" , 2 }
	} ;

	String [] titles =  {  "名前", "種類", "体重(kg)" } ;

	
	JTable table ;
	JTextField txtField ;
	
	DefaultTableModel model ;

	
	public CenterPanel() {
		
		model = new DefaultTableModel( data, titles ) ;
		table = new JTable( model );
		
		JScrollPane scp = new JScrollPane( table,
								JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
								JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
		{
			Dimension dim = table.getPreferredSize() ;
			dim.width = scp.getPreferredSize().width ;
			dim.height += table.getTableHeader().getPreferredSize().height ;
			scp.setPreferredSize(dim);
		}
		
		add( scp, BorderLayout.CENTER ) ;
		

		
	}

}
