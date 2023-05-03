package id.ac.ui.cs.advprog.commentservice.repository;

import id.ac.ui.cs.advprog.commentservice.model.Comment;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @NonNull
    List<Comment> findAllByPostId(@NonNull Integer postId);

    void deleteById(@NonNull Integer id);
}
