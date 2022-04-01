package invalidname.tameableroyalty;

import OreSpawn.OreSpawnMain;
import OreSpawn.entities.TheKing;
import dangerzone.World;

/**
 * @author InvalidName
 * King that can be tamed
 */
public class TameableKing extends TheKing
{

	/**
	 * @param w World
	 */
	public TameableKing(World w)
	{
		super(w);
		this.enableTaming(32);
	}
	
	@Override
	public boolean isFoodItem(int foodid)
	{
		if(foodid == OreSpawnMain.royalsword.itemID || foodid == OreSpawnMain.royalboots.itemID
				|| foodid == OreSpawnMain.royalleggings.itemID || foodid == OreSpawnMain.royalchestplate.itemID
				|| foodid == OreSpawnMain.royalhelmet.itemID)
			return true;
		return false;
	}
}
