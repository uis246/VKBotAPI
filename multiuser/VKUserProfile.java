package API.multiuser;

import java.io.Serializable;

public class VKUserProfile implements Serializable, IUserProfile {
	private static final long serialVersionUID = 2306898330852769463L;
	private String nick="Ноунейм какой-та аш ваааще пи***ц";
	private byte OPLevel=-128;
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
