package tn.esprit.elyes_chaouch_4ssa3.services.interfaces;

import tn.esprit.elyes_chaouch_4ssa3.entities.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client a);
    Client updateClient(Client a);
    void deleteClient(Long id);
    Client getClient(Long id);
    List<Client> getAllClients();
}
