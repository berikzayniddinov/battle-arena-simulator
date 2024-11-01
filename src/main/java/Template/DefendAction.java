package Template;
import Game.Character;

class DefendAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        character.defend();
    }
}
