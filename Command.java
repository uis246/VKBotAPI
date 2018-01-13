package API;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.Message;

public interface Command {
	public void exec(String args) throws Exception;
	public void exec(String args, int peerId, Message message, VkApiClient vk, UserActor actor) throws Exception;
	public byte OPLevel();
}
