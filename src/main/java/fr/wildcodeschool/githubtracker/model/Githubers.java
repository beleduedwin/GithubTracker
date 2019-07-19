package fr.wildcodeschool.githubtracker.model;

public class Githubers {

    //..... Propiété des Githubers
    private String name;
    private String email;
    private String login;
    private String id;
    private String avatarUrl;

    //.... Constructeur
    public Githubers(String name, String email, String login, String id, String avatarUrl) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.id = id;
        this.avatarUrl = avatarUrl;
    }

    //......Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getId() {
        return id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

}

