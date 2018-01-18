package API.multiuser;

import java.io.Serializable;
import java.util.HashMap;

public class VKProfileManager implements Serializable, ProfileManager{
	private static final long serialVersionUID = 1L;
	HashMap<Object, VKUserProfile> m=new HashMap<Object, VKUserProfile>();
	@Override
	public VKUserProfile getProfile(Object id) {
		return m.get(id);
	}

	@Override
	public void addProfile(Object id, IUserProfile profile){
		m.put(id, (VKUserProfile)profile);
	}

	@Override
	public boolean isExist(Object id) {
		return m.containsKey(id);
	}
}
