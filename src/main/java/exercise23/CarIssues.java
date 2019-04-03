package exercise23;

import java.util.Scanner;

public class CarIssues {

    private Question currentQuestion;


    CarIssues() {

        Question carSilentQuestion = new Question("Is the car silent when you turn they key?");
        Question batteryCorrodedQuestion = new Question("Are the battery terminals corroded?");
        Question carClickingNoiseQuestion = new Question("Does the car make a clicking noise?");
        Question carCrankQuestion = new Question("Does the car crank up but fail to start?");
        Question engineStartAndDieQuestion = new Question("Does the engine start and then die?");
        Question fuelInjectionQuestion = new Question("Does your car have fuel injection?");
        Question cleanTerminalsQuestion = new Question("Clean terminals and try starting again. Did it fix it?");
        Question replaceCablesQuestion = new Question("Replace cables and try again. Did it fix it?");
        Question replaceBatteryQuestion = new Question("Replace the battery. Did it fix it?");
        Question checkSparkPlugsQuestion = new Question("Check spark plug connections. Did it fix it?");
        Question checkChokeQuestion = new Question("Check to ensure the choke is opening and closing. Did it fix it?");
        Question serviceQuestion = new Question("Get it in for service. Did it fix it?");

        carSilentQuestion.setYesQuestion(batteryCorrodedQuestion);
        carSilentQuestion.setNoQuestion(carClickingNoiseQuestion);
        batteryCorrodedQuestion.setYesQuestion(cleanTerminalsQuestion);
        batteryCorrodedQuestion.setNoQuestion(replaceCablesQuestion);
        cleanTerminalsQuestion.setNoQuestion(carSilentQuestion);
        replaceCablesQuestion.setNoQuestion(carSilentQuestion);
        replaceBatteryQuestion.setNoQuestion(carSilentQuestion);
        carClickingNoiseQuestion.setNoQuestion(carCrankQuestion);
        carClickingNoiseQuestion.setYesQuestion(replaceBatteryQuestion);
        checkSparkPlugsQuestion.setNoQuestion(carSilentQuestion);
        carCrankQuestion.setYesQuestion(checkSparkPlugsQuestion);
        carCrankQuestion.setNoQuestion(engineStartAndDieQuestion);
        engineStartAndDieQuestion.setYesQuestion(fuelInjectionQuestion);
        engineStartAndDieQuestion.setNoQuestion(carSilentQuestion);
        fuelInjectionQuestion.setYesQuestion(serviceQuestion);
        fuelInjectionQuestion.setNoQuestion(checkChokeQuestion);
        checkChokeQuestion.setNoQuestion(carSilentQuestion);
        serviceQuestion.setNoQuestion(carSilentQuestion);

        currentQuestion = carSilentQuestion;
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public void answer(boolean answer) {

        if (answer == true) {
            currentQuestion = currentQuestion.getYesQuestion();
        } else {
            currentQuestion = currentQuestion.getNoQuestion();
        }
    }
}
