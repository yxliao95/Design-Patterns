package com.ptn.creation.templateMethod14;

public class Test {
	public static void main(String[] args) {
		WebCrawlerFramework crawler = new CSDNCrawler();
		crawler.start();
		
		System.out.println();
		WebCrawlerFramework crawler2 = new TaobaoCrawler();
		crawler.start();
	}
}
