package me.hsgamer.enchantcursepack;

import me.hsgamer.enchantcursepack.enchants.Fire;
import me.hsgamer.enchantcursepack.enchants.Spike;
import me.hsgamer.enchantcursepack.enchants.Thorn;
import me.hsgamer.enchantcursepack.enchants.potion.*;
import org.bukkit.plugin.java.JavaPlugin;
import studio.magemonkey.fabled.enchants.api.EnchantPlugin;
import studio.magemonkey.fabled.enchants.api.EnchantmentRegistry;

public final class EnchantCursePack extends JavaPlugin implements EnchantPlugin {
    @Override
    public void registerEnchantments(EnchantmentRegistry enchantmentRegistry) {
        enchantmentRegistry.register(
                new Poison(),
                new Blindness(),
                new Weakness(),
                new Wither(),
                new Slowness(),
                new Spike(),
                new Fatigue(),
                new Nausea(),
                new Hunger(),
                new Thorn(),
                new Fire()
        );
    }
}
