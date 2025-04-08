package TechGrocery.Ecommerce.adapter.repository;

import TechGrocery.Ecommerce.application.domain.Cartao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryCards extends MongoRepository<Cartao, String> {
    Cartao deleteBySNumeroCartao(String sNomeCartao);
}
