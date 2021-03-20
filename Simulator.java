package sims;
//import java.lang.Math;
public class Simulator {

	/*public int blockCount;
	public Simulator(int blockCount) {
		this.blockCount = blockCount;
	}*/
	
	//Represents the system memory
	public MemoryBlock[] memory = new MemoryBlock[100];
	//Record of all pages
	public int[] pages;
	
	public void simulate() {
		//Initialize memory
		for(int i = 0; i < 100; i++) {
			memory[i] = new MemoryBlock();
		}
		//Make a list of available pages by taking the counts of pages in each memory block
		int numPages = 0;
		for(int i = 0; i < 100; i++) {
			numPages += memory[i].size;
		}
		pages = new int[numPages];
		
	}
	
	public void allocate() {
		//Maintain the "free"list of available pages -do I just set array[x] = 1/0?
		//Be able to get size of ranges of contiguous free pages
		//(easiest way, iterate loop, increment count until hitting a 1)
		//First-fit page allocation when satisfying requests
	}
	
	public static void main(String[] args) {
		/*Generate 10000 requests (test with 10-100 and upscale once it works)	
		Don't attempt to allocate blocks that are already allocated,
		or free blocks that are currently free*/
		
		//Run the allocate method
		//Log/output memory allocations, track fragmentation
	}
}

