package me.dio.netflixremake.model;

public class Movie {
        private int id;
        private String coverUrl;
        private String title;
        private String desc;
        private String cast;


    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getCast() {
        return cast;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCoverUrl() {

        return coverUrl;
    }

    public void setCoverUrl(String coverUrl)
    {

        this.coverUrl = coverUrl;
    }


}
