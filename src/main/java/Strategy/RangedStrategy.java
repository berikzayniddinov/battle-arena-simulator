package Strategy;

class RangedStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Game.Character uses ranged attacks!");
    }
}