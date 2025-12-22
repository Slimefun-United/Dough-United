package io.github.bakedlibs.dough.protection.modules;

import io.github.bakedlibs.dough.protection.Interaction;
import io.github.bakedlibs.dough.protection.ProtectionModule;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import p1xel.nobuildplus.Flags;
import p1xel.nobuildplus.NoBuildPlus;
import p1xel.nobuildplus.Storage.Worlds;

public class NoBuildPlusProtectionModule implements ProtectionModule {

    private NoBuildPlus plugin;
    @Override
    public void load() {
        plugin = NoBuildPlus.getInstance();
    }

    @Override
    public NoBuildPlus getPlugin() {
        return plugin;
    }

    @Override
    public boolean hasPermission(OfflinePlayer p, Location l, Interaction action) {
        if (!p.isOnline()) {
            return false;
        }

        Player player = (Player) p;
        String world = l.getWorld().getName();
        if (player.hasPermission(Worlds.getPermission(world))) {
            return true;
        }

        switch (action) {
            case BREAK_BLOCK:
                return !plugin.getAPI().canExecute(world, Flags.destroy);
            case PLACE_BLOCK:
                return !plugin.getAPI().canExecute(world, Flags.build);
            case ATTACK_PLAYER:
                return !plugin.getAPI().canExecute(world, Flags.pvp);
            case ATTACK_ENTITY:
                return !plugin.getAPI().canExecute(world, Flags.mob_damage);
            case INTERACT_ENTITY:
            case INTERACT_BLOCK:
                return !plugin.getAPI().canExecute(world, Flags.use);
        }

        return true;
    }
}
