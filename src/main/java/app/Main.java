package app;

import app.config.HibernateConfig;
import app.controllers.PoemController;
import app.daos.PoemDAO;
import io.javalin.Javalin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7070);

        PoemController controller = new PoemController();
        controller.addPoems();

        /*
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();

        PoemDAO dao = new PoemDAO();
        dao.storeData(controller.getPoemList(), em);

        em.close();
        emf.close();
        */

        app.get("/api/v1/poems", controller::getAllPoems);
    }
}