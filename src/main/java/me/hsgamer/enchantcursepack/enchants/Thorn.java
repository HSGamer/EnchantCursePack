package me.hsgamer.enchantcursepack.enchants;

import com.sucy.enchant.api.CustomEnchantment;
import com.sucy.enchant.api.ItemSet;
import mc.promcteam.engine.mccore.util.Protection;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Thorn extends CustomEnchantment {
    private static final String PERCENTAGE = "percentage";

    public Thorn() {
        super("Curse Of Thorn", "Cause damage when fighting");

        setMaxLevel(1, 1);
        setWeight(2);
        settings.set(PERCENTAGE, 0.2, -0.1);

        addNaturalItems(ItemSet.SWORDS.getItems());
    }

    @Override
    public void applyOnHit(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
        if (!Protection.isAlly(user, target)) return;
        user.damage(event.getDamage() * settings.get(PERCENTAGE, level), target);
    }
}
