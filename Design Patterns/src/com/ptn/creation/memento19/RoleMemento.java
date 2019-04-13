package com.ptn.creation.memento19;

public class RoleMemento {

	private int vitality;
	private int attack;
	private int defence;

	public RoleMemento(int vitality, int attack, int defence) {
		this.defence = defence;
		this.attack = attack;
		this.vitality = vitality;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

}
