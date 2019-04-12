package com.ptn.creation.templateMethod14;

public class CSDNCrawler  extends WebCrawlerFramework {

	@Override
	protected void initURL() {
		System.out.println("选择CSDN种子节点");
	}

	@Override
	protected void extractInfo() {
		System.out.println("根据CSDN页面结构，提取关注数据");
	}

	@Override
	protected void dbOperation() {
		// TODO Auto-generated method stub
		System.out.println("存入MySQL数据库");
	}

}
