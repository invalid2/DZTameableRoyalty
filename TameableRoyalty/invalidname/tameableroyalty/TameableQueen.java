package invalidname.tameableroyalty;

import OreSpawn.OreSpawnMain;
import OreSpawn.entities.TheQueen;
import dangerzone.World;

/**
 * @author InvalidName
 *
 */
public class TameableQueen extends TheQueen {

	/**
	 * @param w
	 */
	public TameableQueen(World w) {
		super(w);
		this.enableTaming(32);
	}
	

	@Override
	public boolean isFoodItem(int foodid)
	{
		if(foodid == OreSpawnMain.queenscale.itemID)return true;
		return false;
	}
}
