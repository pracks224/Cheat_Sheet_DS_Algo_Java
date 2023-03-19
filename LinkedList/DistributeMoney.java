package LinkedList;

public class DistributeMoney {
    public static void main(String[] args) {
       System.out.println(distributeMoney(20,3));
    }
    public static int distributeMoney(int money, int children) {
        if (money < children || 8 * children < money) {
            return -1;
        }
        if(money/children == 8) return children;
        int remain = money - children;
        int count_exact = remain / 5;
        remain -= count_exact * 5;
        int count_2dollar = Math.min(remain, children - count_exact);
        count_exact += (remain - count_2dollar) / 3;
        if (remain == 2 && count_2dollar == children - count_exact) {
            count_2dollar--;
            count_exact += 2;
        }
        return count_exact;
    }
}
