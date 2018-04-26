import java.text.SimpleDateFormat;
import java.util.Date;

public class myTask implements Task{
	String name;
	int duration;
	Robot currentRobot;
	boolean isFinished;
	String dateStarted;
	String dateFinished;
	SimpleDateFormat formatter;
	

	myTask(int duration, String name, boolean isFinished){
		formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		this.duration = duration;
		this.name = name;
		this.isFinished = isFinished;
		this.currentRobot = null;
		dateStarted = null;
		dateFinished = null;
	}
	
	@Override
	public void setRobot(Robot robot) {
		Date date = new Date();  
		this.currentRobot = robot;
		dateStarted = formatter.format(date);
		startTask();
	}

	@Override
	public void startTask() {	
		this.currentRobot.setIsBusy(true);
	}

	@Override
	public void taskEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void workOnTask() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Robot getRobot() {
		// TODO Auto-generated method stub
		return currentRobot;
	}
	
	public String toString(){
		return ("Task: " + this.name + " Robot: " + this.currentRobot.getName() + "Date Started:" + dateStarted);
	}

}
