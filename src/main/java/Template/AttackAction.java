package Template;
import Game.Character;


public class AttackAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        character.attack();
    }
}