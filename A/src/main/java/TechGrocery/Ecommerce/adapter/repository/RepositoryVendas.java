package TechGrocery.Ecommerce.adapter.repository;

import TechGrocery.Ecommerce.application.domain.Produto;
import TechGrocery.Ecommerce.application.domain.Vendas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVendas extends MongoRepository<Vendas, String> {
}
