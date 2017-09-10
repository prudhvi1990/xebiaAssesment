package com.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Robot.RobotChargeManager;

public class Walking implements BatteryManager {
	private Double noOfKms; 
	private BufferedReader br;
	
	@Override
	public Double caluclateRemaingBattery(RobotChargeManager chargeManager) throws Exception {
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter no of kms to walk");
			noOfKms = Double.parseDouble(br.readLine()); 
			chargeManager.setCurrentCharge((chargeManager.getRobotCharge()-((noOfKms*chargeManager.getRobotCharge())/chargeManager.getNoOfKmsRobotWalksonFullCharge())));
			
			return chargeManager.getCurrentCharge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			throw new Exception("Enter corresponding value to inputs");
		}

		
		
	}
	
}
