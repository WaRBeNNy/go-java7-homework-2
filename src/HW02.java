/*Сергей Гусельников
Создать консольное приложение, которое просит пользователя ввести из консоли 5 чисел
Все числа должны быть записаны в массив целых чисел.

После этого, массив должен быть отсортирован по возрастанию и выведен консоль.
Сначала начальная версия, далее - отсортированная.

Пример:

Enter number 1:
5
Enter number 2:
4
Enter number 3:
3
Enter number 4:
2
Enter number 5:
1

Initial array: 5, 4, 3, 2, 1
Sorted array: 1, 2, 3, 4, 5.
 */
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        int nums[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<nums.length;i++) {
            System.out.println("Enter number " + (i+1) + ":");
            nums[i] = sc.nextInt();
        }

        System.out.print("Initial array: ");
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();

        for(int i=(nums.length - 1); i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}
