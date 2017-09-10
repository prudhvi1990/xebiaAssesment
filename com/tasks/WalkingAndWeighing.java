package com.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Robot.RobotChargeManager;

public class WalkingAndWeighing  implements BatteryManager{
	Double weight,noOfKms; 
	BufferedReader br;
	
	@Override
	public Double caluclateRemaingBattery(RobotChargeManager chargeManager) throws Exception  {
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter No of kms to walk");
			noOfKms = Double.parseDouble(br.readLine());
			System.out.println("Enter weight of Load");
			weight = Double.parseDouble(br.readLine());		
			if(weight > chargeManager.getMaxWeight()){
				System.out.println("Robot can carry a maximum weight of: "+chargeManager.getMaxWeight());
			} else {
				chargeManager.setCurrentCharge(chargeManager.getRobotCharge() - ((weight*chargeManager.getPercentageChargeConsumedOnWeight())+(noOfKms*chargeManager.getRobotCharge())/chargeManager.getNoOfKmsRobotWalksonFullCharge()));
				return chargeManager.getCurrentCharge();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Enter corresponding value to inputs");
		}
		
		return null;
	}
}
