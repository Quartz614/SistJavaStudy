package com.sist.movie;
// ��ȭ �ý��� ==> �޼ҵ� 
// 1. �����͸� ���� ==> �������� ��� (static) 
import java.util.*;
import java.io.*;
public class MovieSystem {
  // 1. ������ ������ ���� 
  private static MovieVO[] movie_data=new MovieVO[1938];
  // ����� ���� Ŭ���� => �Ϲ� ���������� �����ϰ� ��� �Ѵ� 
  // class => �����͸� ��Ƽ� ���� 
  // Ŭ���� �迭 , String[] => ��ü �迭 
  // movie_data => ���� ÷�� 
  static
  {
	  // �ʱ�ȭ ���
	  try 
	  {
		 FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		 // ���� �б� 
		 StringBuffer sb=new StringBuffer();
		 int i=0;
		 // 'A' => 65 , 'a' => 97
		 while((i=fr.read())!=-1) // -1 (EOF => end of file)
		 {
			 sb.append(String.valueOf((char)i));
		 }
		 
		 //System.out.println(sb.toString());
		 String movie=sb.toString();
		 String[] m=movie.split("\n");
		 System.out.println("ũ��:"+m.length);
		 for(int j=0;j<m.length;j++)
		 {
			
			 String[] rm=m[j].split("\\|");
			 MovieVO vo=new MovieVO();
			 vo.setNo(Integer.parseInt(rm[0]));// String => int
			 // Integer.parseInt ==> Wrapper (�� ������������ Ŭ������ ������� �ִ�)
			 vo.setTitle(rm[1]);
			 vo.setGenre(rm[2]);
			 vo.setPoster(rm[3]);
			 vo.setActor(rm[4]);
			 vo.setRegdate(rm[5]);
			 vo.setGrade(rm[6]);
			 vo.setDirector(rm[7]);
			 System.out.println(vo.getNo());
			 //System.out.println("����:"+vo.getTitle());
			 movie_data[j]=vo;
			
		 }
	  }catch(Exception ex){}
  }
  
  public static void main(String[] args) {
	   for(MovieVO vo:MovieSystem.movie_data)
	   {
		   System.out.println("����:"+vo.getTitle());
		   System.out.println("�帣:"+vo.getGenre());
		   System.out.println("===============================");
	   }
  }
	
}






