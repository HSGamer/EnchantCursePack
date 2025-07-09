package me.hsgamer.enchantcursepack.enchants;

import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitTask;
import studio.magemonkey.fabled.enchants.api.CustomEnchantment;
import studio.magemonkey.fabled.enchants.api.ItemSet;
import studio.magemonkey.fabled.enchants.api.Tasks;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.UUID;

public class Fire extends CustomEnchantment {

    private static final Map<UUID, BukkitTask> tasks = new IdentityHashMap<>();
    private static final String FREQUENCY = "frequency";
    private static final String TICK = "fire-tick";

    public Fire() {
        super("Curse Of Fire", "Cause Burning while wearing");

        setMaxLevel(1, 1);
        setWeight(2);
        settings.set(FREQUENCY, 5, 0);
        settings.set(TICK, 10, 0);

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    @Override
    public void applyEquip(LivingEntity user, int level) {
        int frequency = (int) settings.get(FREQUENCY, level) * 20;
        int fireTick = (int) settings.get(TICK, level) * 20;
        tasks.put(user.getUniqueId(), Tasks.schedule(() -> user.setFireTicks(fireTick), frequency, frequency));
    }

    @Override
    public void applyUnequip(LivingEntity user, int level) {
        tasks.remove(user.getUniqueId()).cancel();
    }
}
