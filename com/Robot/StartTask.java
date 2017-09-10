package com.Robot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class StartTask {

	public static void main(String[] args) {
		try {
			Robot robot = new Robot();
			robot.performTask();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
