import java.util.*;
public class IterateListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Simple for loop:");
        for (int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
        System.out.println("\nEnhanced for loop:");
        for (Integer x: list) System.out.print(x+" ");
        System.out.println("\nWhile loop with Iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) System.out.print(it.next()+" ");
    }
}
