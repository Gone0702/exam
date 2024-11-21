package exam.domain;

import exam.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "exams", path = "exams")
public interface ExamRepository
    extends PagingAndSortingRepository<Exam, Long> {}
