
public class Task implements Priority, Comparable{
	
	public enum status {
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE,
		
	}//end enum

	
	private String name;
	private int priority;
	private status status;
	
	public Task(String name) {
		this.name = name;
		this.priority = 0;
		this.status = status;
	}//end constructor

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public int getPriority() {
		return priority;
	}//end getPriority

	public void setPriority(int priority) {
		if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
            this.priority = priority;
        }
	}//end setPriority
	
	public status getStatus() {
		return null ;
	}//end getStatus
	
	public void setStatus(Task.status notStarted) {
		this.status = status;
	}//end setStatus

	
	public double compareTo(Object other) {
		
		return Integer.compare(this.priority, ((Task) other).getPriority());
	}//end compareTo

	@Override
	public String toString() {
		return "Task name=" + name + ", priority=" + priority ;
	}	
	
	
}//end class
