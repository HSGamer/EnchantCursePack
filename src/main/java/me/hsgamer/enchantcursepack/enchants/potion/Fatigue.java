package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Fatigue extends PotionCurse {

    public Fatigue() {
        super("Curse Of Fatigue", "Cause Fatigue while using");

        addNaturalItems(ItemSet.SWORDS.getItems());
        addNaturalItems(ItemSet.TOOLS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.SLOW_DIGGING;
    }
}
