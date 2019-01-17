package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hellow {
	JFrame frmPrincipal = new JFrame();
	JButton btnNew = new JButton("NEW");

	public Hellow() {

	}

	public void Display() {
		frmPrincipal.setLayout(null);
		frmPrincipal.setSize(500, 500);
		frmPrincipal.setVisible(true);
		frmPrincipal.add(btnNew);
		btnNew.setBounds(10, 10, 200, 200);
		btnNew.setVisible(true);
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				oneMore();
			}
		});
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipal.setLocationRelativeTo(null);
	}

	public void oneMore() {
		JFrame frmNew = new JFrame();
		frmNew.setLayout(null);
		frmNew.setSize(500, 500);
		frmNew.setVisible(true);
		frmNew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNew.setLocationRelativeTo(null);
	}

	public static void main(String args[]) {
		Hellow h = new Hellow();
		h.Display();
	}
}
