
public class TaskApplication {

	public static void main(String[] args) {
		
		Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");
        Task t3 = new Task("Task 3");

        t1.setPriority(3);
        t2.setPriority(7);
        t3.setPriority(5);

        t1.setStatus(Task.status.IN_PROCESS);
        t2.setStatus(Task.status.NOT_STARTED);
        t3.setStatus(Task.status.COMPLETE);

        System.out.println("Task 1: " + t1);
        System.out.println("Task 2: " + t2);
        System.out.println("Task 3: " + t3);
        System.out.println("");

        double priorityCompar = t1.compareTo(t2);
        if (priorityCompar < 0) {
            System.out.println(t1.getName() + " is set to a lower priority than " + t2.getName()+".");
        } else if (priorityCompar > 0) {
            System.out.println(t1.getName() + "is set to a higher priority than " + t2.getName()+".");
        } else {
            System.out.println(t1.getName() + " and " + t2.getName() + " are set to the same priority.");
        }
        
        double priorityCompar2 = t2.compareTo(t3);
        if (priorityCompar2 < 0) {
            System.out.println(t2.getName() + " is set to a lower priority than " + t3.getName()+".");
        } else if (priorityCompar2 > 0) {
            System.out.println(t2.getName() + " is set to a higher priority than " + t3.getName()+".");
        } else {
            System.out.println(t2.getName() + " and " + t3.getName() + " are set to the same priority.");
        }

        System.out.println("");
        
        //test process class
        Process p1 = new Process("Process 1");
        Process p2 = new Process("Process 2");
        Process p3 = new Process("Process 3");
        
        p1.setPriority(1);
        p2.setPriority(9);
        p3.setPriority(8);
        
        System.out.println("Process 1: " + p1);
        System.out.println("Process 2: " + p2);
        System.out.println("Process 3: " + p3);
        System.out.println("");
        
        double processCompar = p1.compareTo(p2);
        if (processCompar < 0) {
            System.out.println(p1.getProcessID() + " is set to a priority than " + p2.getProcessID()+".");
        } else if (processCompar > 0) {
            System.out.println(p1.getProcessID() + " is set to a priority than " + p2.getProcessID()+".");
        } else {
            System.out.println(p1.getProcessID() + " and " + p2.getProcessID() + " are set to the same priority.");
        }
        
        double processCompar1 = p2.compareTo(p3);
        if (processCompar1 < 0) {
            System.out.println(p2.getProcessID() + " is set to a lower priority than " + p3.getProcessID()+".");
        } else if (processCompar1 > 0) {
            System.out.println(p2.getProcessID() + " is set to a higher priority than " + p3.getProcessID() +".");
        } else {
            System.out.println(p2.getProcessID() + " and " + p3.getProcessID() + " are set to the same priority.");
        }
        
        
	}//end main

}//end class
