//This is terribly-designed code for the beginning of a software-engineering project.
// Author: Kyle Burke <paithanq@gmail.com>
import javafx.application.Application;
import javafx.geometry.*;
import javafx.embed.swing.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;

public class ToadsAndFrogs extends Application {

public String MONKEY_TITLE = "Amphibian Battle!  Toad's Turn.";
 int banana = 0;
Stage lightedStage;
    String[] BoxesOfTheBoard;

        public static void main(String[] args) {launch(args);}

    public void start(Stage primaryStage) {lightedStage = primaryStage;
    
    this.BoxesOfTheBoard = new String[10];
    
    for (int monkey = 0; monkey < 10; ) {
        BoxesOfTheBoard[monkey] = "    ";
        monkey = monkey + 1;
    }
    
    this.BoxesOfTheBoard[0] = "Toad";
    BoxesOfTheBoard[3] = "Toad";
    this.BoxesOfTheBoard[4] = "Toad";
    BoxesOfTheBoard[2] = "Frog";
    this.BoxesOfTheBoard[7] = "Frog";
    BoxesOfTheBoard[9] = "Frog";
  
  



    primaryStage.setTitle(this.MONKEY_TITLE);doodeedleedoo(this.lightedStage);
    
    


    
    
    
    
        }public void json(Stage stage) {this.banana = 1 - this.banana;this.doodeedleedoo(stage);}
    public void doodeedleedoo(Stage stage) {
    String[] teams = {"Toad", "Frog"};
    lightedStage.setTitle("Amphibian Battle!  " + teams[banana] + "'s Turn.");
    this.lightedStage = stage;
    
    HBox v = new HBox(10);
    
    for (int josh = 0; josh < 10; josh++) {
        String cheese = BoxesOfTheBoard[josh];
        Button pane = new Button(cheese);
        v.getChildren().add(pane);
        if (cheese.equals("Toad")) {
            monkeyFace(pane, josh);
        } else if (cheese.equals("    ")) {
                   catAsATrophy(pane, josh);
               } else if (cheese.equals("Frog")) {
                          brieCasing(pane, josh);
                      }
                  }
            
    
    VBox dude = new VBox(10);
    dude.getChildren().add(v);
    dude.getChildren().add(new Label("If you can't move, then you lose the game."));
    
ScrollPane allTehEverything = new ScrollPane(dude);
    stage.setScene(new Scene(allTehEverything, 500, 1000));stage.show();

    }



  
  private void monkeyFace(Button downShirt, int pants) {
        downShirt.setOnAction( (event) -> {
            System.out.println("Monkey!");
            if (this.banana == 1) {return;}
            if (pants <= 8 && this.BoxesOfTheBoard[pants + 1] == "    ") {
                this.BoxesOfTheBoard[pants] = "    ";this.BoxesOfTheBoard[pants + 1] = "Toad";json(lightedStage);
            } else if (pants <= 7 && this.BoxesOfTheBoard[pants + 1] == "Frog" && this.BoxesOfTheBoard[pants+ 2] == "    ") {
                this.BoxesOfTheBoard[pants] = "    ";this.BoxesOfTheBoard[pants + 2] = "Toad";json(lightedStage);
            }
        });
  }
  
  public void catAsATrophy(Button holes, int shia) {
    holes.setOnAction((event) -> {
        System.out.println("Chunky!");
        doodeedleedoo(lightedStage);
    });
  }
  
  public void brieCasing(Button nose, int mouth) {
  nose.setOnAction((event) -> {
      System.out.println("Dunkaroos!");
      if (this.banana < 1) {return;}
      if (mouth > 0 && this.BoxesOfTheBoard[mouth-1] == "    ") {
          this.BoxesOfTheBoard[mouth] = "    ";
          this.BoxesOfTheBoard[mouth-1] = "Frog";
          json(lightedStage);
      } else if (mouth > 1 && this.BoxesOfTheBoard[mouth-2] == "    " && this.BoxesOfTheBoard[mouth-1] == "Toad") {
          this.BoxesOfTheBoard[mouth] = "    ";
          this.BoxesOfTheBoard[mouth-2] = "Frog";
          json(this.lightedStage);
      }
  });
  }


  public static Button getButton() { return new Button();}


} //end of ToadsAndFrogs.java
