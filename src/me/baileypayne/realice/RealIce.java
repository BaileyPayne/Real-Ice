
package me.baileypayne.realice;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Bailey
 */
public class RealIce extends JavaPlugin {
    
    
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }
    public static int randint(){
	
		double randNumber = Math.random();
		double d;
		d = randNumber * 100;

		int randomInt = (int)d+1;
		return randomInt;
	}
}
