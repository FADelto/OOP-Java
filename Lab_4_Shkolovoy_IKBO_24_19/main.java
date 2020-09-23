import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Football extends JFrame
{
    JButton RMbutton = new JButton("Real Madrid");
    JButton ACMbutton = new JButton("AC Milan");
    JLabel result = new JLabel();
    JLabel Lscorer = new JLabel();
    JLabel winner = new JLabel();
    int RM = 0;
    int ACM = 0;
    public Football()
    {
        super("Football");
        setSize(250,120);
        setLayout(new GridLayout(3,4));
        add(RMbutton,BorderLayout.NORTH);
        add(ACMbutton,BorderLayout.NORTH);
        setLayout(new FlowLayout());
        add(result);
        add(Lscorer);
        add(winner);
        result.setText("Result: 0 X 0");
        Lscorer.setText("Last Scorer: N/A");
        winner.setText("Winner: DRAW");
        RMbutton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {   
                RM += 1;
                result.setText("Result: "+ RM + " X " + ACM);
                Lscorer.setText("Last Scorer: Real Madrid");
                if (RM > ACM) {winner.setText("Winner: Real Madrid");}
                else {if (RM < ACM){winner.setText("Winner: AC Milan");} else {winner.setText("Winner: DRAW");}}
            }
        });
        ACMbutton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {   
                ACM += 1;
                result.setText("Result: "+ RM + " X " + ACM);
                Lscorer.setText("Last Scorer: AC Milan");
                if (RM > ACM) {winner.setText("Winner: Real Madrid");}
                else {if (RM < ACM){winner.setText("Winner: AC Milan");} else {winner.setText("Winner: DRAW");}}
            }
        });
    }
    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}