package com.hypeirochus.scmc.command;

import com.hypeirochus.scmc.handlers.TeleporterHandler;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.DimensionManager;

public class CommandDimension extends CommandBase {

	/**
	 * Gets the name of the command
	 */
	public String getName() {
		return "dimension";
	}

	/**
	 * Return the required permission level for this command.
	 */
	public int getRequiredPermissionLevel() {
		return 2;
	}

	/**
	 * Gets the usage string for the command.
	 */
	public String getUsage(ICommandSender sender) {
		return "commands.dimension.usage";
	}

	/**
	 * Callback for when the command is executed
	 */
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if (args.length < 1) {
			throw new WrongUsageException("commands.dimension.usage", new Object[0]);
		} else {
			EntityPlayer player = args.length > 1 ? getPlayer(server, sender, args[1]) : getCommandSenderAsPlayer(sender);

			int dimId = parseInt(args[0]);
			Integer[] maxIds = DimensionManager.getIDs();

			for (int i = 0; i < maxIds.length; i++) {
				if (dimId == maxIds[i]) {
					if (player.dimension != dimId) {
						EntityPlayerMP playerMp = (EntityPlayerMP) player;
						playerMp.getServer().getPlayerList().transferPlayerToDimension(playerMp, dimId, new TeleporterHandler(playerMp.getServerWorld().provider.getDimension(), playerMp.mcServer.worldServerForDimension(dimId), player.posX, playerMp.getServerWorld().getHeight((int) player.posX, (int) player.posZ), player.posZ, dimId == 9, false));
						notifyCommandListener(sender, this, "commands.dimension.success", new Object[] { player.getName(), dimId });
					} else {
						throw new CommandException("commands.dimension.same_dim", new Object[] { player.getName(), dimId });
					}
					return;
				}
			}
			throw new CommandException("commands.dimension.out_of_range", new Object[] { dimId });
		}
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return index == 1;
	}
}