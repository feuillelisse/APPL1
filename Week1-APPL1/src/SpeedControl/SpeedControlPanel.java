/**
 *
 * @author Nisa Shadrina
 */

package SpeedControl;

// ****************************************************************** 
// SpeedControlPanel.java 
// 
// The panel for the bouncing ball. Similar to 
// ReboundPanel.java in Listing 8.16 in the text, except a circle 
// rather than a happy face is rebounding off the edges of the 
// window. 
// ****************************************************************** 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 

public class SpeedControlPanel extends JPanel{
    private final int WIDTH = 600; 
    private final int HEIGHT = 400; 
    private final int BALL_SIZE = 50; 

    private Circle bouncingBall; // the object that moves 
    private Timer timer; 
    private int moveX, moveY; // increment to move each time 
    private JPanel slidePanel;
    private JSlider slideSlider;
    private JLabel slideLabel;

    // --------------------------------------------- 
    // Sets up the panel, including the timer 
    // for the animation 
    // --------------------------------------------- 
    public SpeedControlPanel (){
        timer = new Timer(30, new ReboundListener()); 

        this.setLayout(new BorderLayout()); 
        bouncingBall = new Circle(BALL_SIZE); 
        moveX = moveY = 5;
        
        // Set up a slider object here
        slideSlider = new JSlider(JSlider.HORIZONTAL, 0, 200, 30);
        slideSlider.setMajorTickSpacing(40);
        slideSlider.setMinorTickSpacing(10);
        slideSlider.setPaintTicks(true);
        slideSlider.setPaintLabels(true);
        slideSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        slideLabel = new JLabel("Timer Delay");
        slideLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        slidePanel = new JPanel();
        slidePanel.add(slideLabel);
        slidePanel.add(slideSlider);
        this.add(slidePanel, "South");
        
        setPreferredSize(new Dimension (WIDTH, HEIGHT)); 
        setBackground(Color.black); 
        timer.start(); 
    } 
    // -------------------- 
    // Draw the ball 
    // -------------------- 
    @Override
    public void paintComponent(Graphics page){
        super.paintComponent(page); 
        bouncingBall.draw(page); 
    } 
    // *************************************************** 
    // An action listener for the timer 
    // *************************************************** 
    public class ReboundListener implements ActionListener{ 
        // ---------------------------------------------------- 
        // actionPerformed is called by the timer -- it updates 
        // the position of the bouncing ball 
        // ---------------------------------------------------- 
        @Override
        public void actionPerformed(ActionEvent action){
            int slidePanelHt = slidePanel.getSize().height;
            bouncingBall.move(moveX, moveY); 

            // change direction if ball hits a side 
            int x = bouncingBall.getX(); 
            int y = bouncingBall.getY(); 
            if (x < 0 || x >= WIDTH - BALL_SIZE) 
                moveX = moveX * -1; 

            if (y <= 0 || y >= (HEIGHT - slidePanelHt) - BALL_SIZE) 
                moveY = moveY * -1; 
                repaint(); 
        } 
    } 

    // ***************************************************** 
    // A change listener for the slider. 
    // ***************************************************** 
    private class SlideListener implements ChangeListener{
        // ------------------------------------------------- 
        // Called when the state of the slider has changed; 
        // resets the delay on the timer. 
        // ------------------------------------------------- 
        @Override
        public void stateChanged (ChangeEvent event){ 
            timer.setDelay(slideSlider.getValue());
        } 
    } 
} 
