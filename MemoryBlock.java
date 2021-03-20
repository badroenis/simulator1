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
		if(Math.random() < 0.1) //Chance for some significantly smaller ones
			reqProb = Math.random()/100;
		else reqProb = Math.random();
		//Free probs
		if(Math.random() < 0.1)
			freeProb = Math.random()/100;
		else freeProb = Math.random();	
	}
}

