package RPS_game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {

    JButton rockButton, paperButton, scissorButton;

    GameFrame() {


        //creating the objects of buttons
        rockButton = new JButton();
        paperButton = new JButton();
        scissorButton = new JButton();


        // styling buttons
        setButtonStyles(rockButton, "Rock", 5, 250);
        setButtonStyles(paperButton, "Paper",168,250);
        setButtonStyles(scissorButton, "Scissor", 330,250);


        JLabel label = new JLabel();
        label.setText("ROCK PAPER SCISSOR");
        label.setFont(new Font("San serif", Font.BOLD,30));
        label.setForeground(Color.black);
        label.setVisible(true);
        label.setLayout(null);
        label.setForeground(Color.white);
        label.setBounds(60,0,500, 50);



        JPanel heading = new JPanel();
        JPanel buttonsLabel = new JPanel();



        /*styling Heading*/
        heading.setVisible(true);
        heading.setLayout(null);
        heading.setBounds(0,0,500,100);
        heading.setOpaque(false);



        // styling buttonsLabel

        buttonsLabel.setVisible(true);
        buttonsLabel.setLayout(null);
        buttonsLabel.setBounds(0, 100, 500, 300);
        buttonsLabel.setOpaque(false);





        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x112B3C));


        //adding into panel
        heading.add(label);
        buttonsLabel.add(rockButton);
        buttonsLabel.add(paperButton);
        buttonsLabel.add(scissorButton);


        // adding into the frame
        this.add(heading);
        this.add(buttonsLabel);

    }


    public void setButtonStyles(JButton button, String buttonName, int xDimension, int yDimension) {

        button.setVisible(true);
        button.setLayout(null);
        button.setBounds(xDimension,yDimension,150,50);
        button.setBackground(new Color(0xF66B0E));
        button.setText(buttonName);
        button.setFocusPainted(false);
        button.addActionListener(this);
        button.setForeground(Color.white);
        button.setFont(new Font("Verdana", Font.BOLD, 18));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rockButton)
            System.out.println(((Player.winCheck(1) == 1) ? "Rock Win" : "bot win"));

        else if (e.getSource() == paperButton)
            System.out.println(((Player.winCheck(2) == 1) ? "Paper Win" : "bot win"));

        else if (e.getSource() == scissorButton)
            System.out.println(((Player.winCheck(3) == 1) ? "Scissor Win" : "bot win"));
        else
            System.out.println("Something wrong pressed");
    }
}
