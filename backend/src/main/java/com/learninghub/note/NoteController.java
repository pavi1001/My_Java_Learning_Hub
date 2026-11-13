package com.learninghub.note;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/notes")
public class NoteController {
 private final NoteRepository repository;
 public NoteController(NoteRepository repository){this.repository=repository;}
 @GetMapping public List<Note> all(@RequestParam(defaultValue="local-user") String user){return repository.findByUserKeyOrderByUpdatedAtDesc(user);}
 @PostMapping public Note create(@RequestBody Note note){if(note.getUserKey()==null)note.setUserKey("local-user");return repository.save(note);}
 @PutMapping("/{id}") public Note update(@PathVariable Long id,@RequestBody Note input){Note n=repository.findById(id).orElseThrow();n.setTitle(input.getTitle());n.setBody(input.getBody());n.setTopicKey(input.getTopicKey());n.setBookmarked(input.isBookmarked());return repository.save(n);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repository.deleteById(id);}
}
