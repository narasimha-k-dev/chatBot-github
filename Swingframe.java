
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




/**
 * InnerSwingframe
 */
  class chatBot extends JFrame {
       
    private JTextArea ca=new JTextArea();
    private JTextField cf=new JTextField();
    private JButton btn=new JButton("SEND");
    private JLabel l=new JLabel();

    //constructor

    chatBot(){
        JFrame fr=new JFrame();
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setResizable(true);
        fr.setSize(500,500);
        fr.setLocation(1,2);
        fr.getContentPane().setBackground(java.awt.Color.orange);
        fr.setTitle("CHAT BOTTT");
        
        fr.add(ca);
        ca.setSize(410,395);
        ca.setLocation(1,1);
        ca.setForeground(Color.green);
        ca.setBackground(java.awt.Color.black);

        fr.add(cf);
        cf.setSize(309,30);
        cf.setLocation(2,399);

        fr.add(btn);
        btn.setSize(100,30);
        btn.setLocation(313,399);

        btn.addActionListener(new ActionListener(){
            public void reply(String text){
          ca.append("chat Bot : "+text+"\n");
              }

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
               
                if(e.getSource()==btn){
                    String text=cf.getText().toLowerCase();
                    ca.append("you : "+text+"\n");
                    cf.setText("");

                    if(text.contains("hi"))
                        reply("yeah iam good and you ?");
                    
                    else if(text.contains("who are you"))
                        reply("iam a static chat bot");

                    else if(text.contains("Are you human? / Are you a robot?"))
                    reply("simple answer iam a chat Bot");

                    else if(text.contains("what's your name"))
                    reply("my name is talko");

                     else if(text.contains("what languages do you speak"))
                    reply("just English.");

                    else{
                 reply("Sorry! Actually i dont have knowledge that thing. because my developers have not updated me to that level. ask me any thing");
                 ca.append("chat Bot :my knowledge is only this topics \n"+"hi \n"+" who are you? \n"+"Are you human? / Are you a robot? \n"+"what's your name? \n"+"what languages do you speak? \n");
                    }
                   


                }

            }
            
        });
        

    }

}


public class Swingframe {

    public static void main(String[] args) {
        new chatBot();
    }
    

}
