package com.learninghub.topic;
import jakarta.persistence.*;
@Entity @Table(name="topics", indexes=@Index(name="idx_topic_module", columnList="module_id"))
public class Topic {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  @Column(name="module_id", nullable=false) private Integer moduleId;
  @Column(nullable=false) private String title;
  @Column(length=3000) private String description;
  private String difficulty;
  public Topic() {}
  public Topic(Integer moduleId,String title,String description,String difficulty){this.moduleId=moduleId;this.title=title;this.description=description;this.difficulty=difficulty;}
  public Long getId(){return id;} public Integer getModuleId(){return moduleId;} public String getTitle(){return title;}
  public String getDescription(){return description;} public String getDifficulty(){return difficulty;}
}
