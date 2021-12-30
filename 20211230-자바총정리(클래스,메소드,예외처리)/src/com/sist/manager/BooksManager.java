package com.sist.manager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.*;
// ������ �����͸� ���� �� => ����Ŭ�� ���� 
/*
 *   1.����Ŭ�� ���� ���� (TABLE)
 *  ======================== �����ͺ��̽� ���� 
 *   2.�ڹٿ� �����͸� ���� (Books)
 *   3.�ڹٿ��� ����Ŭ ���� (BooksDAO)
 *   4.�� ������ �б� => DAO�� ���� 
 *  ======================== ������ ���� 
 *  
 *  ���� �ǹ� 
 *  �䱸���� �м�  =====> �����ͺ��̽� ���� ======> �����ͼ���
 *  ----------         ------------         -------- 
 *  =====> ȭ��UI ======> ���� ====> �׽��� ===> ���� 
 *        -------       -----     ------     ----
 */
public class BooksManager {
    // ���� Ŭ���� 
	private BooksDAO dao=new BooksDAO();
	public void booksGetData()
	{
		try
		{
			// ������Ʈ ���� 
			/*
			 *    <a>aaa</a> ===> text()
			 *    <a href="aaa"> ==> attr("href")
			 */
			// <div class="sub-title">�ڹ� �ڵ�� �����ϴ� Ŭ�� �� ���ø����̼�</div>
			Document doc=
					Jsoup.connect("https://wikibook.co.kr/list/").get();
			Elements title=doc.select("div.book-list-detail h4.main-title");
			Elements poster=doc.select("div.book-list-image img");
			Elements content=doc.select("div.book-list-detail div.sub-title");
			Elements etc=doc.select("div.book-info");
			/*
			 *   �ڰ��� ���� | 29,000�� | 2021�� 12�� 15�� | ISBN: 9791158392963 ������,����,��Ʃ��,���̳� �� ����,Final Cut Pro
			 */
			for(int i=0;i<title.size();i++)
			{
				try
				{
				  System.out.println(i+1);
				  System.out.println(title.get(i).text());
				  System.out.println(poster.get(i).attr("src"));
				  System.out.println(content.get(i).text());
				  System.out.println(etc.get(i).text());
				  System.out.println("========================================");
				
				  Books book=new Books();
				  book.setNo(i+1);
				  book.setTitle(title.get(i).text());
				  book.setPoster(poster.get(i).attr("src"));
				  book.setContent(content.get(i).text());
				  
				  String[] info=etc.get(i).text().split("\\|");
				  // �ڰ��� ���� 
				  String author=info[0];
				  author=author.substring(0,author.lastIndexOf("��"));
				  book.setAuthor(author.trim());
				  book.setPrice(info[1].trim());
				  book.setRegdate(info[2].trim());
				  String temp=info[3].trim();
				  
				}catch(Exception ex){}
		   }
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BooksManager bm=new BooksManager();
		bm.booksGetData();
	}
	
}












