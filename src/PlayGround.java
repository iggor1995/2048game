import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 09.04.2017.
 */
public class PlayGround extends JFrame {

    public JPanel panel1;
    private JPanel second;
    private JPanel first;
    private JPanel fith;
    private JPanel third;
    private JPanel forth;
    public JLabel fivefive;
    private JLabel fiveone;
    private JLabel fivefour;
    private JLabel fivetwo;
    private JLabel fivethree;
    private JLabel oneone;
    private JLabel onetwo;
    private JLabel onethree;
    private JLabel oneofour;
    private JLabel onefive;
    private JLabel twoone;
    private JLabel twotwo;
    private JLabel twothree;
    private JLabel twofour;
    private JLabel twofive;
    private JLabel threeone;
    private JLabel threetwo;
    private JLabel threethree;
    private JLabel threefour;
    private JLabel threefive;
    private JLabel fourone;
    private JLabel fourtwo;
    private JLabel fourthree;
    private JLabel fourfour;
    private JLabel fourfive;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PlayGround");
        frame.setContentPane(new PlayGround().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setBackground(Color.red);
        frame.setLocation(400,400);
    }
}
