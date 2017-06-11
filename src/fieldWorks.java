/**
 * Created by User on 03.04.2017.
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class fieldWorks {
    public void clearField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = 0;
            }
        }
    }

    public void drawField(int[][] field) {
            for (int i = 0; i < field.length; i++) {
                System.out.print(" _____");
            }
        System.out.println();
            for (int i = 0; i < field.length; i++) {
                System.out.print("|     ");
            }
            System.out.print("|\n");
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (j == 0) System.out.print("|");
                    if (field[i][j] == 0) System.out.print("     |");
                    else if (field[i][j] < 10) System.out.print("  " + field[i][j] + "  |");
                    else if (field[i][j] < 100) System.out.print(" " + field[i][j] + "  |");
                    else if (field[i][j] < 1000) System.out.print(field[i][j] + "  |");
                    else if (field[i][j] < 10000) System.out.print(field[i][j] + " |");
                }
                System.out.println();
                    for (   int j = 0; j < field.length; j++) {
                        System.out.print("|_____");
                    }
                System.out.print("|\n");
                    if (i != field.length - 1){
                        for (int k = 0; k < field.length; k++) {
                            System.out.print("|     ");
                        }
                        System.out.print("|\n");
                    }
            }
        }

    public void randomFieldInput(int[][] field) {
        boolean t = false;
// Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
        while (t == false) {
            int line = 0 + rnd.nextInt(field.length - 1 - 0 + 1);
            int row = 0 + rnd.nextInt(field.length - 1 - 0 + 1);
            if (field[line][row] == 0) {
                field[line][row] = 2;
                t = true;
            }
        }
    }

    public void moves(Direction d, int[][] field) {

                    if (d == Direction.LEFT){moveLeft(field);}
                    if (d == Direction.RIGHT){moveRight(field);}
                    if (d == Direction.DOWN){moveDown(field);}
                    if (d == Direction.UP){moveUp(field);}

                }

    private void moveLeft(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                for (int k = 0; k < field.length; k++) {
                    if (k - 1 >= 0 && field[i][k - 1] == 0) {
                        field[i][k - 1] = field[i][k];
                        field[i][k] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (j - 1 >= 0 && field[i][j - 1] == field[i][j]) {
                    field[i][j - 1] *= 2;
                    field[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                for (int k = 0; k < field.length; k++) {
                    if (k - 1 >= 0 && field[i][k - 1] == 0) {
                        field[i][k - 1] = field[i][k];
                        field[i][k] = 0;
                    }
                }
            }
        }
    }

    private void moveRight(int[][] field) {
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = field.length - 1; j >= 0; j--) {
                for (int k = field.length - 2; k >= 0; k--) {
                    if (k + 1 <= field.length && field[i][k + 1] == 0) {
                        field[i][k + 1] = field[i][k];
                        field[i][k] = 0;
                    }

                }
            }
        }
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = field.length - 1; j >= 0; j--) {
                if (j + 1 <= field.length - 1 && field[i][j + 1] == field[i][j]) {
                    field[i][j + 1] *= 2;
                    field[i][j] = 0;
                    break;
                }
            }
        }
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = field.length - 1; j >= 0; j--) {
                for (int k = field.length - 2; k >= 0; k--) {
                    if (k + 1 <= field.length && field[i][k + 1] == 0) {
                        field[i][k + 1] = field[i][k];
                        field[i][k] = 0;
                    }

                }
            }
        }
    }

    private void moveUp(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                for (int k = 0; k < field.length; k++) {
                    if (k - 1 >= 0 && field[k - 1][i] == 0) {
                        field[k - 1][i] = field[k][i];
                        field[k][i] = 0;
                    }
                    }
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (j - 1 >= 0 && field[j - 1][i] == field[j][i]) {
                        field[j - 1][i] *= 2;
                        field[j][i] = 0;
                        break;
                    }
                }
            }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                for (int k = 0; k < field.length; k++) {
                    if (k - 1 >= 0 && field[k - 1][i] == 0) {
                        field[k - 1][i] = field[k][i];
                        field[k][i] = 0;
                    }
                }
            }
        }
    }

    private void moveDown(int[][] field) {
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = field.length - 1; j >= 0; j--) {
                for (int k = field.length - 2; k >= 0; k--) {
                    if (k + 1 <= field.length && field[k + 1][i] == 0) {
                        field[k + 1][i] = field[k][i];
                        field[k][i] = 0;
                    }
                }
            }
        }
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = field.length - 1; j >= 0; j--) {
                if (j + 1 <= field.length - 1 && field[j + 1][i] == field[j][i]) {
                    field[j + 1][i] *= 2;
                    field[j][i] = 0;
                    break;
                }
            }
        }
        for (int i = field.length - 1; i >= 0; i--) {
            for (int j = field.length - 1; j >= 0; j--) {
                for (int k = field.length - 2; k >= 0; k--) {
                    if (k + 1 <= field.length && field[k + 1][i] == 0) {
                        field[k + 1][i] = field[k][i];
                        field[k][i] = 0;
                    }
                }
            }
        }
    }
    public boolean gameOver(int[][] field){
        int k = 0;
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++){
                if (field[i][j] != 0) k++;
            }
        }
        if (k >= field.length * field.length - 1) return true;
        return false;
    }

}

