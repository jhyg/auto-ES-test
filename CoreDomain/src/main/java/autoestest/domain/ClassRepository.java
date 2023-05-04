package autoestest.domain;

import autoestest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "classes", path = "classes")
public interface ClassRepository
    extends PagingAndSortingRepository<Class, String> {}
