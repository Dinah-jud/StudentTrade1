package za.ac.cput.domain;


import java.time.LocalDate;
import java.util.Date;

public class Listing {

    private int id ;
    private String title ;
    private String description ;
    private LocalDate datedPosted;

    private Listing(){

    }
    private  Listing(Builder builder){

        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.datedPosted = builder.datedPosted;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDatedPosted() {
        return datedPosted;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder{
        private int id ;
        private String title ;
        private String description ;
        private LocalDate datedPosted;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setDatedPosted(LocalDate datedPosted) {
            this.datedPosted = datedPosted;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public void copy(Builder builder){
            this.id = builder.id;
            this.title = builder.title;
            this.description = builder.description;
            this.datedPosted = builder.datedPosted;

        }

        public Listing build(){
            return new Listing(this);
        }
    }
}
