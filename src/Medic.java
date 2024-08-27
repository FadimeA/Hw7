public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public void  increaseExperience() {
        healPoints+=healPoints * 0.10;
    }


    public void applySuperAbility() {
        System.out.println("Medic применил способность " + getSuperAbilityType());
    }



    public int getHealPoints() {
        return healPoints;
    }
}
