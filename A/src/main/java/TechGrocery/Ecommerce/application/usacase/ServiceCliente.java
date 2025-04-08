package TechGrocery.Ecommerce.application.usacase;

import TechGrocery.Ecommerce.adapter.repository.RepositoryClient;
import TechGrocery.Ecommerce.application.Mappers.MapperClient;
import TechGrocery.Ecommerce.application.domain.Cartao;
import TechGrocery.Ecommerce.application.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCliente {

    @Autowired
    RepositoryClient repositoryClient;

    MapperClient mapperClient;

    public Object cadastrarCliente(Cliente cliente){
        try{
            //Procuro se há algum documento com o email passado no cliente do parâmetro e verifico se está presente
            //<.isPresent> evita retornar true quando retorna um Optional empty (que é considerado true)
            if(repositoryClient.findById(cliente.getsEmail()).isPresent()){
                //Se ele achar, retora uma mensagem para o front e manda um Http.status
                return new ResponseEntity<>("Cliente já existente, tente com outro e-mail ou faça o login.", HttpStatus.CONFLICT);
            } else {
                //se caso o cliente não exitir, cria um e salva no banco, retornando um Http.status 201 -> created
                String email = cliente.getsEmail();
                String senha = cliente.getsSenha();
                String cpf = cliente.getsCpf();
                String telefone = cliente.getsTelefone();
                Cliente clienteSalvar = new Cliente(email, senha, cpf, telefone);
                repositoryClient.save(clienteSalvar);
                return new ResponseEntity<>("Cliente cadastrado com sucesso!", HttpStatus.CREATED);
            }
        } catch (Exception exception){
            return new ResponseEntity<>("Erro catch, tratar", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    };

    public Object loginCliente(String email, String senha){
        try{
            if(repositoryClient.findById(email).isPresent()){
                Cliente clienteEmail = mapperClient.toCliente(repositoryClient.findById(email));
                if(clienteEmail.getsSenha() == senha){
                    return new ResponseEntity<>("Login realizado com sucesso!", HttpStatus.OK);
                }else{
                    return new ResponseEntity<>("Senha incorreta, por favor tente novamente", HttpStatus.BAD_REQUEST);
                }
            }else{
                return new ResponseEntity<>("E-mail não encontrado, por favor faça o cadastro", HttpStatus.NOT_FOUND);
            }
        }catch(Exception exception){
            return new ResponseEntity<>("Erro catch", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    public Object retornarCliente(String email) {
        try{
            if(repositoryClient.findById(email).isPresent()){
                Cliente cliente = mapperClient.toCliente(repositoryClient.findById(email));
                return new ResponseEntity<>(cliente, HttpStatus.OK);
            }else{
                return new ResponseEntity<>("Cliente não encontrado", HttpStatus.NOT_FOUND);
            }
        }catch(Exception exception){
            return new ResponseEntity<>("Erro catch", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
