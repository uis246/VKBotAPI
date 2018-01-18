package API.multiuser;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class ServiceManager implements Serializable{
	private static final long serialVersionUID = 3899571378997485887L;
	// 
	public static LinkedHashMap<Object, ProfileManager> m=null;
public static void addProfileManager(Object key, ProfileManager manager){
	m.put(key, manager);
}
public static ProfileManager getProfileManager(Object key){
	return m.get(key);
}
public static ProfileManager removeProfileManager(Object key){
	return m.remove(key);
}
}
