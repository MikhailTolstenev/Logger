

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int size;
        int upperLimit;
        List<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Здравсвуйте, запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        size = in.nextInt();
        System.out.println("Введите верхнюю границу:");
        upperLimit = in.nextInt();
        Random random = new Random(); // создаем объект класса Random

        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(upperLimit));
        }
        logger.log("Создаеи и наполняем список");
        System.out.println("Ваш список: " + nums);
        int treshold;
        logger.log("Просим пользователь ввести границу сортировки ");
        System.out.println("Введите границу сортировки");
        treshold = in.nextInt();
        Filter filter = new Filter(treshold);
        filter.filterOut(nums);
        logger.log("Завершение программы ");


    }
}