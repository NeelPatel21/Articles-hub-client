package com.neel.articleshubapi.restapi.beans;

/**
 * Created by Neel Patel on 24-07-2017.
 */

public class Link {
    private String name;
    private String url;

    public Link(){}

    public Link(String name,String url){
        this.name=name;
        this.url=url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}