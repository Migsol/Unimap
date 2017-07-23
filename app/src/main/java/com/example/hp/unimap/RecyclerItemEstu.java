package com.example.hp.unimap;

/**
 * Created by hp on 19/04/2017.
 */

public class RecyclerItemEstu {

    private String title;
    private String description;

    public RecyclerItemEstu(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
