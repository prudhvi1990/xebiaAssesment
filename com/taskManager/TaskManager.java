package com.taskManager;

import com.tasks.BatteryManager;

public interface TaskManager {

	public void enterTasks() throws Exception;
	
	public BatteryManager doTask()throws Exception;
	
}
