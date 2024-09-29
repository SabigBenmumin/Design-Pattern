public class Gu {
    public static void main(String[] args) {
        Character seng = new BasicCharacter();
        seng = new Weapon(seng);
        seng = new Armor(seng);
        seng = new MagicRing(seng);
        System.out.println("Attack: " +seng.getAttack());
        System.out.println("Defense: " + seng.getDefense());
        System.out.println("Speed: " + seng.getSpeed());
        System.out.println("Health: " + seng.getHealth());
    }
}
