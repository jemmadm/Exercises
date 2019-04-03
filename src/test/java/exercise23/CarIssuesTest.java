package exercise23;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarIssuesTest {

    @Test
    public void firstQuestion() {
        CarIssues carIssues = new CarIssues();
        Question firstQuestion = carIssues.getCurrentQuestion();
        assertThat(firstQuestion.getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void getBatteryCorrodedQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Are the battery terminals corroded?");
    }

    @Test
    public void getClickingNoiseQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Does the car make a clicking noise?");
    }

    @Test
    public void getCarCrankQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Does the car crank up but fail to start?");
    }

    @Test
    public void getEngineStartQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Does the engine start and then die?");
    }

    @Test
    public void getFuelInjectionQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Does your car have fuel injection?");
    }

    @Test
    public void getCleanTerminalsQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Clean terminals and try starting again. Did it fix it?");
    }

    @Test
    public void getReplaceCablesQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Replace cables and try again. Did it fix it?");
    }

    @Test
    public void getReplaceBatteryQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Replace the battery. Did it fix it?");
    }

    @Test
    public void getCheckSparkPlugsQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Check spark plug connections. Did it fix it?");
    }

    @Test
    public void getCarSilentQuestionWhenEngineDoesntStart() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void getCheckChokeQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Check to ensure the choke is opening and closing. Did it fix it?");
    }

    @Test
    public void getServiceQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Get it in for service. Did it fix it?");
    }

    @Test
    public void cleanTerminalsFixedItReturnNull() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        carIssues.answer(true);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion()).isEqualTo(null);
    }

    @Test
    public void cleanTerminalsNotFixedReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        carIssues.answer(true);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void replaceCablesFixedItReturnNull() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        carIssues.answer(false);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion()).isEqualTo(null);
    }

    @Test
    public void replaceCablesNotFixedItReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(true);
        carIssues.answer(false);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void replaceBatteryFixedItReturnNull() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion()).isEqualTo(null);
    }

    @Test
    public void replaceBatteryNotFixedItReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void checkSparkPlugFixedItReturnNull() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion()).isEqualTo(null);
    }

    @Test
    public void checkSparkPlugNotFixedItReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void checkEngineStartsNotFixedItReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void checkChokeFixedItReturnNull() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(false);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion()).isEqualTo(null);
    }

    @Test
    public void checkChokeNotFixedItReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(false);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }

    @Test
    public void checkServiceFixedItReturnNull() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(true);
        carIssues.answer(true);
        assertThat(carIssues.getCurrentQuestion()).isEqualTo(null);
    }

    @Test
    public void checkServiceNotFixedItReturnCarSilentQuestion() {
        CarIssues carIssues = new CarIssues();
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(false);
        carIssues.answer(true);
        carIssues.answer(true);
        carIssues.answer(false);
        assertThat(carIssues.getCurrentQuestion().getText()).isEqualTo("Is the car silent when you turn they key?");
    }
}

