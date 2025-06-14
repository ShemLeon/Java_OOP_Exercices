package Exercices_OOP._8_Interface.Ex14_1;

public enum EmployeeType {
    REGULAR("Emp regular"),
    UNION("Emp in Union"),
    TECHNICIAN("Emp Tech"),
    SUPERVISOR("Emp Super");

    private final String description;

    EmployeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

   }
