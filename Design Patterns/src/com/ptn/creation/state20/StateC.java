package com.ptn.creation.state20;

public class StateC extends State{

	@Override
	public void firstStep() {
		System.out.println("已经执行第一步，无操作");
	}

	@Override
	public void secondStep() {
		System.out.println("已经执行第二步，无操作");
	}

	@Override
	public void thirdStep() {
		// TODO Auto-generated method stub
		System.out.println("执行第三步");
	}

}
