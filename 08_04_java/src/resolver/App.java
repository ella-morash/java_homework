package resolver;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//Day-off Resolver
// написать программу, которая при вводе с клавиатуры дня недели отвечает
// на вопрос является ли этот день недели выходным. ( Для выходного выводит
// it is true, для рабочего  it is false
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week");
        String day = sc.next();

        getAnswer(day);

    }

    public static void getAnswer(String day) {
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Thursday":
            case "Friday":
                dayResolver(Days.MONDAY);
                break;
            case "Saturday":
            case "Sunday":
                dayResolver(Days.SATURDAY);
                break;
            default:
                System.out.println("There is so no such day in the week");
                break;
        }
    }

    public static void dayResolver(Days days) {
        switch (days) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("it is false");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("it is true");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + days);
        }
    }
}


