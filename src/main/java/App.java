import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.ArrayList;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();
      model.put("template", "templates/index.vtl");
      model.put("words", Word.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();
      model.put("template", "templates/word-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();
      String wordName = request.queryParams("wordName");
      Word newWord = new Word(wordName);
      model.put("words", Word.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/:id", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);
      model.put("template", "templates/word.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/:id/definitions/new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);

      model.put("template", "templates/word-definition-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/definition-new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      String meaning = request.queryParams("wordMeaning");

      Word word = Word.find(Integer.parseInt(request.queryParams("wordId")));
      Definition newDefinition = new Definition(meaning);
      Word.find(word.getId()).addDefinition(newDefinition);
      model.put("word", word);

      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }


}
