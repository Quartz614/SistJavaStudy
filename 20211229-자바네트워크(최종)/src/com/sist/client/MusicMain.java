package com.sist.client;
// ������ ==> HTML 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// ��Ʈ��ũ 
import java.io.*;
import java.net.*;
import java.util.*;
public class MusicMain extends JFrame{
    CardLayout card=new CardLayout();
    Login login=new Login();
    MusicView mv=new MusicView();
    public MusicMain()
    {
    	setLayout(card); // BorderLayout => ����
    	// ȭ��=> ��Ƶд� => 
    	/*
    	 *   Login => ���� ����  
    	 *   Music => ���� ��� , ���� ã�� 
    	 */
    	add("LOGIN",login);
    	add("MV",mv);
    	
    	// ũ�� ���� 
    	setSize(800,600);
    	// ������ �����޶�
    	setVisible(true);
    	// �����ư Ŭ���� ������ ����
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �����ڸ� ȣ�� 
		new MusicMain();
	}

}
