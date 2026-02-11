import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LudoBoard extends JPanel {

    private final static int BOARD_WIDTH = 600;
    private final static int BOARD_HEIGHT = 600;
    private final static int SQUARE_SIZE = 75;
    private final static int BORDER_SIZE = 25;
    private final static int CIRCLE_SIZE = 20;
public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha o fundo do tabuleiro
        g.setColor(Color.white);
        g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        // Desenha as casas coloridas
        g.setColor(Color.red);
        g.fillRect(BORDER_SIZE, BORDER_SIZE, SQUARE_SIZE, SQUARE_SIZE);
        g.setColor(Color.yellow);
        g.fillRect(BORDER_SIZE, BOARD_HEIGHT - BORDER_SIZE - SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
        g.setColor(Color.green);
        g.fillRect(BOARD_WIDTH - BORDER_SIZE - SQUARE_SIZE, BORDER_SIZE, SQUARE_SIZE, SQUARE_SIZE);
        g.setColor(Color.blue);
        g.fillRect(BOARD_WIDTH - BORDER_SIZE - SQUARE_SIZE, BOARD_HEIGHT - BORDER_SIZE - SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);

        // Desenha os círculos no centro do tabuleiro
        g.setColor(Color.red);
        g.fillOval(BOARD_WIDTH / 2 - CIRCLE_SIZE / 2, BOARD_HEIGHT / 2 - CIRCLE_SIZE / 2, CIRCLE_SIZE, CIRCLE_SIZE);
        g.setColor(Color.blue);
        g.fillOval(BOARD_WIDTH / 2 - CIRCLE_SIZE / 2, BORDER_SIZE * 2 + SQUARE_SIZE - CIRCLE_SIZE / 2, CIRCLE_SIZE, CIRCLE_SIZE);
        g.setColor(Color.yellow);
        g.fillOval(BORDER_SIZE * 2 + SQUARE_SIZE - CIRCLE_SIZE / 2, BOARD_HEIGHT / 2 - CIRCLE_SIZE / 2, CIRCLE_SIZE, CIRCLE_SIZE);
        g.setColor(Color.green);
        g.fillOval(BOARD_WIDTH / 2 - CIRCLE_SIZE / 2, BOARD_HEIGHT - BORDER_SIZE * 2 - SQUARE_SIZE - CIRCLE_SIZE / 2, CIRCLE_SIZE, CIRCLE_SIZE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ludo Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(BOARD_WIDTH, BOARD_HEIGHT);
        frame.add(new LudoBoard());
        frame.setVisible(true);
    }
}