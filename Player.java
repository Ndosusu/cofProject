public final class Player extends Entity {
    private int xp;
    private String profile;
    private Weapon weapon;
    private Peuple peuple;

    public Player(String name, String profile, int xp, int level, int health, int def, int ini, int agi, int con, int force, int per, int cha, int intel, int vol, int attaqueContact, int attaqueDistance, int attaqueMagique, Weapon weapon, Peuple peuple) {
        super(name, level, health, def, ini, agi + peuple.getAgiBONUS(), con + peuple.getConBONUS(), force + peuple.getForBONUS(), per, cha, intel, vol + peuple.getVolBONUS());
        this.xp = xp;
        this.profile = profile;
        this.weapon = weapon;
        this.peuple = peuple;
    }

    public int getAttaqueContact() {
        return force + level;
    }

    public void setAttaqueContact(int attaqueContact) {
        this.force = attaqueContact + level;
    }

    public int getAttaqueDistance() {
        return agi + level;
    }

    public int getAttaqueMagique() {
        return intel + level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Peuple getPeuple() {
        return peuple;
    }

    public void setPeuple(Peuple peuple) {
        this.peuple = peuple;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
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
                ", attaqueContact=" + getAttaqueContact() +
                ", attaqueDistance=" + getAttaqueDistance() +
                ", attaqueMagique=" + getAttaqueMagique() +
                ", weapon=" + weapon +
                ", peuple=" + peuple +
                '}';
    }
}