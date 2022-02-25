package me.luucx7.ctf_reborn.listeners;

import me.luucx7.ctf_reborn.api.player.IPlayerData;
import me.luucx7.ctf_reborn.managers.PlayerDataManager;
import me.luucx7.ctf_reborn.model.classes.impl.WarriorClass;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class GeneralListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent ev) {
        IPlayerData data = PlayerDataManager.loadPlayerData(ev.getPlayer().getUniqueId());

        if (!(ev.getPlayer().getName() == "Luucx7")) return;

        WarriorClass warriorClass = new WarriorClass();

        data.setClass(warriorClass);
    }
}
