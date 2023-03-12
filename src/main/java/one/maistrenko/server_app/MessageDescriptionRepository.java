package one.maistrenko.server_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MessageDescriptionRepository extends JpaRepository<MessageDescription, Long> {

    @Override
    List<MessageDescription> findAll();

    @Override
    Optional<MessageDescription> findById(Long aLong);

    @Override
    <S extends MessageDescription> S saveAndFlush(S entity);
}
