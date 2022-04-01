package invalidname.tameableroyalty;

import dangerzone.BaseMod;
import dangerzone.DangerZone;
import dangerzone.entities.Entities;
import dangerzone.entities.Entities.ElistInfo;

/**
 * @author InvalidName
 * Makes the royals tameable, that's it.
 */
public class TameableRoyaltyMain extends BaseMod
{
	/**
	 * 
	 */
	public TameableRoyaltyMain()
	{}
	
	public String getModName()
	{
		return "Tameable Royalty";
	}
	
	public String versionBuiltWith()
	{
		return DangerZone.versionstring;
	}
	
	public void registerThings()
	{}
	
	public void postLoadProcessing()
	{
		DangerZone.all_the_mods.forEach((entry) ->
		{
			if(entry.modname.contains("OreSpawn"))
			{
				Entities.entity_list_lock.lock();
				for (int i = 0; i < Entities.entities.size(); i++)
				{
					ElistInfo info = Entities.entities.get(i);
					switch(info.uniquename)
					{
						case "OreSpawn:TheKing":
							info.entclass = TameableKing.class;
							Entities.entities.set(i, info);
							continue;
						case "OreSpawn:TheQueen":
							info.entclass = TameableQueen.class;
							Entities.entities.set(i, info);
							continue;
						case "OreSpawn:Dargon":
							info.entclass = TameableDargon.class;
							Entities.entities.set(i, info);
							continue;
					}
				}
				Entities.entity_list_lock.unlock();
			}
		});
	}
}
