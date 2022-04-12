# Robot-Command-Based
## FRC For the University of Texas at El Paso

Robot was designed for the college for Engineering for The University
of Texas at El Paso. Robot cost was $6,000+ dollars and includes room for upgrades.  

## Features | Systems

- Systems include DriveTrain, Elevator/Intake, Shooter, and an Arm.
- Will include self driving using proximity sensors, Pixy2 Camera, and Encoder sensors. 

## Needed Materials
- Playstation remote with bluetooth working preferably. Any other remote works well as well.
- Laptop/Tablet to run the code.

## How to Use

Remote Control
- LEFT JOYSTICK: DriveTrain
- X BUTTON: Unfolding Forearm
- ∆ BUTTON: Fold Forearm
- ⬚ BUTTON: Autonomous Unfolding (Forearm & Upper Arm)
- 〇 BUTTON: Autonomous Folding (Forearm & Upper Arm)
- LEFT-LOWER-BUMPER-BUTTON: Folding Upper Arm
- RIGHT-UPPER-BUMPER-BUTTON: Unfolding Upper Arm
- LEFT-UPPER-BUMPER-BUTTON: Shoots ball
- RIGHT-LOWER-BUMPER-BUTTON: Moves Elevator

# Code
Depending on how the robot is build, the developer will need to adjust the direction of the motor and the speed of the motor if needed.

You can do this with the command "NAME_OF_MOTOR.setInverted(true);"
You can changed the speed of the motors by going into the Constants.java file and changing the value.
## How To Run Code

This code need Visual Studio code, and WPILIB installed in your computer. 

What you need to run the code is simply to click on the play button to compile the code. 

To run robot simulation, click on the the button with the three dots on the top right of the code, and click on "Build Robot Code." After this, press command-shift-p to open a search bar and type "WPILIB: SIMULATE ROBOT CODE ON DESKTOP."

After this, a blue window will open that will run the simulation. 
