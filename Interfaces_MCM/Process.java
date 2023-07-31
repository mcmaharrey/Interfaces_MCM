
public class Process implements Priority, Comparable{
	
	private String processID;
	private int priority;
	
	public Process(String processID) {
		this.processID = processID;
	}//constructor

	
	public double compareTo(Object other) {
		return Integer.compare(this.priority, ((Process) other).getPriority());
	}//end compareTo

	public String getProcessID() {
		return processID;
	}//end getProcess

	public int getPriority() {
		return priority;
		
	}//end getPriority

	public void setPriority(int priority) {
		if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
			this.priority = priority;
		}
	}//end setPriority

	@Override
	public String toString() {
		return "ProcessID=" + processID + ", priority=" + priority;
	}


}//end class
