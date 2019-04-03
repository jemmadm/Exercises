package exercise27;

public class ValidatingInputs {
    public String firstNameInput(String firstName) {
        if ( firstName.length() < 2) {
            System.out.println(firstName + " is not  a valid first name. It is too short");
        }
        return firstName;
    }

    public String lastNameInput(String lastName) {
        if (lastName.length() < 2) {
            System.out.println(lastName + " is not a valid last name. It is too short");
        }
        return lastName;
    }

    public String employeeIdInput(String employeeID) {
        if (!employeeID.isEmpty())
            if (!employeeID.matches("\\D\\D" + "-" + "\\d\\d\\d\\d")) {
                System.out.println(employeeID + " is not a valid employee ID");
            }
        return employeeID;
    }

    public String zipInput(String zip) {
        if (!zip.isEmpty())
            if (!zip.matches("\\d\\d\\d\\d\\d")) {
                System.out.println(zip + " is not a valid zip. It must be 5 digits");
            }
        return zip;
    }

    public String validateInput(){
        return firstNameInput("Jemma") + " " + lastNameInput("Millman") + " " + employeeIdInput("JM-1389") + " " + zipInput("90210");
    }
}