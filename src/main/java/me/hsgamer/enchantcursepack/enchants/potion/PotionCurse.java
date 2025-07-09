package me.hsgamer.enchantcursepack.enchants.potion;

import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import studio.magemonkey.fabled.enchants.api.CustomEnchantment;

public abstract class PotionCurse extends CustomEnchantment implements PotionEnchantment {

    private static final String TIER = "tier";

    PotionCurse(String name, String description) {
        super(name, description);

        setWeight(2);
        setMaxLevel(1, 1);

        settings.set(TIER, 1, 1);
    }

    @Override
    public void applyEquip(LivingEntity user, int level) {
        final int tier = (int) settings.get(TIER, level);
        user.addPotionEffect(new PotionEffect(type(), Integer.MAX_VALUE, tier));
    }

    @Override
    public void applyUnequip(LivingEntity user, int level) {
        user.removePotionEffect(type());
    }
}
