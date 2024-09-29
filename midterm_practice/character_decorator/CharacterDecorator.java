public class CharacterDecorator implements Character{
    public Character baseCharacter;

    public CharacterDecorator(Character baseCharacter){
        this.baseCharacter = baseCharacter;
    }

    @Override
    public int getAttack(){
        return baseCharacter.getAttack();
    }
    @Override
    public int getDefense(){
        return baseCharacter.getDefense();
    }
    @Override
    public int getHealth(){
        return baseCharacter.getHealth();
    }
    @Override
    public int getSpeed(){
        return baseCharacter.getSpeed();
    }
}
