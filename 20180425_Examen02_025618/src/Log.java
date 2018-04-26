import java.util.ArrayList;

public class Log {
	ArrayList<Task> taskList;
	ArrayList<Robot> robotList;
	Writer writer;
	
	Log(){
		taskList = new ArrayList<Task>();
		robotList = new ArrayList<Robot>();
	}
	
	public void assignTasks(){
		for(Task task : taskList){
			
			if(!task.isFinished() || task.getRobot() == null){
				for(Robot robot: robotList){
					if(!robot.isWorking()){
						task.setRobot(robot);
						break;
					}
				}
			}
		}
	}
	
	public void saveLog(){
		
	}
	
	public void retrieveLog(){
		
	}
	
	public void newTask(Task task){
		taskList.add(task);
	}
	
	public void newRobot(Robot robot){
		robotList.add(robot);
	}
	
	public void startWork(){
	}
	
	public void printlog(){
		for(Task tsk : taskList){
			if (tsk.getRobot() != null){
				System.out.println(tsk);
			}
			
		}
	}
}
