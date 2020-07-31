# JAVA KATA CODE REFACTORED

## Get the code
In order to get the code, git clone the repository and put it in your laptop.

## Compile the code

In order to compile the code, you will need multiple things:

- First, check if maven is installed in your machine. If not, install it and configure the path correcty to be able to launch the mvn clean install in the commandline.
- Go to the directory where you put the project and open a command line.
- Tap mvn clean install. It will install all the necessary library and launch the test case.

## RUN THE CODE
Once the code is compiled with maven and no error is founded in the testcase. 
- Open your ide, in my case it's netbeans and the project in it.
- Go to the project root in your ide and right click on it. 
- Launch the TexttestFixtures code and then hover the setconfiguration line and then click on customize
- Then go to the action tab and find "run file via main()" in the action field. Click on it and replace the line exec.args=-classpath %classpath ${packageClassName} with this one exec.args=-classpath %classpath ${packageClassName} 30

- Click in OK
- Then right Click on the TexttestFixture.java and click on run.
- The output will be show the result for 30 days.

- You can compare it with the thirtydays.txt file founded in the ada folder at this repository https://github.com/emilybache/GildedRose-Refactoring-Kata
