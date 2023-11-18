import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello world!");
        arrayList.add(123456789);
        for (Object i : arrayList) {
            System.out.println(i);
        }
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6};
        // String[] stringArray=new String[]{"Aigerim","Bazarbekova"};
        method(array);
        // method(stringArray);

    }

    public static <T> void method(T[] array) {
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
        System.out.println("Массивдин баардык элементтери");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        List<String> list = new ArrayList<>(Arrays.asList("Aigerim", "Bazarbekova"));
        method1(list);
    }

    public static void method1(List<?> list) {//wildcard-чектоо, белгисиз элемент
        System.out.println(list.size());
    }


}