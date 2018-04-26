
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new myTask(3, "Task1", false);
		Task task2 = new myTask(3, "Task2", false);		
		Task task3 = new myTask(3, "Task3", false);		
		Task task4 = new myTask(3, "Task4", false);		
		Task task5 = new myTask(3, "Task5", false);		
		Task task6 = new myTask(3, "Task6", false);		
		Task task7 = new myTask(3, "Task7", false);
		Task task8 = new myTask(3, "Task8", false);		
		Task task9 = new myTask(3, "Task9", false);		
		Task task10 = new myTask(3, "Task10", false);		
		Task task11 = new myTask(3, "Task11", false);		
		Task task12 = new myTask(3, "Task12", false);
		Task task13 = new myTask(3, "Task13", false);
		Task task14 = new myTask(3, "Task14", false);		
		Task task15 = new myTask(3, "Task15", false);		
		Task task16 = new myTask(3, "Task16", false);		
		Task task17 = new myTask(3, "Task17", false);		
		Task task18 = new myTask(3, "Task18", false);
		Task task19 = new myTask(3, "Task19", false);
		Task task20 = new myTask(3, "Task20", false);
		
		Robot robot1 = new myRobot("Robot1", 2);
		Robot robot2 = new myRobot("Robot2", 2);
		Robot robot3 = new myRobot("Robot3", 2);
		Robot robot4 = new myRobot("Robot4", 2);
		
		Log log = new Log();
		log.newRobot(robot1);
		log.newRobot(robot2);
		log.newRobot(robot3);
		log.newRobot(robot4);
		
		log.newTask(task1);
		log.newTask(task2);
		log.newTask(task3);
		log.newTask(task4);
		log.newTask(task5);
		log.newTask(task6);
		log.newTask(task7);
		log.newTask(task8);
		log.newTask(task9);
		log.newTask(task10);
		log.newTask(task11);
		log.newTask(task12);
		log.newTask(task13);
		log.newTask(task14);
		log.newTask(task15);
		log.newTask(task16);
		log.newTask(task17);
		log.newTask(task18);
		log.newTask(task19);
		log.newTask(task20);
		
		log.assignTasks();
		log.printlog();
	}

}
