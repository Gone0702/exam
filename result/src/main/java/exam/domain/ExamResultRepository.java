package exam.domain;

import exam.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "examResults",
    path = "examResults"
)
public interface ExamResultRepository
    extends PagingAndSortingRepository<ExamResult, Long> {}
