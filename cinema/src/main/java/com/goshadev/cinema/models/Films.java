package com.goshadev.cinema.models;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "films")
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long _id;

    @Column(name = "title", nullable = false)
    private String _title;

    @Column(name = "short_title", nullable = false)
    private String _short_title;

    @Column(name = "description", nullable = false)
    private String _description;

    @Column(name = "link", nullable = false)
    private String _link;

    public Films() {
    }

    public Films(String title, String short_title, String description, String link) {
        this._title = title;
        this._short_title = short_title;
        this._description = description;
        this._link = link;
    }

    public Long GetId() {
        return _id;
    }

    public void SetId(Long _id) {
        this._id = _id;
    }

    public String GetTitle() {
        return _title;
    }

    public void SetTitle(String _title) {
        this._title = _title;
    }

    public String GetShortTitle() {
        return _short_title;
    }

    public void SetShortTitle(String _short_title) {
        this._short_title = _short_title;
    }

    public String GetDescription() {
        return _description;
    }

    public void SetDescription(String _description) {
        this._description = _description;
    }

    public String getLink() {
        return _link;
    }

    public void SetLink(String _link) {
        this._link = _link;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "id=" + _id +
                ", title='" + _title + '\'' +
                ", short_tilte='" + _short_title  + '\'' +
                ", description='" + _description + '\'' +
                ", link='" + _link + '\'' +
                '}';
    }

}

