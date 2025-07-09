package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Blindness extends PotionCurse {

    public Blindness() {
        super("Curse Of Blindness", "Cause Blindness while wearing");

        addNaturalItems(ItemSet.HELMETS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.BLINDNESS;
    }
}
