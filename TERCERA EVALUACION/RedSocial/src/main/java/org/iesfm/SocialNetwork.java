package org.iesfm;

import java.util.*;

public class SocialNetwork implements ISocialNetwork{
    private String name;
    private Map<String, User> users;
    private List<String> trendingTopics;

    public SocialNetwork(String name, Map<String, User> users, List<String> trendingTopics) {
        this.name = name;
        this.users = users;
        this.trendingTopics = trendingTopics;
    }

    @Override
    public User createUser(String username) {
        User user = new User(username, new TreeSet<>());

        users.put(username,user);
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public List<String> getTrendingTopics() {
        return trendingTopics;
    }

    public void setTrendingTopics(List<String> trendingTopics) {
        this.trendingTopics = trendingTopics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialNetwork that = (SocialNetwork) o;
        return Objects.equals(name, that.name) && Objects.equals(users, that.users) && Objects.equals(trendingTopics, that.trendingTopics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users, trendingTopics);
    }
}
