package com.hdm.monopoly.backend.player_money;


public class Player {

    private int position;
    private Account account;
    private String name;
    private String colour;
    private int ID;
    private Player previousPlayer;
    private int jailTime = 0;

    public Player(int ID, String name, String colour) {

        this.account = new Account(31);
        this.name = name;
        this.colour = colour;
        this.ID = ID;
        this.position = 0;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Player getPreviousPlayer() {
        return previousPlayer;
    }

    public void setPreviousPlayer(Player previousPlayer) {
        this.previousPlayer = previousPlayer;
    }

    //Nach jeder Änderung des Kontostandes wird der neue Kontostand über das return statement zurückgegeben.
    //Falls wir später eine Anzeige des Kontostandes haben, kann man die Anzeige mit den Returnstatments aktualisieren

    public int PlayerGetsMoney(int amount){
        account.getMoney(amount);
        return account.getBankBalance();
    }

    public int PlayerPaysMoney(int amount){
        account.payMoney(amount);
        return account.getBankBalance();
    }

    public int getPlayerBankBalance() {
        return account.getBankBalance();
    }

    public int getJailTime(){
        return jailTime;
    }

    /**
     * to be called when the player gets arrested
     */
    public void getArrested(){
        jailTime = 3;
    }

    public void jailed(){
        --jailTime;
    }

    public void getReleased(){
        jailTime = 0;
    }
}
