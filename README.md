QA Auto Тестовое задание (Trainee)
    
  Ответы на задание по теме "Алгоритмы - базовая теория"

    Задания выполнены на языке Java
 
  1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     
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

  2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

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

  3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

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
    
  4. Дана скобочная последовательность: [((())()(())]]
  - Можно ли считать эту последовательность правильной?
  - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

  Ответ НЕТ, т.к. Правильная скобочная последовательность (ПСП) - обеспечивает последовательную вложенность подпоследовательностей, обрамлённых открытой и закрытой скобкой одного типа. В данном примере имеется ["("(())()(())]] одна "открывающая" круглая скобка без пары "закрывающей" скобки и второе [((())()(())"]"] у "закрывающей" квадратной скобки нет в паре "открывающей" скобки. 
  Данную скобочную последовательность можно изменить чтоб она соответсвовала двумя способами:
  1 вариант [((())()(())")"] 
  2 вариант ["["(())()(())]]   
