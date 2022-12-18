public class BonusMilesService {
    public int calculate(int cost) {
        int percentInKopecks = 20;
        int bonus = cost / percentInKopecks;
        return bonus;
    }
}