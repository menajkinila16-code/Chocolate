public class Main  {

    public static int maxChocolates(int money, int price, int wrap) {
        int chocolates = money / price;
        int wraps = chocolates;

        while (wraps >= wrap) {
            int newChocolates = wraps / wrap;
            chocolates += newChocolates;
            wraps = wraps % wrap + newChocolates;      
        }

        return chocolates;
    }

    public static void main(String[] args) {
        System.out.println(maxChocolates(15, 1, 3)); // 22
    }
}