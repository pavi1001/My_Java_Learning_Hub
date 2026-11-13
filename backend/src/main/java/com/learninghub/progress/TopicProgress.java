package com.learninghub.progress;
import jakarta.persistence.*;
import java.time.Instant;
@Entity @Table(name="topic_progress", uniqueConstraints=@UniqueConstraint(columnNames={"user_key","topic_key"}))
public class TopicProgress {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(name="user_key",nullable=false) private String userKey;
 @Column(name="topic_key",nullable=false) private String topicKey;
 @Column(nullable=false) private String status;
 private Instant updatedAt;
 public TopicProgress(){}
 public TopicProgress(String userKey,String topicKey,String status){this.userKey=userKey;this.topicKey=topicKey;this.status=status;this.updatedAt=Instant.now();}
 @PreUpdate public void update(){updatedAt=Instant.now();}
 public Long getId(){return id;} public String getUserKey(){return userKey;} public String getTopicKey(){return topicKey;} public String getStatus(){return status;} public Instant getUpdatedAt(){return updatedAt;}
 public void setStatus(String status){this.status=status;this.updatedAt=Instant.now();}
}
