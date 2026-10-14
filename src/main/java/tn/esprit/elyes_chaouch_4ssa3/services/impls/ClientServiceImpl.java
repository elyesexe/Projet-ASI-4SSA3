package tn.esprit.elyes_chaouch_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.elyes_chaouch_4ssa3.reposetiries.ClientRepo;
import tn.esprit.elyes_chaouch_4ssa3.entities.Client;
import tn.esprit.elyes_chaouch_4ssa3.services.interfaces.IClientService;
import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements IClientService {
    ClientRepo clientRepository;

    @Override
    public Client ajouterClient(Client a) {
        return clientRepository.save(a);
    }

    @Override
    public Client updateClient(Client a) {
        return clientRepository.save(a);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
