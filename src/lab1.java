import java.util.Random;
public class lab1 {
    public static void main(String[] args) {
        System.out.println("--- Исходный массив ---");
        int[] numbers = new int[20];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(50);
            System.out.println(numbers[i]);
        }
        System.out.println("--- Отсортируем массив ---");
        int var;
        boolean isChanged = true;
        int iteration = 0;
        while(isChanged == true){
            isChanged = false;
            iteration++;
            for(int i = 0; i < numbers.length + 1; i++){
                if (i == numbers.length - 1)
                    break;
                if (numbers[i] > numbers[i + 1]){
                    var = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = var;
                    isChanged = true;
                }
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Потребовалось " + iteration + " проходов.");
    }
}

