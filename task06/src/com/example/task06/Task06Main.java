package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        // будет работать вне зависимости от глубины вызовов методов программы
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace(); // получаем стектрейс всех методов вызывавшихся при работе программы
        for (StackTraceElement element : stackTrace) { // сча будем перебирать и искать нужный
            if (!element.getMethodName().equals("printMethodName") &&
                    !element.getMethodName().equals("getStackTrace")) {
                System.out.print(element.getMethodName());
                break;
            }
        }
    }
}