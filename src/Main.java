public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heroes = {new Magic(20, 50, "Magic"),
                new Medic(15, 0, "Healing", 70),
                new Warrior(50, 70, "Critical Damage")};
        for (HavingSuperAbility hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Обновленные очки лечения медика: " + medic.getHealPoints());
            }

        }
    }
}