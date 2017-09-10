package com.Robot;



import java.util.Properties;

public class RobotChargeManager {

	private Double robotCharge ;
	private Double noOfKmsRobotWalksonFullCharge;
	private Double percentageChargeConsumedOnWeight;
	private Double maxWeight;
	private Double percentageToShowRedLight;
	private Double currentCharge;

	Properties prop = new Properties();

	public RobotChargeManager() {
		this.robotCharge = RobotProperties.robotCharge;
		this.noOfKmsRobotWalksonFullCharge = RobotProperties.noOfKmsRobotWalksonFullCharge;
		this.percentageChargeConsumedOnWeight = RobotProperties.percentageChargeConsumedOnWeight;
		this.maxWeight = RobotProperties.maxWeight;
		this.percentageToShowRedLight = RobotProperties.percentageToShowRedLight;

	}

	public Double getRobotCharge() {
		return robotCharge;
	}

	public void setRobotCharge(Double robotCharge) {
		this.robotCharge = robotCharge;
	}

	public Double getNoOfKmsRobotWalksonFullCharge() {
		return noOfKmsRobotWalksonFullCharge;
	}

	public void setNoOfKmsRobotWalksonFullCharge(
			Double noOfKmsRobotWalksonFullCharge) {
		this.noOfKmsRobotWalksonFullCharge = noOfKmsRobotWalksonFullCharge;
	}

	public Double getPercentageChargeConsumedOnWeight() {
		return percentageChargeConsumedOnWeight;
	}

	public void setPercentageChargeConsumedOnWeight(
			Double percentageChargeConsumedOnWeight) {
		this.percentageChargeConsumedOnWeight = percentageChargeConsumedOnWeight;
	}

	public Double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(Double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public Double getPercentageToShowRedLight() {
		return percentageToShowRedLight;
	}

	public void setPercentageToShowRedLight(Double percentageToShowRedLight) {
		this.percentageToShowRedLight = percentageToShowRedLight;
	}

	public Double getCurrentCharge() {
		return currentCharge;
	}

	public void setCurrentCharge(Double currentCharge) {
		this.currentCharge = currentCharge;
	}

}
