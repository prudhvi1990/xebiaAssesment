Please find the description of the classes that are used in the assesment.

1.Robot class is the core class that referes the ROBOT

2.TaskManager Interface hanles all the actions or tasks that will be performed by the Robot

3.BatteryManager is the interface that has the core caluclateBattery action which can be overriden by different tasks accordign to the need.

4.RobotChargeManger is the class that handles all the things related to the battery discharge and stores the current battery charge.

5.RobotProperties stores all the static properties for the robot before comes to an action.


Execution:

Download the jar form the repository

java -jar robot.jar

**output example 
**Please enter the task no provided below.
**1.Walking(W)
**2.Weighing(We)
**3.Walking&Weighing(WW)
**3
**Enter No of kms to walk
**2
**Enter weight of Load
**3
**Remaining Battery: 54.0