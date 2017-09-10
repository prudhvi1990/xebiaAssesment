package com.taskManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tasks.BatteryManager;
import com.tasks.Walking;
import com.tasks.WalkingAndWeighing;
import com.tasks.Weighing;

public class TaskManagerImpl implements TaskManager {
public int taskNo;
private BufferedReader br;

	@Override
	public BatteryManager doTask() throws Exception {
		// TODO Auto-generated method stub
		BatteryManager bm = null;

		switch (taskNo) {
		case 1:
			bm = new Walking();
			break;
		case 2:
			bm = new Weighing();
			break;
		case 3:
			bm = new WalkingAndWeighing();
			break;

		default:
			System.out.println("Please enter the valid task No");
			enterTasks();
			break;
		}

		return bm;
	}

	@Override
	public void enterTasks() throws Exception {
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Please enter the task no provided below.\n1.Walking(W)\n2.Weighing(We)\n3.Walking&Weighing(WW)");
			taskNo = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			throw new Exception("Enter corresponding value to inputs");
		}
	}

}
