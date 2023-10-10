package com.example.cn1403;

public class DataModel {
    String name;
    String type;
    String url_image;


    public DataModel(String name, String type, String version_number, String feature ) {
        this.name=name;
        this.type=type;
        this.url_image=feature;


    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public String getFeature() {
        return url_image;
    }
}
