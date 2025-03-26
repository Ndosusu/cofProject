public enum Peuple {
    HUMAIN(0, 0, 0,0,0,0,0),
    ELFE_SYLVAIN(0, 0, 1,-1,0,0,0),
    ELFE_HAUT(0, 1, 0,-1,0,0,1),
    NAIN(1, 0, -1,0,0,0,0),
    DEMI_ORC(0, 0, 0,1,0,0,-1),
    GNOME(0, 0, 0,-1,0,0,1),
    DEMI_ELFE(-1, 0, 0,0,1,0,0),
    HALFELIN(0, 1, 0,-1,0,0,0);

    private final int conBonus;
    private final int volBonus;
    private final int agiBONUS;
    private final int forBONUS;
    private final int perBONUS;
    private final int chaBONUS;
    private final int intelBONUS;

    Peuple(int conBonus, int volBonus, int agiBONUS, int forBONUS, int perBONUS, int chaBONUS, int intelBONUS) {
        this.conBonus = conBonus;
        this.volBonus = volBonus;
        this.agiBONUS = agiBONUS;
        this.forBONUS = forBONUS;
        this.perBONUS = perBONUS;
        this.chaBONUS = chaBONUS;
        this.intelBONUS = intelBONUS;
    }

    public int getConBONUS() {
        return conBonus;
    }

    public int getVolBONUS() {
        return volBonus;
    }

    public int getForBONUS() {
        return forBONUS;
    }

    public int getPerBONUS() {
        return perBONUS;
    }

    public int getChaBONUS() {
        return chaBONUS;
    }

    public int getIntelBONUS() {
        return intelBONUS;
    }

    public int getAgiBONUS() {
        return agiBONUS;
    }
}
