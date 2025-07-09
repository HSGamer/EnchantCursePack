package me.hsgamer.enchantcursepack.enchants;

import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitTask;
import studio.magemonkey.fabled.enchants.api.CustomEnchantment;
import studio.magemonkey.fabled.enchants.api.ItemSet;
import studio.magemonkey.fabled.enchants.api.Tasks;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.UUID;

public class Spike extends CustomEnchantment {

    private static final Map<UUID, BukkitTask> tasks = new IdentityHashMap<>();
    private static final String FREQUENCY = "frequency";
    private static final String DAMAGE = "damage";

    public Spike() {
        super("Curse Of Spike", "Cause Damage while wearing");

        setMaxLevel(1, 1);
        setWeight(2);
        settings.set(FREQUENCY, 5, 0);
        settings.set(DAMAGE, 5, 0);

        addNaturalItems(ItemSet.SWORDS.getItems());
        addNaturalItems(ItemSet.ARMOR.getItems());
        addNaturalItems(ItemSet.BOWS.getItems());
    }

    @Override
    public void applyEquip(LivingEntity user, int level) {
        int frequency = (int) settings.get(FREQUENCY, level) * 20;
        double damage = settings.get(DAMAGE, level);
        tasks.put(user.getUniqueId(), Tasks.schedule(() -> user.damage(damage, user), frequency, frequency));
    }

    @Override
    public void applyUnequip(LivingEntity user, int level) {
        tasks.remove(user.getUniqueId()).cancel();
    }
}
