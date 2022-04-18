public class Combat {
    //d6 for combat
    private final static int max = 6;
    private final static int min = 1;
    private final static int range = max - min + 1;

    public static Creature resolveCombat(Creature att, Creature def) {

        int attDamage;
        int defDamage;

        while (true) {

            attDamage = (int) ((Math.random() * range) + min) + att.getStrength();
            System.out.println(att + " attacks " + def + " for " + attDamage + " damage.");
            def.setHealth(def.getHealth() - attDamage);

            if (def.getHealth() <= 0) {
                System.out.println(att + " is winner.");
                return att;
            }

            defDamage = (int) ((Math.random() * range) + min) + def.getStrength();
            System.out.println(def + " attacks " + att + " for " + defDamage + " damage.");
            att.setHealth(att.getHealth() - defDamage);

            if (att.getHealth() <= 0) {
                System.out.println(def + " is winner.");
                return def;
            }

            System.out.println(att + " health: " + att.getHealth() + "\n" + def + " health: " + def.getHealth());
        }
    }
}
