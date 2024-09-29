public class Boots extends CharacterDecorator{
    public Boots(Character baseCharacter){
        super(baseCharacter);
    }
    
    @Override
    public int getSpeed(){
        return baseCharacter.getSpeed() + 5;
    }
}
