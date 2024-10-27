import javax.swing.*;

import static jdk.jfr.internal.consumer.EventLog.update;

public class Game {
    //initialize the game elements , set up the game loop, handle input and draw the game
    public Game() {
        //set up the game window
    }
    //main game loop
    public void gameLoop(){
        while (true){
            update();
            handleInput();
            render();

        }
    }
    public void handleInput(){
        //handle user input

    }
    public void render(){
        //Draw the game element using graphics2D
    }
}
