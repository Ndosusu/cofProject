public enum Bestiaire {
    ENEMY1(new Enemy("Bandit de base", 1, 9, 12, 10, 1, 1, 1, 0, 0, 0, -1)),;

    private final Enemy enemy;

    Bestiaire(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
