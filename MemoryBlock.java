package sims;
import java.lang.Math;

//Represents a block of memory in the simulation
public class MemoryBlock {

	public boolean allocated;
	public int size;
	public double reqProb;
	public double freeProb;
	//public double metooProb;
	
	public MemoryBlock() {
		allocated = false;
		size = (int) (1 + 20 * Math.random());
		//req, free = probablility 0 < p < 1
		reqProb = Math.random();
		freeProb = Math.random();	
	}
}

