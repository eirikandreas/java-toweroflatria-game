public class Weapon extends Item {
   public int dmg;

    public Weapon(String name, String desc, int dmg) {
        super(name, desc);
        this.dmg = dmg;
    }

    int getDmg() {
        return dmg;
    }

    void setDmg(int dmg) {
        this.dmg = dmg;
    }
}