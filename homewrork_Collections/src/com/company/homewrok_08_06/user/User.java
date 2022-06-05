package com.company.homewrok_08_06.user;


//У вас в программе создается User (User {String firstName, String lastName, int age,email}).
// При этом, в конструктор приходит строка вида “John;Lennon;40;lennon@mail.com”
// Система должна либо создавать объект, либо формировать Exception.
// При этом, должна быть возможность получить все ошибки, которые привели к не созданию объекта.
//Например:
//
//Некорректный формат строки. В строке не хватает данных
//Поле не задано (пустое)
//email имеет неправильный формат: короче 4 символов или не содержит символ @.
//Поле возраст некорректно
//В строке больше полей, чем необходимо
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public User(String input) {
        String[] arr = input.split(";");
        try {
            try {
                try {
                    try {
                        try {

                            validateSizeOfInputString(input);

                        } catch (InvalidSizeException e) {
                            System.out.println(e.getMessage());
                            return;
                        }
                        validateInputStringFormat(input);
                    } catch (MyIllegalFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    validateEmailFormat(input);

                } catch (InvalidEmailFormatException e) {
                    System.out.println(e.getMessage());
                }

                fieldIsNotEmpty(input);
            } catch (EmptyFieldException e) {
                System.out.println(e.getMessage());
            }

            validateAge(input);

            User user = new User(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]);

        } catch (InvalidAgeFieldException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean validateInputStringFormat(String input) throws MyIllegalFormatException {

        String[] arr = input.split(";");
        if (arr[0].matches("^[a-zA-Z]*$") && arr[1].matches("^[a-zA-Z]*$") &&
                arr[3].matches("^[a-zA-Z]*$")) {
            validateAge(input);
            return true;
        }

        throw new MyIllegalFormatException("Invalid format");
    }

    private boolean validateSizeOfInputString(String input) throws InvalidSizeException {
        if (input.split(";").length < 4) throw
                new InvalidSizeException("Not enough information to create an instance");
        if (input.split(";").length > 4) throw
                new InvalidSizeException("too many properties to create an instance");
        return true;
    }

    private boolean fieldIsNotEmpty(String input) throws EmptyFieldException {
        String[] arr = input.split(";");
        for (String s : arr) {
            if (s.equals("") || s.equals(" ")) {
                throw new EmptyFieldException("Fields must be not empty!");
            }

        }
        return true;
    }

    private boolean validateEmailFormat(String input) throws InvalidEmailFormatException {
        String[] arr = input.split(";");
        if (arr[arr.length - 1].length() < 4 || !arr[arr.length - 1].contains("@")) {
            throw new InvalidEmailFormatException("Invalid email!");
        }
        return true;
    }

    private boolean validateAge(String input) throws InvalidAgeFieldException {
        String[] arr = input.split(";");
        try {
            Integer.parseInt(arr[2]);
        } catch (NumberFormatException e) {
            throw new InvalidAgeFieldException("Age is invalid");
        }

        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
