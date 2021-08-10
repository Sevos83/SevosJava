package Sevos83;
import java.util.Scanner;

class Tasks{

    public void printHello(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число\n");
        while (!in.hasNextInt()) {
            System.out.println("Некорректный ввод. Повторите");
            in.next();
        }
        int checkNumber = in.nextInt();
        if(checkNumber>7){
            System.out.print("Привет\n");
        }
    }

    public void whatYourName(){
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите имя\n");
        String checkName = in.nextLine();
        String comparingName = "Вячеслав";
        if(checkName.equalsIgnoreCase(comparingName)){
            System.out.print("Привет, Вячеслав\n");
        }
        else {
            System.out.print("Нет такого имени\n");
        }
    }

    public void arrayCheck(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод чисел через пробел\n");
        String checkStr = in.nextLine();
        String strArr[] = checkStr.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].matches("[-+]?\\d+")){
                numArr[i] = Integer.parseInt(strArr[i]);
                if(numArr[i]%3==0){
                    System.out.println(numArr[i]);
                }
            }
        }
    }

    public void taskSelection(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод номера задачи: \n");
        while (!in.hasNextInt()) {
            System.out.println("Некорректный ввод. Повторите");
            in.next();
        }
        int taskNumber = in.nextInt();
        if(taskNumber==1){
            printHello();
        }
        else if(taskNumber==2){
            whatYourName();
        }
        else if(taskNumber==3){
            arrayCheck();
        }
        else if(taskNumber==0){
            System.exit(0);
        }
        else{
            System.out.print("Такой задачи не существует\n");
        }
        System.out.print("\n-------------------------------------------------------------- \n");
        taskSelection();

    }
}

class Trainee {
    public static void main(String[] args) {
        String tasksText = "1) Составить алгоритм: если введенное число больше 7, то вывести “Привет”\n" +
                "2) Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"\n" +
                "3) Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3\n" +
                "0) Завершить приложение \n";
        System.out.print(tasksText);
        Tasks tasks = new Tasks();
        tasks.taskSelection();
    }
}
