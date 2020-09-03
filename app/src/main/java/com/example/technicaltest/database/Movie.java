package com.example.technicaltest.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.squareup.moshi.Json;

import java.io.Serializable;

@Entity(tableName = "MOVIE")
public class Movie implements Serializable {
    @PrimaryKey
    public int id;
    public String name;
    public String description;
    @ColumnInfo(name = "thumb_image_url")
    public String thumbImageUrl;
    @ColumnInfo(name = "post_image_url")
    public String posterImageUrl;
    public String rating;
    @ColumnInfo(name = "release_date")
    public String releaseDate;
    public String budget;
    @ColumnInfo(name = "total_revenue")
    public String totalRevenue;

    public Movie(){

    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", thumbImageUrl='" + thumbImageUrl + '\'' +
                ", posterImageUrl='" + posterImageUrl + '\'' +
                '}';
    }
}