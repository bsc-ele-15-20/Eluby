//
// BSC-ELE-15-20

public class StopWatch {
	private long endTime;	
    private long startTime; 
	
	public void start() {
		startTime = System.currentTimeMillis();
	} 
        StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

     public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getStratTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
}