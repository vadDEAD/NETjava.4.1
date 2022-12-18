public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10000;
        int bonus = service.calculate(cost);
        System.out.println(bonus);
    }
}