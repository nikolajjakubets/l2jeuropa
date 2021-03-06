package lineage2.gameserver.listener.actor.player;

import lineage2.gameserver.listener.PlayerListener;
import lineage2.gameserver.model.GameObject;
import lineage2.gameserver.model.Player;
import lineage2.gameserver.network.clientpackets.RequestActionUse.Action;

/**
 * Listener for social actions performed by player
 * 
 * @author Yorie
 */
public interface OnSocialActionListener extends PlayerListener
{
	public void onSocialAction(Player player, GameObject target, Action action);
}