package org.aim.movie.movie;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.aim.movie.actor.Actor;
import org.aim.movie.director.Director;
import org.aim.movie.genre.Genre;
import org.aim.movie.rating.Rating;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id")
    private Integer id;

    @Column(name = "publisher_name")
    private String publisher;

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    private Designer publisher;

    @ManyToMany
    @JoinTable(name = "publisher", joinColumns = @JoinColumn(name = "game_id"), inverseJoinColumns = @JoinColumn(name = "publisher_id"))
    private List<Publisher> publishers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublisher() {
        return getPublisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

}
