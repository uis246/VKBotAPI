package API;

import java.util.HashMap;

public abstract class module{
	public abstract void onLoad();
	public abstract void enablePlugin();
//	public void exec(String[] arg, bash bash) {
//	}
//	public void exec(String[] arg, msh msh) {
//	}
	public abstract void disablePlugin();
	public HashMap<String,Command> commands=new HashMap<String,Command>();
	protected void registerCommand(String string, Command newInstance) {
		commands.put(string, newInstance);
	}
}
