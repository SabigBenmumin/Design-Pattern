public class Shield extends CharacterDecorator{
    public Shield(Character baseCharacter){
        super(baseCharacter);
    }
    @Override
    public int getDefense(){
        return baseCharacter.getDefense() + 15;
    }
    @Override
    public int getAttack(){
        return baseCharacter.getAttack() - 5;
    }
}
