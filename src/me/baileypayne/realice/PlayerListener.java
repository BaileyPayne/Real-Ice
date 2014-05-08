
package me.baileypayne.realice;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 *
 * @author Bailey
 */
public class PlayerListener implements Listener {

    private RealIce plugin;

    public PlayerListener(RealIce aThis) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event){
        Player player = event.getPlayer();
        int Chance = RealIce.randint();
        Block block = player.getLocation().getBlock().getRelative(BlockFace.DOWN);
            if (block.getType() == Material.ICE){
                if (Chance >0 && Chance <=10){
                block.setType(Material.WATER);
                event.getPlayer().getWorld().playSound(event.getPlayer().getLocation(), Sound.GLASS, 1, 1);
            }
                
        }
        
    }
}
    

