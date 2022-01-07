package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    public String setName(String name){
        return this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
