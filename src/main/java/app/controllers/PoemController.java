package app.controllers;

import app.entities.Poem;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PoemController {

    Map<Integer, Poem> poems = new LinkedHashMap<>();
    Poem testPoem = new Poem(1, "author", "desc", "content");

    public void addPoem() {
        poems.put(testPoem.getId(), testPoem);
    }

    public void getAllPoems(Context ctx) {
        ctx.json(poems.values());
    }

}