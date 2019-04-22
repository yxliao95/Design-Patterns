package com.ptn.creation._14templateMethod;

public class TaobaoCrawler extends WebCrawlerFramework {

	@Override
	protected void initURL() {
		// TODO Auto-generated method stub
		System.out.println("选择淘宝页面作为种子节点");
	}

	@Override
	protected void extractInfo() {
		// TODO Auto-generated method stub
		System.out.println("定义正则表达式，提取淘宝页面数据");
	}

	@Override
	protected void dbOperation() {
		// TODO Auto-generated method stub
		System.out.println("存入Oracle数据库");
	}

}
