import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    JFrame f;
    JButton b;

    JTextArea area;
    JLabel l1, l2, l3;

    Counter counter;
    public Frame() {

        counter = new Counter();
        f = new JFrame();
        b = new JButton("Check Input");
        b.setBounds(250, 100, 110, 40);

        area = new JTextArea("");
        area.setBounds(10, 30, 200, 200);

        l1 = new JLabel("Characters: ");
        l1.setBounds(50, 300, 100, 30);

        l2 = new JLabel("Words: ");
        l2.setBounds(50, 340, 100, 30);

        l3 = new JLabel("Paragraph: ");
        l3.setBounds(50, 380, 100, 30);

        f.add(area);
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(l3);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter.setInput(area.getText());
                l1.setText("Characters: " + counter.countCharacters());
                l2.setText("Words: " + counter.countWords());
                l3.setText("Paragraph: " + counter.countParagraphs());
            }
        });
    }



}
