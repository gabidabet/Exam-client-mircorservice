package sid.org.clientservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sid.org.clientservice.Entity.Client;
import sid.org.clientservice.repository.ClientRepository;


@SpringBootApplication
public class ClientServiceApplication {	

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            Client client1=new Client(null,"I741011","ELAACHIQ","youness@elaachiq.com");
            Client client2=new Client(null,"G741011","Karima","karima");
            clientRepository.save(client1);
            clientRepository.save(client2);
            
            clientRepository.findAll().forEach(c -> {
                c.toString();
            });
        };
    }
}
