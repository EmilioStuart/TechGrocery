package TechGrocery.Ecommerce.application.usacase;

import TechGrocery.Ecommerce.adapter.repository.RepositoryVendas;
import TechGrocery.Ecommerce.application.domain.Vendas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceVenda {
    @Autowired
    private RepositoryVendas repositoryVenda;

    public Object cadastrarVenda(Vendas venda) {
        try{
            repositoryVenda.save(venda);
            return new ResponseEntity<>("Venda cadastrada com sucesso", HttpStatus.CREATED);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>("Erro ao cadastrar venda", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
