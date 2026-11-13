package com.learninghub.note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface NoteRepository extends JpaRepository<Note,Long>{List<Note> findByUserKeyOrderByUpdatedAtDesc(String userKey);}
