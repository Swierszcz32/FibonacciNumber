package pl.java.workExperience;

import javax.swing.*;

import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskOfSomethingGUI extends JFrame{
	public TaskOfSomethingGUI() {
		
		super("Fibonacci number");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		settingTheSizeOfTheFrame();
		addComponents();
		pack();
	}
	public void settingTheSizeOfTheFrame() {
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		this.setBounds((width-(width/2))/2, (height-(height/2))/2, width/2, height/2);
	}
	
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("recursive solution");
	JLabel label3 = new JLabel("");
	JLabel label4 = new JLabel("iterative solution");
	JLabel label5 = new JLabel("Fibonacci sequence - two solutions");
	JTextField txt = new JTextField();
	JButton button = new JButton("Przelicz");
	JPanel panel = new JPanel(new FlowLayout());
	GroupLayout layout = new GroupLayout(getContentPane());
	
	
	public int getNumber() {
		return Integer.parseInt(txt.getText());
	}
	
	public void addComponents() {
		
		button.addActionListener(new ListenerFib());
		
		this.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
//		layout.setHorizontalGroup(
//				layout.createSequentialGroup()
//				.addGroup(
//						layout.createParallelGroup()
//						.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						)
//				.addGroup(
//						layout.createParallelGroup()
//						.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						)
//				);
//		layout.setVerticalGroup(
//				layout.createSequentialGroup()
//				.addGroup(
//						layout.createParallelGroup()
//						.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						)
//				.addGroup(
//						layout.createParallelGroup()
//						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						)
//				);
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, 
                		layout.createSequentialGroup()
//                    .addGap(104, 104, 104)
                    .addGroup(
                    		layout.createParallelGroup(Alignment.TRAILING)
                    		.addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(
                    		layout.createSequentialGroup()
                            .addGroup(
                            		layout.createParallelGroup(Alignment.LEADING, false)
                                	.addComponent(button, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            		.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            		.addComponent(label1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
//                            .addGap(18, 18, 18)
                            .addGroup(
                            		layout.createParallelGroup(Alignment.LEADING)
                            	.addComponent(txt, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//                    .addGap(96, 96, 96))
                    )
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(
                		layout.createSequentialGroup()
//                    .addGap(20, 20, 20)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
//                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                    		layout.createParallelGroup(Alignment.BASELINE)
                        	.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    		.addComponent(txt, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGroup(
                    		layout.createParallelGroup(Alignment.BASELINE)
                    		.addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    		.addComponent(label4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
//                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                    		layout.createParallelGroup(Alignment.BASELINE)
                    		.addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    		.addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
//                    .addContainerGap(143, Short.MAX_VALUE))
                    )
            );

            pack();
	}
	
private class ListenerFib implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label1.setText(""+TaskOfSomething.FibR(getNumber()));
			label3.setText(""+TaskOfSomething.FibI(getNumber()));
		}
	}
	

}
