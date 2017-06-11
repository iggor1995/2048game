/**
 * Created by User on 06.04.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayWindow extends JFrame{
    public static JLabel l1, l2, l3, l4, l5, ltop, lbotom1, lbotom2, lbotom3, lbotom4, lbotom5, p, t;
    GameLogic gameLogic = new GameLogic();
    public PlayWindow(String s){
        super(s);
        setLayout(new FlowLayout());
        t = new JLabel();
        p = new JLabel();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        ltop = new JLabel("");
       // lbotom1 = new JLabel("|_____|_____|_____|_____|_____|");
        //lbotom2 = new JLabel("|_____|_____|_____|_____|_____|");
        //lbotom3 = new JLabel("|_____|_____|_____|_____|_____|");
        //lbotom4 = new JLabel("|_____|_____|_____|_____|_____|");
        //lbotom5 = new JLabel("|_____|_____|_____|_____|_____|");
       // add(t);
       // add(p);
        add(l1);
       // add(lbotom1);
        add(l2);
        //add(lbotom2);
        add(l3);
        //add(lbotom3);
        add(l4);
        //add(lbotom4);
        add(l5);
        //add(lbotom5);


    }



}
