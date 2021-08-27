package com.digital.crud.saladereuniao.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meetingroom")

public class Room {


    private String startHour;
    private String endHour;
    private Long id;
    private String name;

    public String getDate() {
        return date;
    }
    @Column(name = "date",nullable = false)
    public void setDate(String date) {
        this.date = date;
    }

    private String date;




    public Room(){

    }
    public Room(long id,String name,String date,String  startHour,String endHour){
        this.id=id;
        this.name=name;
        this.date=date;
        this.startHour=startHour;
        this.endHour=endHour;
    }
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
     @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "StartHour",nullable = false)
    public String getStarHour() {
        return startHour;
    }

    public void setStartHour(String starHour) {
        this.startHour = starHour;
    }
    @Column(name = "EndHour",nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
@Override
public String toString(){
    return "Room[id="+id+",name="+name+",StartHour"+startHour+",EndHour="+endHour+"]";
}

}
