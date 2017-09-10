package com.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Robot.RobotChargeManager;

public class Weighing implements BatteryManager{
	Double weight; 
	BufferedReader br;
	@Override
	public Double caluclateRemaingBattery(RobotChargeManager chargeManager) throws Exception {
		// TODO Auto-generated method stub
		try {
			
			br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter weight of the load");
			weight = Double.parseDouble(br.readLine());
			if(weight > chargeManager.getMaxWeight()){
				System.out.println("Robot can carry a maximum weight of: "+chargeManager.getMaxWeight());
			} else {
				chargeManager.setCurrentCharge(chargeManager.getRobotCharge() - weight*chargeManager.getPercentageChargeConsumedOnWeight());
				return chargeManager.getCurrentCharge();
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			
			throw new Exception("Enter corresponding value to inputs");
		}
		return null;
	}
 
}
