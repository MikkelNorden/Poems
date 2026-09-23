package app;

import app.controllers.PoemController;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7070);

        PoemController controller = new PoemController();
        controller.addPoem();

        app.get("/api/v1/poems", controller::getAllPoems);
    }
}