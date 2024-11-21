package exam.domain;

import exam.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "examReqs", path = "examReqs")
public interface ExamReqRepository
    extends PagingAndSortingRepository<ExamReq, Long> {}
