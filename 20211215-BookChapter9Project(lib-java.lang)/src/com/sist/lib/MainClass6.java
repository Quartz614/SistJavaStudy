package com.sist.lib;
/*
 *   replace(char c1,char c2)
 *           old       new
 *   replace(String s1,String s2)
 *           old         new 
 *   replaceAll(String regex,String s)
 *           old              new  ==> ���Խ� 
 *           
 *   ������ ����
 *   211.238.142.181
 *   127.0.0.1
 *   211.63.64.10
 *   211.238.142.1 
 *   
 *   [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}
 *   
 *   ���ִ� ���ְ� ���ְ� ���ְ�....
 *   ����+
 */
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java!!";
        String s1=s.replace('a', 'b');
        System.out.println(s1);
        String s2=s.replace("ll", "LL");
        System.out.println(s2);
	}

}






