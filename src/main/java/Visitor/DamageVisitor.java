package Visitor;
import Game.Character;
public class DamageVisitor implements Visitor{
    @Override
    public void visit(Character character) {
        System.out.println("Decreasing character's health with damage!");
    }
}
