package ca.INotAlive.DiceRollingBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Roll extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        String[] m = e.getMessage().getContentRaw().split(" ");
        MessageChannel gc = e.getMessage().getChannel();
        Guild g = e.getGuild();
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("DRB Help Menu");
        eb.setDescription("r!4\nr!6\nr!8\nr!10\nr!100\nr!12\nr!20\nOr you can use any of theses with the amount you want to roll it I.E. (r!6 6) to roll 6d6");
        int v = 0;
        if (m[0].equalsIgnoreCase("r!help")) {
            gc.sendMessage(eb.build()).queue();
            //    gc.sendMessage("Help Menu\n\nr!4\nr!6\nr!8\nr!10\nr!100\nr!12\nr!20").queue();
        }
    else if (m[0].equalsIgnoreCase("r!4")) {
                int d4 = (int) (Math.random() * ((4 - 1) + 1) + 1);
                String d4s = String.valueOf(d4);
                if (m.length == 1) {
                    gc.sendMessage(d4s).queue();
                    System.out.println("d4 rolled by " + e.getMember().getUser() + "rolled " + d4s);
                } else if (!e.getMember().getUser().isBot()){
                    v = Integer.parseInt(m[1]);
                    System.out.println("d4 rolled " + v + " times by " + e.getMember().getUser());
                    for (int i = 0; i < v; i++) {
                        d4 = (int) (Math.random() * ((4 - 1) + 1) + 1);
                        d4s = String.valueOf(d4);
                        gc.sendMessage(d4s).queue();
                    }
                }
            } else if (m[0].equalsIgnoreCase("r!6")) {
            int d6 = (int) (Math.random() * ((6 - 1) + 1) + 1);
            String d6s = String.valueOf(d6);
            if (m.length == 1) {
                gc.sendMessage(d6s).queue();
                System.out.println("d6 rolled by " + e.getMember().getUser() + "rolled " + d6s);
            } else if (!e.getMember().getUser().isBot()){
                v = Integer.parseInt(m[1]);
                System.out.println("d6 rolled " + v + " times by " + e.getMember().getUser());
                for (int i = 0; i < v; i++) {
                    d6 = (int) (Math.random() * ((6 - 1) + 1) + 1);
                    d6s = String.valueOf(d6);
                    gc.sendMessage(d6s).queue();
                }
            }
        } else if (m[0].equalsIgnoreCase("r!8")) {
            int d8 = (int) (Math.random() * ((8 - 1) + 1) + 1);
            String d8s = String.valueOf(d8);
            if (m.length == 1) {
                gc.sendMessage(d8s).queue();
                System.out.println("d8 rolled by " + e.getMember().getUser() + "rolled " + d8s);
            } else if (!e.getMember().getUser().isBot()){
                v = Integer.parseInt(m[1]);
                System.out.println("d8 rolled " + v + " times by " + e.getMember().getUser());
                for (int i = 0; i < v; i++) {
                    d8 = (int) (Math.random() * ((8 - 1) + 1) + 1);
                    d8s = String.valueOf(d8);
                    gc.sendMessage(d8s).queue();
                }
            }
        } else if (m[0].equalsIgnoreCase("r!10")) {
            int d10 = (int) (Math.random() * ((10 - 1) + 1) + 1);
            String d10s = String.valueOf(d10);
            if (m.length == 1) {
                gc.sendMessage(d10s).queue();
                System.out.println("d10 rolled by " + e.getMember().getUser() + "rolled " + d10s);
            } else if (!e.getMember().getUser().isBot()){
                v = Integer.parseInt(m[1]);
                System.out.println("d10 rolled " + v + " times by " + e.getMember().getUser());
                for (int i = 0; i < v; i++) {
                    d10 = (int) (Math.random() * ((10 - 1) + 1) + 1);
                    d10s = String.valueOf(d10);
                    gc.sendMessage(d10s).queue();
                }
            }
        } else if (m[0].equalsIgnoreCase("r!100")) {
            int d100 = (int) (Math.random() * ((100 - 1) + 1) + 1);
            String d100s = String.valueOf(d100);
            if (m.length == 1) {
                gc.sendMessage(d100s).queue();
                System.out.println("d100 rolled by " + e.getMember().getUser() + "rolled " + d100s);
            } else if (!e.getMember().getUser().isBot()){
                v = Integer.parseInt(m[1]);
                System.out.println("d100 rolled " + v + " times by " + e.getMember().getUser());
                for (int i = 0; i < v; i++) {
                    d100 = (int) (Math.random() * ((100 - 1) + 1) + 1);
                    d100s = String.valueOf(d100);
                    gc.sendMessage(d100s).queue();
                }
            }
        } else if (m[0].equalsIgnoreCase("r!12")) {
            int d12 = (int) (Math.random() * ((12 - 1) + 1) + 1);
            String d12s = String.valueOf(d12);
            if (m.length == 1) {
                gc.sendMessage(d12s).queue();
                System.out.println("d12 rolled by " + e.getMember().getUser() + "rolled " + d12s);
            } else if (!e.getMember().getUser().isBot()){
                v = Integer.parseInt(m[1]);
                System.out.println("d12 rolled " + v + " times by " + e.getMember().getUser());
                for (int i = 0; i < v; i++) {
                    d12 = (int) (Math.random() * ((12 - 1) + 1) + 1);
                    d12s = String.valueOf(d12);
                    gc.sendMessage(d12s).queue();
                }
            }
        } else if (m[0].equalsIgnoreCase("r!20")) {
            int d20 = (int) (Math.random() * ((20 - 1) + 1) + 1);
            String d20s = String.valueOf(d20);
            if (m.length == 1) {
                gc.sendMessage(d20s).queue();
                System.out.println("d20 rolled by " + e.getMember().getUser() + "rolled " + d20s);
            } else if (!e.getMember().getUser().isBot()){
                v = Integer.parseInt(m[1]);
                System.out.println("d20 rolled " + v + " times by " + e.getMember().getUser());
                for (int i = 0; i < v; i++) {
                    d20 = (int) (Math.random() * ((20 - 1) + 1) + 1);
                    d20s = String.valueOf(d20);
                    gc.sendMessage(d20s).queue();
                }

            }
        }
    }
}