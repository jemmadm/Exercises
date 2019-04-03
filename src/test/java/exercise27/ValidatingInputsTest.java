package exercise27;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ValidatingInputsTest {

    @Test
    public void validFirstName(){
        ValidatingInputs validatingInputs = new ValidatingInputs();

        assertThat(validatingInputs.firstNameInput("Je")).isNotEmpty();
        assertThat(validatingInputs.firstNameInput(""));
    }

    @Test
    public void validLastName(){
        ValidatingInputs validatingInputs = new ValidatingInputs();

        assertThat(validatingInputs.lastNameInput("Millman")).isNotEmpty();
        assertThat(validatingInputs.lastNameInput(""));
    }

    @Test
    public void validIdSize(){
        ValidatingInputs validatingInputs = new ValidatingInputs();

        assertThat(validatingInputs.employeeIdInput("")).isEmpty();
        assertThat(validatingInputs.employeeIdInput("AA-1234")).hasSize(7);
        assertThat(validatingInputs.employeeIdInput("AA"));
    }

    @Test
    public void validIDPattern(){
        ValidatingInputs validatingInputs = new ValidatingInputs();

        assertThat(validatingInputs.employeeIdInput("AA-1234")).matches("\\D\\D"+"-"+"\\d\\d\\d\\d");
        assertThat(validatingInputs.employeeIdInput("12-CCCC")).doesNotMatch("\\D\\D"+"-"+"\\d\\d\\d\\d");
    }

    @Test
    public void validZip(){
        ValidatingInputs validatingInputs = new ValidatingInputs();
        assertThat(validatingInputs.zipInput("12345")).containsOnlyDigits();
        assertThat(validatingInputs.zipInput("999")).containsOnlyDigits();
    }

    @Test
    public void validateInputFunction(){
        ValidatingInputs validatingInputs = new ValidatingInputs();
        assertThat(validatingInputs.validateInput()).isEqualTo("Jemma Millman JM-1389 90210");
    }
}