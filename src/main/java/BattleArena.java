import Game.Character;
import State.PowerUpState;
import Strategy.MagicStrategy;
import Template.AttackAction;
import Template.GameAction;
import Visitor.BoostVisitor;
import Visitor.Visitor;


public class BattleArena {
    public static void main(String[] args) {
        Character character = new Character();

        character.attack();

        character.setState(new PowerUpState());
        character.attack();

        character.setStrategy(new MagicStrategy());
        character.attack();

        GameAction attackAction = new AttackAction();
        attackAction.executeAction(character);

        Visitor boostVisitor = new BoostVisitor();
        character.accept(boostVisitor);
    }
}