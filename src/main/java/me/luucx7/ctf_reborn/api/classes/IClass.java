package me.luucx7.ctf_reborn.api.classes;

import me.luucx7.ctf_reborn.api.player.IPlayerData;
import org.bukkit.entity.Player;

public interface IClass {

    String getName();

    void resetPlayerStats(IPlayerData player);
}
