package Strategy;

public class MeleeStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Game.Character uses melee attacks!");
    }
}