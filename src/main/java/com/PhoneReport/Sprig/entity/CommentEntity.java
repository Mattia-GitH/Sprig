package com.PhoneReport.Sprig.entity;

import javax.persistence.*;
//import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "COMMENT_TBL")
public class CommentEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IMEI")
    private Long imei;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "PROBLEM")
    private String problem;

    @Column(name = "COMMENT")
    private String comment;


    public CommentEntity() {
    }

    public CommentEntity(Long imei, Date date, String problem, String comment) {
        this.imei = imei;
        this.date = date;
        this.problem = problem;
        this.comment = comment;
    }

    public Long getImei() {
        return imei;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return Objects.equals(imei, that.imei) &&
                Objects.equals(date, that.date) &&
                Objects.equals(problem, that.problem) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, date, problem, comment);
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "imei=" + imei +
                ", date=" + date +
                ", problem='" + problem + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }


}
