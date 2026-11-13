package com.learninghub.topic;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/topics")
public class TopicController {
  private final TopicRepository repository;
  public TopicController(TopicRepository repository){this.repository=repository;}
  @GetMapping public List<Topic> all(){return repository.findAll();}
  @GetMapping("/module/{moduleId}") public List<Topic> byModule(@PathVariable Integer moduleId){return repository.findByModuleIdOrderById(moduleId);}
  @PostMapping public Topic create(@RequestBody Topic topic){return repository.save(topic);}
}
