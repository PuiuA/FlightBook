package io.lazy.repository;

import io.lazy.model.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ClientRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Client save(Client client){
        entityManager.persist(client);
        return client;
    }

    public Client findById(Long id){
        return entityManager.find(Client.class, id);
    }

    public List findAll(){
        return entityManager.createQuery("from Client").getResultList();
    }

    public void delete(Client client){
        entityManager.remove(client);
    }

    public void deleteById(Long id){
        Client client = entityManager.find(Client.class, id);
        entityManager.remove(client);
    }
    public Client update(Client client){
        return entityManager.merge(client);
    }


}
