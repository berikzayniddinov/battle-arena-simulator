package State;
import Game.Character;

public class DefeatedState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println("Game.Character is defeated and cannot attack!");
    }
}