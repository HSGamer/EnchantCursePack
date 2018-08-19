package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Slowness extends PotionCurse {
    public Slowness() {
        super("Curse Of Slowness", "Cause Slowness while wearing");

        addNaturalItems(ItemSet.BOOTS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.SLOW;
    }
}
