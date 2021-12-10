package zookeeper1;

public class Mammal {
	protected int energyLevel;
	
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}

}
