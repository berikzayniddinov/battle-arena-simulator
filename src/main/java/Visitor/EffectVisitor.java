package Visitor;
import Game.Character;

public class EffectVisitor implements Visitor{
    @Override
    public void visit(Character character) {
        System.out.println("Applying effects to character......");
    }
}
