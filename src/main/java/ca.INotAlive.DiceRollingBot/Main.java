package ca.INotAlive.DiceRollingBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String Args[]) throws Exception {
        String file = "token.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();

        JDA jda = new JDABuilder(currentLine).build();
        jda.addEventListener(new Roll());




    }
}
