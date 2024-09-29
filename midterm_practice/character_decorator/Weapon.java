public class Weapon extends CharacterDecorator{

    public Weapon(Character baseCharacter){
        super(baseCharacter);
    }
    @Override
    public int getAttack(){
        return baseCharacter.getAttack() + 20;
    }
}
