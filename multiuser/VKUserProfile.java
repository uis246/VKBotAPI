package API.multiuser;

public class VKUserProfile implements IUserProfile {
	private String nick="Ноунейм какой-та аш вааще пи***ц";
	private byte OPLevel=0;
	public VKUserProfile(String nick){
		if(nick!=null){
			this.nick=nick;
		}
	}
	@Override
	public byte getOPLevel() {
		return OPLevel;
	}
	@Override
	public void setOPLevel(byte level) {
		OPLevel=level;
	}
	@Override
	public String getNick() {
		return nick;
	}
	@Override
	public void setNick(String nick) {
		this.nick=nick;
	}
}
