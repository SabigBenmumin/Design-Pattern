public class Armor extends CharacterDecorator{
    public Armor(Character baseCharacter){
        super(baseCharacter);
    }
    @Override
    public int getDefense(){
        return baseCharacter.getDefense() + 10;
    }
}
