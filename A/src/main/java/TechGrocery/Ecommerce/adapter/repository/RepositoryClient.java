package TechGrocery.Ecommerce.adapter.repository;

import TechGrocery.Ecommerce.application.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends MongoRepository<Cliente, String> {
}
