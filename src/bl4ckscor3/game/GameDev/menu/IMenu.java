package bl4ckscor3.game.gamedev.menu;

import java.awt.Graphics;

public interface IMenu
{
	/**
	 * Showing the menu in all its glory
	 * @param g The Graphics to draw with
	 */
	public void show(Graphics g);
	
	/**
	 * Determines the action when pressing enter in the menu
	 * @throws Any exception which might get thrown from any implementing methods
	 */
	public void onEnter() throws Exception;

	/**
	 * Determines the state this menu is defined as
	 */
	public GameState getDefinedState();
}
