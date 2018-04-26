
public class myRobot implements Robot {
	String name;
	int workCapacity;
	boolean isBusy;
	
	myRobot(String name, int workCapacity){
		this.name = name;
		this.workCapacity = workCapacity;
		this.isBusy = false;
	}
	
	@Override
	public int work() {
		return workCapacity;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isWorking() {
		// TODO Auto-generated method stub
		return isBusy;
	}
	

	@Override
	public void setIsBusy(boolean bool) {
		// TODO Auto-generated method stub
		this.isBusy = bool;
	}

}
