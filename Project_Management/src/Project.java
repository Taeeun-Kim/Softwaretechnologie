import java.util.*;
public class Project {
	
	private String name;
	private String description;
	
	private Task task;
	
	public Project(String name, String description, double rate) {
		task = new Task(name,description,rate);
	}
	
	public String getName(){
		return task.getName();
	}
	
	public Map<Calendar, List<Deliverable>> allDeliverables(){
		
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setTask(Task newTask) {
		this.task = newTask;
	}
	public double getDuration() {
		return task.getTimeRequired();
	}
	public long getTotalCost() {
		return task.getCostEstimate();
	}
	public List<Deliverable> allDeliverables() {
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
