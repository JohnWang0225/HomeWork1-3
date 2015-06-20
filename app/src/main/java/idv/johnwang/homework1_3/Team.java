package idv.johnwang.homework1_3;

public class Team {
    private String name;
    private int logo;
    
    public Team() {}

    public Team(int logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLogo() {
        return logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
