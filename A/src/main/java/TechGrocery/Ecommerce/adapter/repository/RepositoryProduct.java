package TechGrocery.Ecommerce.adapter.repository;

import TechGrocery.Ecommerce.application.domain.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProduct extends MongoRepository<Produto, String> {
    Produto findBySNome(String nome);
}
