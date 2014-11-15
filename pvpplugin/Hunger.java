
package pvpplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Hunger implements Listener  {
    
    @EventHandler
    public void hungerFreeze (FoodLevelChangeEvent e) {
        
        e.setFoodLevel(19);
        e.setCancelled(true);
    }
            

}
