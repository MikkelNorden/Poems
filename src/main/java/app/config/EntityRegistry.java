package app.config;

//import app.entities.Study;
import app.entities.Poem;
import org.hibernate.cfg.Configuration;

final class EntityRegistry {

    private EntityRegistry() {}

    static void registerEntities(Configuration configuration) {
        //configuration.addAnnotatedClass(Study.class);
        configuration.addAnnotatedClass(Poem.class);
        // TODO: Add more entities here...
    }
}