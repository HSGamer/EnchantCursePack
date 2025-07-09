package me.hsgamer.enchantcursepack;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import studio.magemonkey.fabled.api.CombatProtection;

public interface AllyCheck {
    static boolean isAlly(LivingEntity user, LivingEntity target) {
        if (Bukkit.getPluginManager().isPluginEnabled("Fabled")) {
            return !CombatProtection.canAttack(user, target);
        }
        return false;
    }
}
