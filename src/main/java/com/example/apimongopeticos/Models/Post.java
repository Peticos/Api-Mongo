package com.example.apimongopeticos.Models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;


@Document(collection = "post")
public class Post {
    @Id
    private BigInteger id;
    @Field(name = "user_id")
    private BigInteger userId;
    private int likes;
    private int shares;
    private String picture;
    private String caption;
    private List<BigInteger> pets;
    private Date postDate;
    private boolean isMei;

    public Post() {
    }

    public Post(BigInteger id, BigInteger user_id, int likes, int shares, String picture, String caption, List<BigInteger> pets, Date post_date, boolean is_mei) {
        this.id = id;
        this.userId = user_id;
        this.likes = likes;
        this.shares = shares;
        this.picture = picture;
        this.caption = caption;
        this.pets = pets;
        this.postDate = post_date;
        this.isMei = is_mei;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getUser_id() {
        return userId;
    }

    public void setUser_id(BigInteger user_id) {
        this.userId = user_id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<BigInteger> getPets() {
        return pets;
    }

    public void setPets(List<BigInteger> pets) {
        this.pets = pets;
    }

    public Date getPost_date() {
        return postDate;
    }

    public void setPost_date(Date post_date) {
        this.postDate = post_date;
    }

    public boolean isIs_mei() {
        return isMei;
    }

    public void setIs_mei(boolean is_mei) {
        this.isMei = is_mei;
    }
}
