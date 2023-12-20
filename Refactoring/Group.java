public class Group {
    public List getUsersSortedByMost RecentlyRegistered () {
    List users = new ArrayList();
    if (!userDirectoryExists())
        return users;
    addFoundUsers To (users);
    sortByMost RecentlyRegistered (users);
    return users;
    }
}