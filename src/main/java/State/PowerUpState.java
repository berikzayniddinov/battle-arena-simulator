package State;
import Game.Character;

public class PowerUpState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println("Game.Character attacks with increased power!");
        character.fight();

    }
}
//package State;
//
//public class PoweredUpState implements CharacterState {
//    @Override
//    public void attack(Game.Character character) {
//        System.out.println("Game.Character attacks with increased power!");
//        character.fight();
//    }
//}