package com.ptn.creation._20state;

public abstract class State {

	/**
	 *持有上下文的对象，才能改变该上下文所处的状态
	 */
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void firstStep();

	public abstract void secondStep();

	public abstract void thirdStep();
}
