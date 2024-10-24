package com.example.apimongopeticos.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;


@Document(collection = "post")
public class Post {
    @Id
    private String id;
    @Field(name = "user_id")
    private BigInteger userId;
    private List likes;
    private List shares;
    private String picture;
    private String caption;
    private List<BigInteger> pets;
    @Field(name = "post_date")

    private Date postDate;
    @Field(name = "is_mei")
    private boolean isMei;
    private  Double price;
    private String telephone;
    @Field(name = "product_name")

    private String productName;

    public Post() {
    }

    public Post(String id, BigInteger userId, List likes, List shares, String picture, String caption, List<BigInteger> pets, Date postDate, boolean isMei, Double price, String telephone, String productName) {
        this.id = id;
        this.userId = userId;
        this.likes = likes;
        this.shares = shares;
        this.picture = picture;
        this.caption = caption;
        this.pets = pets;
        this.postDate = postDate;
        this.isMei = isMei;
        this.price = price;
        this.telephone = telephone;
        this.productName = productName;
    }

    public Post(String id, BigInteger userId, List likes, List shares, String picture, String caption, Date postDate, boolean isMei, Double price, String telephone, String productName) {
        this.id = id;
        this.userId = userId;
        this.likes = likes;
        this.shares = shares;
        this.picture = picture;
        this.caption = caption;
        this.postDate = postDate;
        this.isMei = isMei;
        this.price = price;
        this.telephone = telephone;
        this.productName = productName;
    }

    public Post(String id, BigInteger user_id, List likes, List shares, String picture, String caption, List<BigInteger> pets, Date post_date, boolean is_mei) {
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List getLikes() {
        return likes;
    }

    public void setLikes(List likes) {
        this.likes = likes;
    }

    public List getShares() {
        return shares;
    }

    public void setShares(List shares) {
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

    public boolean isIs_mei() {
        return isMei;
    }

    public void setIs_mei(boolean is_mei) {
        this.isMei = is_mei;
    }
}
