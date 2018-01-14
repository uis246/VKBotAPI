package API.multiuser;

import java.util.LinkedHashMap;

public class ServiceManager {
	// 
	private static LinkedHashMap<Object, ProfileManager> m=new LinkedHashMap<Object, ProfileManager>();
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
