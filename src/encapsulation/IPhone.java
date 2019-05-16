package encapsulation;

public class IPhone {

	private String model;
	private int memory;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void info() {
		System.out.println("Model: " + this.model);
		System.out.println("Memory: " + this.memory);
	}
}
