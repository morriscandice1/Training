
public class modArrayListMain {
    public static void main(String[] args) {
        modArrayList listy = new modArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2)); //index at positive 2 is 20
        System.out.println(listy.getUsingMod(40)); //40 is divisible by 4 with a remainder of 0, index is 0
    }
}
