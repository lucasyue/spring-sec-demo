package cn.design.structure.facade;

public class Compute {
	private Cpu cpu;
	private Memory memory;
	private Harddisk hd;

	Compute() {
		cpu = new Cpu();
		memory = new Memory();
		hd = new Harddisk();
	}

	public void startUp() {
		cpu.startUp();
		memory.startUp();
		hd.startUp();
		System.out.println("Compute start to work...");
	}

	public void shutdown() {
		cpu.stop();
		memory.stop();
		hd.stop();
		System.out.println("Compute stop working...");
	}

	public static void main(String[] args) {
		Compute c1 = new Compute();
		c1.startUp();
		c1.shutdown();
	}
}
