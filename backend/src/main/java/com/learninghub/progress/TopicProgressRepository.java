package com.learninghub.progress;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
public interface TopicProgressRepository extends JpaRepository<TopicProgress,Long>{
 List<TopicProgress> findByUserKey(String userKey);
 Optional<TopicProgress> findByUserKeyAndTopicKey(String userKey,String topicKey);
}
