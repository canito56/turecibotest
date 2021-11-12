package com.turecibo.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.turecibo.test.TuReciboTest;

public class TuReciboView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JMenuItem miRojo, miNegro, miMorado, miSalir, miNuevo;
	public JTextField user, pwd; 
    private JButton buttonNext;


    public TuReciboView() {
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tu Recibo");
        getContentPane().setBackground(new Color(255,0,0));
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,0,0));
        setJMenuBar(menuBar);
        JMenu menuOpciones = new JMenu("Options");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Avondale Mono",1,16));
        menuOpciones.setForeground(new Color(255,255,255));
        menuBar.add(menuOpciones);
        JMenu menuColorFondo = new JMenu("Background color");
        menuColorFondo.setFont(new Font("Avondale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);
        miRojo = new JMenuItem("Red");
        miRojo.setFont(new Font("Avondale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);
        miNegro = new JMenuItem("Black");
        miNegro.setFont(new Font("Avondale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);
        miMorado = new JMenuItem("Purple");
        miMorado.setFont(new Font("Avondale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);
        miNuevo = new JMenuItem("Refresh");
        miNuevo.setFont(new Font("Avondale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        miSalir = new JMenuItem("Exit");
        miSalir.setFont(new Font("Avondale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        JLabel labelUser = new JLabel("User:");
        labelUser.setBounds(25,30,188,25);
        labelUser.setFont(new Font("Avondale Mono",1,14));
        labelUser.setForeground(new Color(255,255,255));
        add(labelUser);
        user = new JTextField();
        user.setBounds(25,60,150,25);
        user.setBackground(new Color(224,224,224));
        user.setFont(new Font("Avondale Mono", 1, 14));
        user.setForeground(new Color(255,0,0));
        add(user);
        JLabel labelPwd = new JLabel("Password:");
        labelPwd.setBounds(25,90,188,25);
        labelPwd.setFont(new Font("Avondale Mono",1,14));
        labelPwd.setForeground(new Color(255,255,255));
        add(labelPwd);
        pwd = new JPasswordField();
        pwd.setBounds(25,120,150,25);
        pwd.setBackground(new Color(224,224,224));
        pwd.setFont(new Font("Avondale Mono", 1, 14));
        pwd.setForeground(new Color(255,0,0));
        add(pwd);
        buttonNext = new JButton("Next");
        buttonNext.setBounds(190,190,100,30);
        buttonNext.setFont(new Font("Avondale Mono",1,14));
        buttonNext.addActionListener(this);
        add(buttonNext);
        setBounds(0,0,480,300);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonNext) {
            String usern = user.getText();
            if (usern.equals("")) {
                JOptionPane.showMessageDialog(this,
                        "<html><font face='Calibri' size='8' color='black'>Enter User",
                        "WARNING",JOptionPane.WARNING_MESSAGE);
            } else {
            	String pwdn = pwd.getText();
            	if (pwdn.equals("")) {
                    JOptionPane.showMessageDialog(this,
                            "<html><font face='Calibri' size='8' color='black'>Enter Password",
                            "WARNING",JOptionPane.WARNING_MESSAGE);            		
            	} else {
            		new TuReciboTest(usern, pwdn);
            	}
            }
        }
        if (e.getSource() == miRojo) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == miNegro) {
            getContentPane().setBackground(new Color(0,0,0));
        }
        if (e.getSource() == miMorado) {
            getContentPane().setBackground(new Color(51,0,51));
        }
        if (e.getSource() == miNuevo) {
            user.setText("");
        }
        if (e.getSource() == miSalir) {
            dispose();
        }
    }

	public static void main(String args[]) { new TuReciboView(); }
    
}
