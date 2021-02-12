package sid.org.clientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sid.org.clientservice.Entity.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {
}
