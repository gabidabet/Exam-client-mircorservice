package sid.org.clientservice.Conttroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sid.org.clientservice.Entity.Client;
import sid.org.clientservice.repository.ClientRepository;


import java.util.List;


public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("clients")
    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable("id") Long id){
        return clientRepository.getOne(id);
    }

    @PostMapping("/client")
    public Client addClient(@RequestBody Client c){
        return clientRepository.save(c);
    }
}
