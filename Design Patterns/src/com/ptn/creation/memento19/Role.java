package com.ptn.creation.memento19;

public class Role {

	private String name;
	private int vitality;
	private int attack;
	private int defence;

	public Role(int vitality, int attack, int defence) {
		this.defence = defence;
		this.attack = attack;
		this.vitality = vitality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Role [name=" + name + ", vitality=" + vitality + ", attack=" + attack + ", defence=" + defence
				+ "]";
	}

	public RoleMemento save() {
		return new RoleMemento(vitality, attack, defence);
	}

	public void restore(RoleMemento memento) {
		attack = memento.getAttack();
		defence = memento.getDefence();
		vitality = memento.getVitality();
	}

}
