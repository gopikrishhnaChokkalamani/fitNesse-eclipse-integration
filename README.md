# fitNesse-eclipse-integration
A example to display the FitNesse Eclipse Integration

Add the below Dependency in POM.xml
<dependency>
			<groupId>org.fitnesse</groupId>
			<artifactId>fitnesse</artifactId>
			<version>20161106</version>
</dependency>

Run the project from "Run Configurations -> Java Application -> New"

Give a suitable Name,

In the Main Class textbox type -> fitnesseMain.FitNesseMain

FitNesse will now start from the Eclipse, and can be accessed in localhost

Go to FitNesse UI page, create a Test Page and create a table for fitNesse Test fixture


!path target\classes

!|com.gi.fitnesse.CalculatorFixture|
|first|second|addition?|multiply?|
|1|3|4|3|
|100|2|102|200|


Click on test to test the Java code.

If you want to DEBUG the code, add the below lines in the fitNesse fixture code

!define COMMAND_PATTERN {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=1044 -cp %p %m}

then, go to Project, right click -> Debug As -> Debug Configurations -> Remote Java Application -> New

provide a suitable name, and give port as 1044 (as per mentioned in fixture)

then select the source tab -> Add -> Java Project -> select your project

Click on Apply and hit Cancel (Do Not Debug).

Now go to your fitNesse UI and hit Test (you will notice the browser will keep on loading, this is because you have added the DEBUG COMMAND in the fixture and Fitnesse is now avaiting for DEBUG Responder to pick up the FitNesse request)

Go back to your Eclipse, select DEBUG -> select the DEBUG option you added. Now you will notice that debug option will be enabled and source will point to the place where you placed your debug point


