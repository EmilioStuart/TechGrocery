package TechGrocery.Ecommerce.application.usacase;


import TechGrocery.Ecommerce.adapter.repository.RepositoryCards;
import TechGrocery.Ecommerce.adapter.repository.RepositoryClient;
import TechGrocery.Ecommerce.application.domain.Cartao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceCartao {

    @Autowired
    RepositoryCards repositoryCards;

    @Autowired
    RepositoryClient repositoryClient;

    public Object cadastrarCartao(Cartao cartao){
        try{
            repositoryCards.save(cartao);
            return new ResponseEntity<>("Cartão cadastrado com sucesso", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Erro ao cadastrar o cartão ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Object deletarCartao(String sNomeCartao, String sEmail) {
        System.out.println(sEmail);
        try {
            if(repositoryClient.findById(sEmail).isPresent()){
                if(repositoryCards.findById(sNomeCartao).isPresent()){
                    repositoryCards.deleteBySNumeroCartao(sNomeCartao);
                    return new ResponseEntity<>("Cartão deletado com sucesso", HttpStatus.OK);
                } else{
                    return new ResponseEntity<>("Cartão não encontrado", HttpStatus.NOT_FOUND);
                }
            }
            else{
                return new ResponseEntity<>("Cliente não encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao deletar o cartão: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
