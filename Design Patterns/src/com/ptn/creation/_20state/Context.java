package com.ptn.creation._20state;

public class Context {
	public final static State STATEA = new StateA();
	public final static State STATEB = new StateB();
	public final static State STATEC = new StateC();

	public Context(State state) {
		changeState(state);
	}

	/**
	 * 上下文当前的状态
	 */
	private State state;

	public State getState() {
		return state;
	}

	public void changeState(State state) {
		this.state = state;
		// 传入自身的引用，给状态类进行回调；也可以在状态类的方法中作为参数传入。
		this.state.setContext(this);
	}

	public void firstStep() {
		state.firstStep();
	}

	public void secondStep() {
		state.secondStep();
	}

	public void thirdStep() {
		state.thirdStep();
	}

}
