package Template;
import Game.Character;

public abstract class GameAction {

    public final void executeAction(Character character) {
        prepare();
        performAction(character);
        finalizeAction();
    }

    protected abstract void performAction(Character character);


    private void prepare() {
        System.out.println("Preparing for action...");
    }


    private void finalizeAction() {
        System.out.println("Action completed!");
    }
}
