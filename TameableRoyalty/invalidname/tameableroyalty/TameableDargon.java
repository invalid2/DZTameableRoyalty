package invalidname.tameableroyalty;

import OreSpawn.OreSpawnMain;
import OreSpawn.entities.Dargon;
import dangerzone.World;

/**
 * @author InvalidName
 *
 */
public class TameableDargon extends Dargon {

	/**
	 * @param w
	 */
	public TameableDargon(World w) {
		super(w);
		this.enableTaming(32);
	}
	
	@Override
	public boolean isFoodItem(int foodid)
	{
		if(foodid == OreSpawnMain.trophydargon.itemID)return true;
		return false;
	}
}
