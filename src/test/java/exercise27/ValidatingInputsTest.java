package exercise27;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidatingInputsTest {

    private ValidatingInputs validatingInputs = new ValidatingInputs();

    @Test
    public void validFirstName() throws Exception {

        assertThat(validatingInputs.firstNameInput("Je")).isNotEmpty();
    }

    @Test (expected = Exception.class)
    public void invalidFirstName() throws Exception {

        assertThat(validatingInputs.firstNameInput("")).isNotEmpty();
    }

    @Test
    public void invalidFirstNameException() {
        assertThatThrownBy(() -> {
            validatingInputs.firstNameInput("");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("This is not a valid last name. Minimum 2 characters needed.");
    }

    @Test
    public void validLastName() throws Exception {

        assertThat(validatingInputs.lastNameInput("Millman")).isNotEmpty();
    }

    @Test(expected = Exception.class)
    public void invalidLastName() throws Exception {

        assertThat(validatingInputs.lastNameInput("").isEmpty());
    }

    @Test
    public void invalidLastNameException() {
        assertThatThrownBy(() -> {
            validatingInputs.lastNameInput("");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("This is not a valid last name. Minimum 2 characters needed.");
    }

    @Test
    public void emptyId() throws Exception {

        assertThat(validatingInputs.employeeIdInput("")).isEmpty();
    }

    @Test
    public void validIdSize() throws Exception {

        assertThat(validatingInputs.employeeIdInput("AA-1234")).hasSize(7);
    }

    @Test(expected = Exception.class)
    public void invalidIdSize() throws Exception {

        assertThat(validatingInputs.employeeIdInput("AA")).hasSize(7);
    }

    @Test
    public void invalidIdException() {
        assertThatThrownBy(() -> {
            validatingInputs.employeeIdInput("ddddd");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("The ID needs to be in the format of 2 letters - 4 numbers.");
    }

    @Test
    public void validIDPattern() throws Exception {

        assertThat(validatingInputs.employeeIdInput("AA-1234")).matches("\\D\\D" + "-" + "\\d\\d\\d\\d");
    }

    @Test(expected = Exception.class)
    public void invalidIDPattern() throws Exception {

        assertThat(validatingInputs.employeeIdInput("12-CCCC")).doesNotMatch("\\D\\D" + "-" + "\\d\\d\\d\\d");
    }

    @Test
    public void validZip() throws Exception {

        assertThat(validatingInputs.zipInput("12345")).containsOnlyDigits();
    }

    @Test(expected = Exception.class)
    public void invalidZip() throws Exception {

        assertThat(validatingInputs.zipInput("999")).containsOnlyDigits();
    }

    @Test
    public void invalidZipException() {
        assertThatThrownBy(() -> {
            validatingInputs.zipInput("dddd");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("The zipcode needs to be 5 numbers in length.");
    }

    @Test
    public void validateInputFunction() throws Exception {

        assertThat(validatingInputs.validateInput("Jemma", "Millman", "JM-1389", "90210"))
                .isEqualTo("Jemma Millman JM-1389 90210");
    }
}