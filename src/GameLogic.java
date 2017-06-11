import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by User on 07.04.2017.
 */
public class GameLogic {
    public int[][] field = new int[5][5];
    public PlayGround playGround = new PlayGround();

    public void gamePlay() throws IOException, InterruptedException {
        //playGround.setVisible(true);
        //playGround.panel1.setVisible(true);
        //playGround.setSize(500,500);
        //playGround.setBackground(Color.red);
        PlayWindow playWindow = new PlayWindow("2048");
        playWindow.setVisible(true);
        playWindow.setSize(200,200);

        KeyBoardObserver keyBoardObserver = new KeyBoardObserver();
        keyBoardObserver.start();

        fieldWorks fieldWorksObj = new fieldWorks();
        fieldWorksObj.clearField(field);
        fieldWorksObj.drawField(field);

        String str = "";
        Direction d = null;
        while (!str.equals("p")) {
            updating();
            if (!fieldWorksObj.gameOver(field)) {

                fieldWorksObj.randomFieldInput(field);
                fieldWorksObj.randomFieldInput(field);
                updating();
            } else {
                System.out.println("Game Over");
                int score = 0;
                updating();
                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field.length; j++) {
                        score += field[i][j];
                    }
                }
                System.out.println("your score is " + score);
                break;
            }
            fieldWorksObj.drawField(field);
            updating();
            do {
                while (!keyBoardObserver.hasKeyEvents()) {
                    //do nothing
                }
                KeyEvent event = keyBoardObserver.getEventFromTop();

                System.out.println(event.getKeyCode());

                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    d = Direction.LEFT;
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    d = Direction.UP;
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    d = Direction.DOWN;
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    d = Direction.RIGHT;

                fieldWorksObj.moves(d, field);
                updating();

            } while (d == null);
        }
    }
   public void updating() {
        PlayWindow.l1.setText("");
        PlayWindow.l2.setText("");
        PlayWindow.l3.setText("");
        PlayWindow.l4.setText("");
        PlayWindow.l5.setText("");
       playGround.fivefive.setText(field[4][4] + "");

       String k = "";
        for (int i = 0; i < 5; i++) {
            k = field[0][i] + "   ";
            //if(k.equals("0")) k = " ";
            if (field[0][i] < 10) {PlayWindow.l1.setText(PlayWindow.l1.getText() + "   "+ k); }
            else if (field[0][i] < 100) PlayWindow.l1.setText(PlayWindow.l1.getText() + "  " + k);
            else if (field[0][i] < 1000) PlayWindow.l1.setText( PlayWindow.l1.getText() + " " + k);
        }
        for (int i = 0; i < 5; i++) {
            k = field[1][i] + "   ";
            //if(k.equals("0 ")) k = "  ";
            if (field[1][i] < 10) {PlayWindow.l2.setText(PlayWindow.l2.getText() + "   " + k); }
            else if (field[1][i] < 100) PlayWindow.l2.setText(PlayWindow.l2.getText() + "  " + k);
            else if (field[1][i] < 1000) PlayWindow.l2.setText(PlayWindow.l2.getText() + " " + k);
        }
        for (int i = 0; i < 5; i++) {
            k = field[2][i] + "   ";
            // if(k.equals("0 ")) k = "  ";
            if (field[2][i] < 10) {PlayWindow.l3.setText(PlayWindow.l3.getText() + "   " + k); }
            else if (field[2][i] < 100) PlayWindow.l3.setText(PlayWindow.l3.getText() + "  " + k);
            else if (field[2][i] < 1000) PlayWindow.l3.setText(PlayWindow.l3.getText() + " " + k);
        }
        for (int i = 0; i < 5; i++) {
            k = field[3][i] + "   ";
            // if(k.equals("0 ")) k = "  ";
            if (field[3][i] < 10) {PlayWindow.l4.setText(PlayWindow.l4.getText() + "   " + k); }
            else if (field[3][i] < 100) PlayWindow.l4.setText(PlayWindow.l4.getText() + "  " + k);
            else if (field[3][i] < 1000) PlayWindow.l4.setText(PlayWindow.l4.getText() + " " + k);
        }
        for (int i = 0; i < 5; i++) {
            k = field[4][i] + "   ";
            //if(k.equals("0 ")) k = "  ";
            if (field[4][i] < 10) {PlayWindow.l5.setText(PlayWindow.l5.getText() + "   " + k); }
            else if (field[4][i] < 100) PlayWindow.l5.setText(PlayWindow.l5.getText() + "  " + k);
            else if (field[4][i] < 1000) PlayWindow.l5.setText(PlayWindow.l5.getText() + " " + k);
        }
    }
}


