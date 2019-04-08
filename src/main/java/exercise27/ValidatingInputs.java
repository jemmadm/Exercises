package exercise27;

public class ValidatingInputs {

    private String nameInput(String name){
        if (name.length() < 2) {
            throw new IllegalArgumentException("This is not a valid name. Minimum 2 characters needed.");
        }
        return name;
    }

    public String firstNameInput(String firstName) {
        return nameInput(firstName);
    }

    public String lastNameInput(String lastName) {
        return nameInput(lastName);
    }

    private String patternInput(String input, String pattern, String exceptionMessage) {
        if (!input.isEmpty())
            if (!input.matches(pattern)){
            throw new IllegalArgumentException(exceptionMessage);
        }
        return input;
    }

    public String employeeIdInput(String employeeID){
            return patternInput(employeeID,"\\D{2}" + "-" + "\\d{4}",
                    "The ID needs to be in the format of 2 letters - 4 numbers.");
    }

    public String zipInput(String zip){
        return patternInput(zip, "\\d{5}",
                "The zipcode needs to be 5 numbers in length.");
    }

    public String validateInput(String firstName, String lastName, String employeeID, String zip) {
        return firstNameInput(firstName) + " " + lastNameInput(lastName)
                + " " + employeeIdInput(employeeID) + " " + zipInput(zip);
    }
}