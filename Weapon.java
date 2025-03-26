public enum Weapon {
    BATON("1d4+FOR", 1, "tranchant"),
    DAGUE("1d4+FOR", 1, "perforant"),
    BATON_FERRE("1d6+FOR", 1, "contondant"),
    EPEE_COURTE("1d6+FOR", 1, "tranchant"),
    HACHE("1d8+FOR", 1, "tranchant"),
    EPEE_LONGUE("1d8+FOR" ,1, "tranchant"),
    HACHE_A_DEUX_MAINS("2d6+FOR" ,1, "tranchant"),
    EPEE_A_DEUX_MAINS("2d6+FOR", 1, "tranchant"),
    VIVELAME("1d10+FOR", 1, "tranchant"),
    ARC_COURT("1d6", 30, "perforant"),
    ARC_LONG("1d8", 50, "perforant"),
    JAVELOT("1d6", 10, "perforant"),;
    

    private final String damageFormula;
    private final int range;
    private final String typeOfDamage;

    Weapon(String damageFormula, int range, String typeOfDamage) {
        this.damageFormula = damageFormula;
        this.range = range;
        this.typeOfDamage = typeOfDamage;
    }

    public String getDamageFormula() {
        return damageFormula;
    }

    public int getRange() {
        return range;
    }

    public String getTypeOfDamage() {
        return typeOfDamage;
    }
}
