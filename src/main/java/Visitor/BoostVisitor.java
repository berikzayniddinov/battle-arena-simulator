package Visitor;
import Game.Character;

public class BoostVisitor implements Visitor{
    @Override
    public void visit(Character character) {
        System.out.println("Boosting character's power.....");
        character.boostPower();
    }
}
