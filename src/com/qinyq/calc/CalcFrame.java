package com.qinyq.calc;

import java.awt.BorderLayout;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * 计算器窗口
 * @author 琼宝宝
 *
 */
public class CalcFrame extends JFrame{
	
	/**
	 * 显示计算结果
	 */
	private JLabel labelResult;
	/**
	 * 按钮上的标签
	 */
	private String [] titles={"","","","C","7","8","9","/","4","5","6","-","1","2","3",".","*","0","+","="};
	/**
	 * 按钮
	 */
	private JButton[]buttons=new JButton[titles.length];
	
	
	public CalcFrame() {
		
		initUi();
		setVisible(true);
	}

	private void initUi() {
		
		setTitle("计算器-qinyq作品");
		setSize(320,480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//添加结果标签
		
		labelResult=new JLabel("0.0");
		labelResult.setBorder(new EmptyBorder(20,10,20,10));
		labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
		labelResult.setFont(new Font("微软雅黑",Font.PLAIN,32));
		add(labelResult,BorderLayout.NORTH);
		
		
		//设置布局
		JPanel buttonPanel=new JPanel(new GridLayout(5,4,5,5));
		//按钮面板添加到窗口的中间
		add(buttonPanel,BorderLayout.CENTER);
		
		for(int i=0;i<titles.length;i++){
			if(titles[i].length()==0){
				//不显示内容的标签
				buttonPanel.add(new JLabel(""));
			}else{
				//按钮
			 buttons[i] =new JButton(titles[i]);
				buttonPanel.add(buttons[i]);
			}
		}
	}

	
}
