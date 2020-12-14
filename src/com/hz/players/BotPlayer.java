package com.hz.players;
import java.util.Random;

public class BotPlayer implements TicTacToe{


    private String playerName = "Pascal";
    private int symbol;
    private int[] state;

    Random random = new Random();

    @Override
    public String getPlayerName(){
        return this.playerName;
    };

    // init
    @Override
    public void setSymbol(int symbol){
        this.symbol = symbol;
    };

    @Override
    public int getSymbol(){
        return this.symbol;
    };

    // game loop
    @Override
    public void accept(int[] state){
        this.state = state;
    };

    @Override
    public void setNewState(){

        while(true) {
            int randomInt = random.nextInt(9);
            int coordinate = this.state[randomInt];

            if(coordinate == -1) {
                this.state[coordinate] = this.symbol;
                break;
            }
        }
    };

    @Override
    public int[] getChangedState(){
        return this.state;
    };
    // game loop end
}
