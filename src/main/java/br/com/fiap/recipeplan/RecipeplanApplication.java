package br.com.fiap.recipeplan;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.theme.aura.Aura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@StyleSheet("styles.css")
@StyleSheet(Aura.STYLESHEET)
@Push
public class RecipeplanApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(RecipeplanApplication.class, args);
    }
}
