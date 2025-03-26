public class Guerrier {
    private String[] skills = {"Skill1", "Skill2", "Skill3", "Skill4", "Skill5"};

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void Skill1(Player player) {
        player.setAttaqueContact(player.getAttaqueContact() + 1);
    }

    public void Skill2(Player player) {
        
    }

    public void Skill3(Player player) {
        player.setDamage(player.getDamage() + 1);
    }
}
