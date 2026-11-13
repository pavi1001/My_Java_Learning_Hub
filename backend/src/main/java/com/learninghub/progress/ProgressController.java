package com.learninghub.progress;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/progress")
public class ProgressController {
 private final TopicProgressRepository repository;
 public ProgressController(TopicProgressRepository repository){this.repository=repository;}
 @GetMapping public List<TopicProgress> list(@RequestParam(defaultValue="local-user") String user){return repository.findByUserKey(user);}
 @PutMapping("/{topicKey}") public TopicProgress update(@PathVariable String topicKey,@RequestParam(defaultValue="local-user") String user,@RequestParam String status){
   if(!List.of("NOT_STARTED","IN_PROGRESS","COMPLETED","NEEDS_REVISION").contains(status)) throw new IllegalArgumentException("Invalid progress status");
   TopicProgress p=repository.findByUserKeyAndTopicKey(user,topicKey).orElseGet(()->new TopicProgress(user,topicKey,status));p.setStatus(status);return repository.save(p);
 }
}
