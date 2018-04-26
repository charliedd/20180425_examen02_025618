
public interface Task {
	void setRobot(Robot robot);
	void startTask();
	void workOnTask();
	void getStatus();
	void taskEnded();
	boolean isFinished();
	Robot getRobot();
	String toString();
}
