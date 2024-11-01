package State;
import Game.Character;

public class NormalState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println("Game.Character attacks with normal power!");
        character.fight();
    }
}