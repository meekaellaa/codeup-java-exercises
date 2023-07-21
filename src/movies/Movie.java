package movies;
// and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
public class Movie {
//   private fields for name and category
    private String name;
    private String category;
//The constructor that sets both of the name and category
// The constructor will always be the same as the class
// The constructor has 2 parameters: name and category
// this keyword is used to refer to the current object of the movie class.
    public Movie(String name, String category){
        this.name = name;
        this.category = category;

    }

// Create Getters and Setters:
     public String getName(){
        return name;
     }
    public String setName(String name ){
        this.name = name;
        return name;
    }
     public String getCategory(){
        return category;
     }
    public String setCategory(String category){
        this.category = category;
        return category;
    }

}
