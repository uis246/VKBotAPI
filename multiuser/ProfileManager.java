package API.multiuser;

public interface ProfileManager {
public IUserProfile getProfile(Object id);
public void addProfile(Object id, IUserProfile profile);
public boolean isExist(Object id);
}
