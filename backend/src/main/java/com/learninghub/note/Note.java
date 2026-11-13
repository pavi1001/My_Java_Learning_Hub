package com.learninghub.note;
import jakarta.persistence.*;
import java.time.Instant;
@Entity @Table(name="personal_notes")
public class Note {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String userKey;
 @Column(nullable=false) private String title;
 @Column(length=12000) private String body;
 private String topicKey;
 private boolean bookmarked;
 private Instant updatedAt=Instant.now();
 public Note(){}
 public Long getId(){return id;} public String getUserKey(){return userKey;} public String getTitle(){return title;} public String getBody(){return body;} public String getTopicKey(){return topicKey;} public boolean isBookmarked(){return bookmarked;} public Instant getUpdatedAt(){return updatedAt;}
 public void setUserKey(String v){userKey=v;} public void setTitle(String v){title=v;} public void setBody(String v){body=v;} public void setTopicKey(String v){topicKey=v;} public void setBookmarked(boolean v){bookmarked=v;} @PreUpdate public void touch(){updatedAt=Instant.now();}
}
