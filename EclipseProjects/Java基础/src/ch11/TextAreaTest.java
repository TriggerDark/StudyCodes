package ch11;

import java.awt.*;
import javax.swing.*;

public class TextAreaTest 
{
   public static void main(String[] args)
   {  
      TextAreaFrame frame = new TextAreaFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class TextAreaFrame extends JFrame
{  
   public TextAreaFrame()
   {  
      setTitle("TextAreaTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);      
      textArea = new JTextArea(8, 40);
      textArea.setLineWrap(true);     
      scrollPane = new JScrollPane(textArea);
      add(scrollPane, BorderLayout.CENTER);
   }

   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 300;  

   private JTextArea textArea;
   private JScrollPane scrollPane;
}
