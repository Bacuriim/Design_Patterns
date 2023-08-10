package Structural_Patterns.flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;



public class Flyweight extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flyweight Pattern");

        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600);

        Canvas canvas = new Canvas(800, 600);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        TreeFactory treeFactory = new TreeFactory();

        for (int i = 0; i < 100; i++) {
            Tree greenTree = treeFactory.createTree(Color.GREEN);
            greenTree.render(gc, Math.random() * 800, Math.random() * 600);
        }

        for (int i = 0; i < 100; i++) {
            Tree orangeTree = treeFactory.createTree(Color.ORANGE);
            orangeTree.render(gc, Math.random() * 800, Math.random() * 600);
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

//Aqui fica o ponto chave do flyweight, pois caso a tree gerada seja igual a uma tree anterior ela copia a tree já criada
//ao invés que criar uma nova tree!

class TreeFactory {
    private static final Map<Color, Tree> trees = new HashMap<>();

    public Tree createTree(Color color) {
        Tree tree = trees.get(color);
        if (tree == null) {
            tree = new Tree(color);
            trees.put(color, tree);
        }
        return tree;
    }
}

class Tree {
    private final Color color;

    public Tree(Color color) {
        this.color = color;
    }

    public void render(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillRect(x, y, 10, 50); // Ajustando o tamanho para representar uma árvore
        gc.setFill(Color.GREEN); // Definindo a cor da copa da árvore
        gc.fillOval(x - 15, y - 30, 40, 40); // Desenhando a copa da árvore
    }
}