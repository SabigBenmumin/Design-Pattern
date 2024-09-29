public class MagicRing extends CharacterDecorator{
    public MagicRing(Character baseCharacter){
        super(baseCharacter);
    }
    @Override
    public int getHealth(){
        return baseCharacter.getHealth() + 50;
    }
}
