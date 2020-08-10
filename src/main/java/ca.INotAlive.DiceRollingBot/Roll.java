package ca.INotAlive.DiceRollingBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.guild.GenericGuildEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Roll extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        String m = e.getMessage().getContentRaw();
        MessageChannel gc = e.getMessage().getChannel();
        Guild g = e.getGuild();
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle("DRB Help Menu");
        eb.setDescription("r!4\nr!6\nr!8\nr!10\nr!100\nr!12\nr!20");
        if (m.equalsIgnoreCase("r!help")){
            gc.sendMessage(eb.build()).queue();
        //    gc.sendMessage("Help Menu\n\nr!4\nr!6\nr!8\nr!10\nr!100\nr!12\nr!20").queue();
        }else if (m.equalsIgnoreCase("r!4")) {
            int d4 = (int) (Math.random() * ((4 - 1) + 1) + 1);
            String d4s = String.valueOf(d4);
            gc.sendMessage(d4s).queue();
            System.out.println("d4 rolled by "+ e.getMember().getUser() + "rolled "+d4s);
        }else if (m.equalsIgnoreCase("r!6")) {
            int d6 = (int) (Math.random() * ((6 - 1) + 1) + 1);
            String d6s = String.valueOf(d6);
            gc.sendMessage(d6s).queue();
            System.out.println("d6 rolled by " + e.getMember().getUser() + "rolled " + d6s);
        }else if (m.equalsIgnoreCase("r!8")) {
            int d8 = (int) (Math.random() * ((8 - 1) + 1) + 1);
            String d8s = String.valueOf(d8);
            gc.sendMessage(d8s).queue();
            System.out.println("d8 rolled by " + e.getMember().getUser() + "rolled " + d8s);
        }else if (m.equalsIgnoreCase("r!10")) {
            int d10 = (int) (Math.random() * ((10 - 1) + 1) + 1);
            String d10s = String.valueOf(d10);
            gc.sendMessage(d10s).queue();
            System.out.println("d10 rolled by " + e.getMember().getUser() + "rolled " + d10s);
        }else if (m.equalsIgnoreCase("r!100")) {
            int d100 = (int) (Math.random() * ((100 - 1) + 1) + 1);
            String d100s = String.valueOf(d100);
            gc.sendMessage(d100s).queue();
            System.out.println("d100 rolled by " + e.getMember().getUser() + "rolled " + d100s);
        }else if (m.equalsIgnoreCase("r!12")) {
            int d12 = (int) (Math.random() * ((12 - 1) + 1) + 1);
            String d12s = String.valueOf(d12);
            gc.sendMessage(d12s).queue();
            System.out.println("d12 rolled by " + e.getMember().getUser() + "rolled " + d12s);
        }else if (m.equalsIgnoreCase("r!20")) {
            int d20 = (int) (Math.random() * ((20 - 1) + 1) + 1);
            String d20s = String.valueOf(d20);
            gc.sendMessage(d20s).queue();
            System.out.println("d20 rolled by " + e.getMember().getUser() + "rolled " + d20s);
        }
}
}
