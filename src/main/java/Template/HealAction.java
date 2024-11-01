package Template;
import Game.Character;
class HealAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        character.heal();
    }
}
