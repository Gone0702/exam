package exam.domain;

import exam.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "userAnswereds",
    path = "userAnswereds"
)
public interface UserAnsweredRepository
    extends PagingAndSortingRepository<UserAnswered, Long> {}
