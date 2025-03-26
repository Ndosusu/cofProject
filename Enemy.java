public final class Enemy extends Entity {

    public Enemy(String name, int level, int health, int def, int ini, int agi, int con, int force, int per, int cha, int intel, int vol) {
        super(name, level, health, def, ini, agi, con, force, per, cha, intel, vol);
    }

    public int getAttaqueContact() {
        return force + level;
    }

    public int getAttaqueDistance() {
        return agi + level;
    }

    public int getAttaqueMagique() {
        return intel + level;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", def=" + def +
                ", ini=" + ini +
                ", agi=" + agi +
                ", con=" + con +
                ", force=" + force +
                ", per=" + per +
                ", cha=" + cha +
                ", intel=" + intel +
                ", vol=" + vol +
                ", level=" + level +
                ", attaqueContact=" + getAttaqueContact() +
                ", attaqueDistance=" + getAttaqueDistance() +
                ", attaqueMagique=" + getAttaqueMagique() +
                '}';
    }
}
