package com.ptn.creation.templateMethod14;

public abstract class WebCrawlerFramework {

	public final void start() {
		initURL();
		initConnection();
		threadOperation();
		extractInfo();
		dbOperation();
	}

	protected abstract void initURL();

	protected void initConnection() {
		System.out.println("建立连接，初始化爬虫");
	};

	protected void threadOperation() {
		System.out.println("采用多线程，下载网页数据");
	};

	protected abstract void extractInfo();

	protected abstract void dbOperation();

}
