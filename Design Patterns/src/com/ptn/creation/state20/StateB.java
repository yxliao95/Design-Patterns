package com.ptn.creation.state20;

public class StateB extends State{

	@Override
	public void firstStep() {
		System.out.println("已经执行第一步，无操作");
	}

	@Override
	public void secondStep() {
		System.out.println("执行第二步");
		context.changeState(Context.STATEC);
	}

	@Override
	public void thirdStep() {
		// TODO Auto-generated method stub
		System.out.println("无法执行第三步");
	}

}
