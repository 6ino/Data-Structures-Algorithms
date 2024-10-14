package edu.alvernia.cs220.assignment0.roster;

public class Player {
    private String firstName;
    private String lastName;
    private int rushing;
    private int passing;
    private int touchdowns;
    private int sacks;

    public Player(String firstName, String lastName, int rushing, int passing, int touchdowns, int sacks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rushing = rushing;
        this.passing = passing;
        this.touchdowns = touchdowns;
        this.sacks = sacks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRushing() {
        return rushing;
    }

    public int getPassing() {
        return passing;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public int getSacks() {
        return sacks;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rushing=" + rushing +
                ", passing=" + passing +
                ", touchdowns=" + touchdowns +
                ", sacks=" + sacks +
                '}';
    }
}

