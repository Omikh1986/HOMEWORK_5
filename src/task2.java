//* Написать метод, который переведёт данное целое число в римский формат.


import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Map<Integer, String> conversion = new HashMap<>();
        conversion.put(1, "I");
        conversion.put(2, "II");
        conversion.put(3, "III");
        conversion.put(4, "IV");
        conversion.put(5, "V");
        conversion.put(6, "VI");
        conversion.put(7, "VII");
        conversion.put(8, "VIII");
        conversion.put(9, "IX");
        conversion.put(10, "X");
        conversion.put(20, "XX");
        conversion.put(30, "XXX");
        conversion.put(40, "XL");
        conversion.put(50, "L");
        conversion.put(60, "LX");
        conversion.put(70, "LXX");
        conversion.put(80, "LXXX");
        conversion.put(90, "XC");
        conversion.put(100, "C");
        conversion.put(200, "CC");
        conversion.put(300, "CCC");
        conversion.put(400, "CD");
        conversion.put(500, "D");
        conversion.put(600, "DC");
        conversion.put(700, "DCC");
        conversion.put(800, "DCCC");
        conversion.put(900, "CM");
        conversion.put(1000, "M");
        conversion.put(2000, "MM");
        conversion.put(3000, "MMM");
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для преобразования от 1 до 3999: ");
        Integer input = sc.nextInt();
        if (input > 0 && input < 4000) {
            List<Integer> list = new ArrayList<>();
            while (input > 0) {
                list.add(input % 10);
                input = input / 10;
            }
            int i = list.size() - 1;
            while (i >= 0) {
                int s = (int) Math.pow(10, i);
                int key = list.get(i) * s;
                if (key != 0) {
                    sb.append(conversion.get(key));
                }
                i--;
            }
            System.out.println(sb);
        } else {
            System.out.println("Введено число не соответсвующее условию");
        }
    }
}
