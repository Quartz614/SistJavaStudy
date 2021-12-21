package com.sist.movie;
// Back-End
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MovieSystem {
   // 1. ��ȭ�� ��� ������ ������ �ִ� 
   // 2. ��� Ŭ���̾�Ʈ(�����) => ���� �����͸� ��� => ���� 
   // 3. ���� => static (static���� => �޸� ���� 1����) 
   // 4. static => ��� ������ ������ �� �ִ� => ����Ŭ 
   // 5. ��ȭ 1���� ���� ���� => Movie => ������ (����)
   // ======> �迭 / Collection
   // �迭 => ��ȭ ���� Ȯ�� (����) , Collection => ���� 
   private static ArrayList<Movie> list=new ArrayList<Movie>();
   // list=null => size=0 => �ʱ�ȭ 
   /*
    *    ����� �ʱ�ȭ => X (�Ϲ� �����͸� ó��)
    *    �ʱ�ȭ ��� => �ܺ� ������ �о ���� 
    *    ������     => �ܺο��� ������ �о ����
    */
   // �ʱ�ȭ ��� => Ŭ������ �ε�Ǿ����� �ڵ����� �����ϴ� ��� => �ʱ�ȭ ����� ����ȴ�  
   static 
   {
	   // ������ �б� 
	   // 1.����Ʈ�� ���� (��Ʈ��ũ => CheckException) => �ݵ�� ����ó�� 
	   // 1. IO (���� �����) , 2. ������ , 3 ��Ʈ��ũ , 4. SQL(�����ͺ��̽�)
	   try
	   {
		   // ����Ʈ ���� => �����͸� �о ���� (Document:���� ����)
		   Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
		   /*
		    * private String title;
			    private double score;
			    private String reserve;
			    private String story;
			    private String regdate;
		    */
		   Elements title=doc.select("");
		   Elements score=doc.select("");
		   Elements reserve=doc.select("");
		   Elements story=doc.select("");
		   Elements regdate=doc.select("");
		   
	   }catch(Exception ex)
	   {
		   System.out.println(ex.getMessage()); // ���� �޼��� ��� 
	   }
	   
   }
   //1.������ ��� 
   //2.ã�� 
}










