package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Poison extends PotionCurse {

    public Poison() {
        super("Curse Of Poisoning", "Cause Poison while wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.POISON;
    }

}
