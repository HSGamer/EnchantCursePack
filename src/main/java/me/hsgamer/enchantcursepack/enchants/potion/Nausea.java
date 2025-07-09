package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Nausea extends PotionCurse {
    public Nausea() {
        super("Curse Of Nausea", "Cause Nausea while wearing");

        addNaturalItems(ItemSet.HELMETS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.CONFUSION;
    }
}
