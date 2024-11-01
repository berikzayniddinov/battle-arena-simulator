package Game;

import State.CharacterState;
import State.NormalState;
import Strategy.FightStrategy;
import Strategy.MeleeStrategy;
import Visitor.Visitor;

public class Character {
    private CharacterState state;
    private FightStrategy strategy;

    public Character() {
        // По умолчанию персонаж начинает с нормального состояния и рукопашной стратегии боя
        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
    }

    public void setState(CharacterState newState) {
        this.state = newState;
    }

    public void setStrategy(FightStrategy newStrategy) {
        this.strategy = newStrategy;
    }

    public void attack() {
        state.attack(this);
    }

    public void fight() {
        strategy.fight();
    }

    public void defend() {
        System.out.println("Character is defending!");
    }

    public void heal() {
        System.out.println("Character is healing!");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    public void boostPower() {
        System.out.println("Character power boosted!");
    }
}
