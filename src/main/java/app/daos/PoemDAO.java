package app.daos;

import app.entities.Poem;
import jakarta.persistence.EntityManager;

import java.util.Map;

public class PoemDAO {
    public void storeData(Map<Integer, Poem> poems, EntityManager em) {
        em.getTransaction().begin();
        for (Poem poem : poems.values()) {
            em.persist(poem);
        }
        em.getTransaction().commit();
    }
}