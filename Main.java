import BonusMilesService.BonusMilesService;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusmiles = service.calculate(10_000);
        System.out.println("У Вас " + bonusmiles + " бонусных миль");
    }
}