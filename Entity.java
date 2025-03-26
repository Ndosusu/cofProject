public class Entity {
    protected String name;
    protected int health;
    protected int def;
    protected int ini;
    protected int agi;
    protected int con;
    protected int force;
    protected int per;
    protected int cha;
    protected int intel;
    protected int vol;
    protected int level;

    public Entity(String name, int level, int health, int def, int ini, int agi, int con, int force, int per, int cha, int intel, int vol) {
        this.name = name;
        this.health = health;
        this.def = def;
        this.ini = ini;
        this.agi = agi;
        this.con = con;
        this.force = force;
        this.per = per;
        this.cha = cha;
        this.intel = intel;
        this.vol = vol;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

