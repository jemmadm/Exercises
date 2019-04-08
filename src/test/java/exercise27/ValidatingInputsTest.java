package exercise27;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidatingInputsTest {

    private ValidatingInputs validatingInputs = new ValidatingInputs();

    @Test
    public void validFirstName() {
        assertThat(validatingInputs.firstNameInput("Je")).isNotEmpty();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidFirstName() {

        assertThat(validatingInputs.firstNameInput("")).isNotEmpty();
    }

    @Test
    public void invalidFirstNameException() {

        assertThatThrownBy(() -> {
            validatingInputs.firstNameInput("");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("This is not a valid name. Minimum 2 characters needed.");
    }

    @Test
    public void validLastName() {

        assertThat(validatingInputs.lastNameInput("Millman")).isNotEmpty();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidLastName() {

        assertThat(validatingInputs.lastNameInput("").isEmpty());
    }

    @Test
    public void invalidLastNameException() {

        assertThatThrownBy(() -> {
            validatingInputs.lastNameInput("");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("This is not a valid name. Minimum 2 characters needed.");
    }

    @Test
    public void emptyId() {

        assertThat(validatingInputs.employeeIdInput("")).isEmpty();
    }

    @Test
    public void validIdSize() {

        assertThat(validatingInputs.employeeIdInput("AA-1234")).hasSize(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidIdSize() {

        assertThat(validatingInputs.employeeIdInput("AA")).hasSize(7);
    }

    @Test
    public void invalidIdException() {

        assertThatThrownBy(() -> {
            validatingInputs.employeeIdInput("ddddd");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("The ID needs to be in the format of 2 letters - 4 numbers.");
    }

    @Test
    public void validIDPattern() {

        assertThat(validatingInputs.employeeIdInput("AA-1234")).matches("\\D\\D" + "-" + "\\d\\d\\d\\d");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidIDPattern() {

        assertThat(validatingInputs.employeeIdInput("12-CCCC")).doesNotMatch("\\D\\D" + "-" + "\\d\\d\\d\\d");
    }

    @Test
    public void validZip() {

        assertThat(validatingInputs.zipInput("12345")).containsOnlyDigits();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidZip() {

        assertThat(validatingInputs.zipInput("999")).containsOnlyDigits();
    }

    @Test
    public void invalidZipException() {

        assertThatThrownBy(() -> {
            validatingInputs.zipInput("dddd");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("The zipcode needs to be 5 numbers in length.");
    }

    @Test
    public void validateInputFunction() {

        assertThat(validatingInputs.validateInput("Jemma", "Millman", "JM-1389", "90210"))
                .isEqualTo("Jemma Millman JM-1389 90210");
    }
}