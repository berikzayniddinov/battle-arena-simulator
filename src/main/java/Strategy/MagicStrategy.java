package Strategy;

public class MagicStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Game.Character uses magic attacks!");
    }
}