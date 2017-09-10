package com.Robot;

import com.taskManager.TaskManagerImpl;
import com.taskManager.TaskManager;
import com.tasks.BatteryManager;

/**
 * Core class that triggers the tassk fuctions
 *
 */
public class Robot {
	//Core class that holds all the details regarding Discharge of battery  
	public RobotChargeManager chargeManager;
	
	//Interface that manages Robot tasks 
	public TaskManager taskManager;
	
	//Interface that controls battery caluclation 	
	public BatteryManager bm;

	public Robot() {
		chargeManager = new RobotChargeManager();

	}

	public void performTask() {
		//created reference of the Implementation Class
		try {
			taskManager = new TaskManagerImpl();

			//this trigger the user to enter the taks number  
			taskManager.enterTasks();
			
			//this returns the corresponding task reference for the number entered previously 
			bm = taskManager.doTask();
			

			Double remainingBattery = bm.caluclateRemaingBattery(chargeManager);
			if (remainingBattery != null) {
				System.out.println("Remaining Battery: " + (remainingBattery < 0 ? 0 :remainingBattery));
				if (remainingBattery < chargeManager.getPercentageToShowRedLight() && remainingBattery > 0) {
					System.out.println("Low Battery Warning ");
				} else if(remainingBattery < 0){
					System.out.println("Robot Dead");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
