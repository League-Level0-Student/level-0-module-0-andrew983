/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot

Robot phil = new Robot();
        // 3. Put the robot's pen down
phil.setRandomPenColor();
phil.penDown();

        // 6. Make the robot move as fast as possible

phil.setSpeed(1080);
        // 5. Do everything below here 4 times
for(int i=0;i<4;i++) {
phil.turn(90);
      phil.move(200);

}
        //         4. Turn the robot 90 degrees to the right (90 degrees)

  //         2. Move your robot 200 pixels
    }
}
