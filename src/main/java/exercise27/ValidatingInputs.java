package exercise27;

public class ValidatingInputs {

    private String nameInput(String name) throws Exception {
        if (name.length() < 2) {
            throw new Exception("This is not a valid last name. Minimum 2 characters needed.");
        }
        return name;
    }

    public String firstNameInput(String firstName) throws Exception {
        return nameInput(firstName);
    }

    public String lastNameInput(String lastName) throws Exception {
        return nameInput(lastName);
    }

    private String patternInput(String inputType, String pattern, String exceptionMessage) throws Exception {
        if (!inputType.isEmpty())
            if (!inputType.matches(pattern)){
            throw new Exception(exceptionMessage);
        }
        return inputType;
    }

    public String employeeIdInput(String employeeID) throws Exception{
            return patternInput(employeeID,"\\D{2}" + "-" + "\\d{4}",
                    "The ID needs to be in the format of 2 letters - 4 numbers.");
    }

    public String zipInput(String zip) throws Exception {
        return patternInput(zip, "\\d{5}",
                "The zipcode needs to be 5 numbers in length.");
    }

    public String validateInput(String firstName, String lastName, String employeeID, String zip) throws Exception{
        return firstNameInput(firstName) + " " + lastNameInput(lastName)
                + " " + employeeIdInput(employeeID) + " " + zipInput(zip);
    }
}