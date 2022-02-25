package me.luucx7.ctf_reborn.model.classes;

import me.luucx7.ctf_reborn.api.classes.IClass;
import me.luucx7.ctf_reborn.api.player.IPlayerData;
import org.bukkit.entity.Player;

public abstract class AbstractClass implements IClass {

    public AbstractClass() {

    }

    @Override
    public abstract String getName();

    @Override
    public abstract void resetPlayerStats(IPlayerData player);
}
