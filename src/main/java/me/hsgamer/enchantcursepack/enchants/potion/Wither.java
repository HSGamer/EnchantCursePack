package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.potion.PotionEffectType;
import studio.magemonkey.fabled.enchants.api.ItemSet;

public class Wither extends PotionCurse {

    public Wither() {
        super("Curse Of Wither", "Cause Wither while wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.WITHER;
    }
}
