/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysudokugame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout; //specifies how components are arranged.
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent; //event that occur.
import java.awt.event.ActionListener; //event listener interface.
import javax.swing.JFrame; //provides basic window features.
import javax.swing.JLabel; //displays text am images;
import javax.swing.SwingConstants; //common constant used with swing.
import javax.swing.JButton; //Component user clicks to trigger a specific action.
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
/**
 *
 * @author Fatimah
 */
        public class Sudoku extends JFrame { 
    
        JTextField[] Numbers = new JTextField[81];

        public Sudoku(){
        super("Sudoku Game.");
        setLayout(new FlowLayout()); 
        Icon pic= new ImageIcon(getClass().getResource("logo.png"));
        JOptionPane.showMessageDialog(null, "Welcome to our sudoku!","Greeting message",JOptionPane.PLAIN_MESSAGE,pic);
        JLabel label1 = new JLabel("                Choose the level of the game:                 ");
        add(label1);
        JRadioButton Easy=new JRadioButton("Easy");
        add(Easy);
        Easy.addItemListener(
        new ItemListener(){
        public void itemStateChanged(ItemEvent event){
        SNumbers();
        Easy();
        }});

        JRadioButton Medium= new JRadioButton("Medium");
        add(Medium);
        Medium.addItemListener(
        new ItemListener(){
        public void itemStateChanged(ItemEvent event){
        SNumbers();
        Medium();
        }});
        JRadioButton Hard=new JRadioButton("Hard");
        add(Hard);
        Hard.addItemListener(
        new ItemListener(){
        public void itemStateChanged(ItemEvent event){
        SNumbers();
        Hard();
        }});
        ButtonGroup group=new ButtonGroup();
        group.add(Easy);
        group.add(Medium);
        group.add(Hard);
        
        JLabel label2 = new JLabel("Fill the grid with suitable numbers:");
        add(label2); 
        getContentPane().setBackground(Color.PINK);//set BackGround.
   
        for(int i=0;i<Numbers.length;i++){
        Numbers[i]=new JTextField(2);
        add(Numbers[i]);}
        
        JPanel Grid1=new JPanel();
        Grid1.setLayout(new GridLayout(3,3));
        add(Grid1);
        for(int g1=0;g1<=8;g1++){
        Numbers[g1].setBackground(Color.LIGHT_GRAY);
        Grid1.add(Numbers[g1]);}
        
        JPanel Grid2=new JPanel();
        Grid2.setLayout(new GridLayout(3,3));
        add(Grid2);
        for(int g2=9;g2<=17;g2++){
        Numbers[g2].setBackground(Color.WHITE);
        Grid2.add(Numbers[g2]);}
        
        JPanel Grid3=new JPanel();
        Grid3.setLayout(new GridLayout(3,3));
        add(Grid3);
        for(int g3=18;g3<=26;g3++){
        Numbers[g3].setBackground(Color.LIGHT_GRAY);
        Grid3.add(Numbers[g3]);}
        
        JPanel Grid4=new JPanel();
        Grid4.setLayout(new GridLayout(3,3));
        add(Grid4);
        for(int g4=27;g4<=35;g4++){
        Numbers[g4].setBackground(Color.WHITE);
        Grid4.add(Numbers[g4]);}
        
        JPanel Grid5=new JPanel();
        Grid5.setLayout(new GridLayout(3,3));
        add(Grid5);
        for(int g5=36;g5<=44;g5++){
        Numbers[g5].setBackground(Color.LIGHT_GRAY);
        Grid5.add(Numbers[g5]);}
        
        JPanel Grid6=new JPanel();
        Grid6.setLayout(new GridLayout(3,3));
        add(Grid6);
        for(int g6=45;g6<=53;g6++){
        Numbers[g6].setBackground(Color.WHITE);
        Grid6.add(Numbers[g6]);}
        
       JPanel Grid7=new JPanel();
       Grid7.setLayout(new GridLayout(3,3));
       add(Grid7);
       for(int g7=54;g7<=62;g7++){
       Numbers[g7].setBackground(Color.LIGHT_GRAY);
       Grid7.add(Numbers[g7]);}
       
       JPanel Grid8=new JPanel();
       Grid8.setLayout(new GridLayout(3,3));
       add(Grid8);
       for(int g8=63;g8<=71;g8++){
       Numbers[g8].setBackground(Color.WHITE);
       Grid8.add(Numbers[g8]);}
       
       JPanel Grid9=new JPanel();
       Grid9.setLayout(new GridLayout(3,3));
       add(Grid9);
       for(int g9=72;g9<=80;g9++){
       Numbers[g9].setBackground(Color.LIGHT_GRAY);
       Grid9.add(Numbers[g9]);}
       
       JPanel AllGrids=new JPanel();
       AllGrids.setLayout(new GridLayout(3,3));
       AllGrids.add(Grid1);   AllGrids.add(Grid2);   AllGrids.add(Grid3);
       AllGrids.add(Grid4);   AllGrids.add(Grid5);   AllGrids.add(Grid6);
       AllGrids.add(Grid7);   AllGrids.add(Grid8);   AllGrids.add(Grid9);
       add(AllGrids);
       
       JMenu FileMenu = new JMenu("File");
       FileMenu.setMnemonic('F'); 
       
       JMenuItem help = new JMenuItem("Help...");        
       help.setMnemonic('H');
       FileMenu.add(help);
       JDesktopPane DeskTop=new JDesktopPane();
       add(DeskTop);
       help.addActionListener(
       new ActionListener(){
       public void actionPerformed(ActionEvent event){
       JInternalFrame frame=new JInternalFrame("How To Play",true,true,true,true);
       frame.getContentPane().setPreferredSize(new Dimension(300,300));
       JTabbedPane Tabs=new JTabbedPane();
       JPanel panel1=new JPanel();
       add(panel1,SwingConstants.CENTER);
       JLabel labelA=new JLabel("تـعـلـيـمـات:");
       add(labelA);
       labelA.setFont(new Font("Serif", Font.BOLD, 30));
       JTextArea Arabic=new JTextArea(9,25);
       Arabic.setText("لعبة سودوكو تلعب بواسطة شبكة تتكون من 81 خلية مقسمة بالألوان (الرصاصي والأبيض) الى تسعة شبكات صغيرة تدعى المناطق بحيث ان كل منطقة تتكون من تسع خلايا.\n" +
       " عند بداية اللعبة سوف تكون بعض خلايا الشبكة محتوية على أرقام.\n" +
       "الهدف من لعبة سودوكو هو أن نقوم بوضع الأرقام من 1 إلى 9 في الخانات الخالية (رقم واحد في كل خانة) مع مراعاة استخدام الرقم مرة واحدة في كل صف"
       + ", مرة واحدة في كل عمود ومرة واحدة في كل منطقة.");
       Arabic.setEditable(false);
       Arabic.setLineWrap(true);
       Arabic.setWrapStyleWord(false);
       Arabic.setForeground(Color.MAGENTA);
       add(Arabic);
       panel1.setBackground(Color.MAGENTA);
       Arabic.setFont(new Font("Serif", Font.PLAIN, 14));
       panel1.add(labelA);
       panel1.add(Arabic);
       Tabs.addTab("Arabic", panel1);
        
       JPanel panel2=new JPanel();
       add(panel2,SwingConstants.CENTER);
       JLabel labelE=new JLabel("Instructions:");
       add(labelE);
       labelE.setFont(new Font("Serif", Font.BOLD, 30));
       JTextArea English=new JTextArea(9,25);
       English.setText("The grid is divided by the colors(Grey and White) into nine 3 X 3 square (boxes).\n"
       +"Some of the squares already have numbers in them. Your task is to fill in the blank squares.\n There is only one rule:\n"
       +"Each row, column and box must end up containing all of the numbers from 1 to 9." 
       +"This rule has an important side-effect, which is the basis of all solving techniques:\n"
       +"Each number can only appear once in a row, column or box.");
       English.setEditable(false);
       English.setLineWrap(true);
       English.setWrapStyleWord(true);
       English.setForeground(Color.ORANGE);
       add(English,SwingConstants.CENTER);
       panel2.setBackground(Color.ORANGE);
       English.setFont(new Font("Serif", Font.PLAIN, 14));
       panel2.add(labelE);
       panel2.add(English);
       Tabs.addTab("English", panel2);
       
       JPanel panel3=new JPanel();
       add(panel3,SwingConstants.CENTER);
       JLabel labelI=new JLabel("निर्देश:");
       add(labelI);
       labelI.setFont(new Font("Serif", Font.BOLD, 30));
       JTextArea Indian=new JTextArea(9,25);
       Indian.setText("(ग्रिड वर्गों में से कुछ पहले से ही उन में नंबर नौ 3 एक्स 3 वर्ग (बक्से में रंग (ग्रे और व्हाइट) से विभाजित है। आपका काम खाली वर्गों में भरने के लिए है सिर्फ एक ही नियम है \"\n" +
       "प्रत्येक पंक्ति, कॉलम और बॉक्स 1 से 9 तक की संख्या के सभी युक्त खत्म करना होगा\n" +
       " यह नियम एक महत्वपूर्ण पक्ष प्रभाव है, जो सभी तकनीकों का आधार है है\n" +
       "प्रत्येक संख्या केवल एक पंक्ति, स्तंभ या बॉक्स में एक बार दिखाई दे सकता है");
       Indian.setEditable(false);
       Indian.setLineWrap(true);
       Indian.setWrapStyleWord(true);
       Indian.setForeground(Color.BLUE);
       add(Indian,SwingConstants.CENTER);
       panel3.setBackground(Color.BLUE);
       Indian.setFont(new Font("Serif", Font.PLAIN, 14));
       panel3.add(labelI);
       panel3.add(Indian);
       Tabs.addTab("Indian", panel3);
       
       add(Tabs);
       frame.add(Tabs);
       DeskTop.add(frame);
       add(frame, SwingConstants.CENTER);
       frame.setVisible(true); }});  
        
       JMenuItem Close = new JMenuItem("Close");
       Close.setMnemonic('C');
       FileMenu.add(Close);
       Close.addActionListener(
       new ActionListener(){
       public void actionPerformed(ActionEvent event){
       System.exit(0); }});
       
       JMenu FormatMenu = new JMenu("Format");
       FormatMenu.setMnemonic('T');
       
       JMenu BackGroundColor=new JMenu("BackGround Color");
       BackGroundColor.setMnemonic('B');
       FormatMenu.add(BackGroundColor);
        
       JRadioButtonMenuItem Red=new JRadioButtonMenuItem("Red"); 
       BackGroundColor.add(Red);
       Red.addItemListener(
       new ItemListener(){
       public void itemStateChanged(ItemEvent event){
       getContentPane().setBackground(Color.RED); }});
       
       JRadioButtonMenuItem Magenta=new JRadioButtonMenuItem("Magenta"); 
       BackGroundColor.add(Magenta);
       Magenta.addItemListener(
       new ItemListener(){
       public void itemStateChanged(ItemEvent event){
       getContentPane().setBackground(Color.MAGENTA); }});
       
       JRadioButtonMenuItem Green=new JRadioButtonMenuItem("Green"); 
       BackGroundColor.add(Green);    
       Green.addItemListener(
       new ItemListener(){
       public void itemStateChanged(ItemEvent event){
       getContentPane().setBackground(Color.GREEN); }});
       
       JRadioButtonMenuItem Blue=new JRadioButtonMenuItem("Blue"); 
       BackGroundColor.add(Blue);    
       Blue.addItemListener(
       new ItemListener(){
       public void itemStateChanged(ItemEvent event){
       getContentPane().setBackground(Color.BLUE); }});
       
       JRadioButtonMenuItem Pink=new JRadioButtonMenuItem("Pink"); 
       BackGroundColor.add(Pink);
       Pink.addItemListener(
       new ItemListener(){
       public void itemStateChanged(ItemEvent event){
       getContentPane().setBackground(Color.PINK); }});
              
       ButtonGroup colorButtonGroup=new ButtonGroup();
       colorButtonGroup.add(Red);
       colorButtonGroup.add(Magenta);
       colorButtonGroup.add(Green);
       colorButtonGroup.add(Blue);
       colorButtonGroup.add(Pink);
      
       JMenuBar bar = new JMenuBar();
       setJMenuBar(bar);
       bar.add(FileMenu);
       bar.add(FormatMenu);
        
       JButton buttonCheck = new JButton();
       buttonCheck.setText("Check");
       add(buttonCheck);
       buttonCheck.addActionListener(
       new ActionListener(){
       public void actionPerformed(ActionEvent event){
       if(Numbers[0].getText().equals("5") && Numbers[1].getText().equals("3") &&
       Numbers[2].getText().equals("4") && Numbers[3].getText().equals("6") &&
       Numbers[4].getText().equals("7") && Numbers[5].getText().equals("2") &&
       Numbers[6].getText().equals("1") && Numbers[7].getText().equals("9") &&
       Numbers[8].getText().equals("8") && Numbers[9].getText().equals("6") &&
       Numbers[10].getText().equals("7") && Numbers[11].getText().equals("8") &&
       Numbers[12].getText().equals("1") && Numbers[13].getText().equals("9") &&
       Numbers[14].getText().equals("5") && Numbers[15].getText().equals("3") &&
       Numbers[16].getText().equals("4") && Numbers[17].getText().equals("2") &&
       Numbers[18].getText().equals("9") && Numbers[19].getText().equals("1") &&
       Numbers[20].getText().equals("2") && Numbers[21].getText().equals("3") &&
       Numbers[22].getText().equals("4") && Numbers[23].getText().equals("8") &&
       Numbers[24].getText().equals("5") && Numbers[25].getText().equals("6") &&
       Numbers[26].getText().equals("7") && Numbers[27].getText().equals("8") &&
       Numbers[28].getText().equals("5") && Numbers[29].getText().equals("9") &&
       Numbers[30].getText().equals("4") && Numbers[31].getText().equals("2") &&
       Numbers[32].getText().equals("6") && Numbers[33].getText().equals("7") &&
       Numbers[34].getText().equals("1") && Numbers[35].getText().equals("3") &&
       Numbers[36].getText().equals("7") && Numbers[37].getText().equals("6") &&
       Numbers[38].getText().equals("1") && Numbers[39].getText().equals("8") &&
       Numbers[40].getText().equals("5") && Numbers[41].getText().equals("3") &&
       Numbers[42].getText().equals("9") && Numbers[43].getText().equals("2") &&
       Numbers[44].getText().equals("4") && Numbers[45].getText().equals("4") &&
       Numbers[46].getText().equals("2") && Numbers[47].getText().equals("3") &&
       Numbers[48].getText().equals("7") && Numbers[49].getText().equals("9") &&
       Numbers[50].getText().equals("1") && Numbers[51].getText().equals("8") &&
       Numbers[52].getText().equals("5") && Numbers[53].getText().equals("6") &&
       Numbers[54].getText().equals("9") && Numbers[55].getText().equals("6") &&
       Numbers[56].getText().equals("1") && Numbers[57].getText().equals("2") &&
       Numbers[58].getText().equals("8") && Numbers[59].getText().equals("7") &&
       Numbers[60].getText().equals("3") && Numbers[61].getText().equals("4") &&
       Numbers[62].getText().equals("5") && Numbers[63].getText().equals("5") &&
       Numbers[64].getText().equals("3") && Numbers[65].getText().equals("7") &&
       Numbers[66].getText().equals("4") && Numbers[67].getText().equals("1") &&
       Numbers[68].getText().equals("9") && Numbers[69].getText().equals("2") &&
       Numbers[70].getText().equals("8") && Numbers[71].getText().equals("6") &&
       Numbers[72].getText().equals("2") && Numbers[73].getText().equals("8") &&
       Numbers[74].getText().equals("4") && Numbers[75].getText().equals("6") &&
       Numbers[76].getText().equals("3") && Numbers[77].getText().equals("5") &&
       Numbers[78].getText().equals("1") && Numbers[79].getText().equals("7") &&
       Numbers[80].getText().equals("9")) {
       try{
       AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(this.getClass().getResource("Music.wav"));
       Clip clip=AudioSystem.getClip();
       clip.open(audioInputStream);
       clip.start();}
       catch(Exception exception){}
       Icon pic3= new ImageIcon(getClass().getResource("congrats.jpg"));
       JOptionPane.showMessageDialog(null, "Congratualtions ... you have win!","Winning massage!",JOptionPane.PLAIN_MESSAGE,pic3);} 
       else{
       try{    
       AudioInputStream audi=AudioSystem.getAudioInputStream(this.getClass().getResource("sad.wav"));
       Clip cl=AudioSystem.getClip();
       cl.open(audi);
       cl.start();}
       catch(Exception e){}
       Icon pic2= new ImageIcon(getClass().getResource("lose.jpg"));
       JOptionPane.showMessageDialog(null, "You Loooose!!! \n   try again","Losing massage!",JOptionPane.ERROR_MESSAGE,pic2);
       }}});
       }
        
       public void SNumbers(){
       Numbers[0].setText("5"); Numbers[0].setEditable(false);
       Numbers[1].setText("3"); Numbers[1].setEditable(false);
       Numbers[7].setText("9"); Numbers[7].setEditable(false);
       Numbers[10].setText("7"); Numbers[10].setEditable(false);
       Numbers[12].setText("1"); Numbers[12].setEditable(false);
       Numbers[25].setText("6"); Numbers[25].setEditable(false);
       Numbers[18].setText("9"); Numbers[18].setEditable(false);
       Numbers[27].setText("8"); Numbers[27].setEditable(false);
       Numbers[30].setText("4"); Numbers[30].setEditable(false);
       Numbers[33].setText("7"); Numbers[33].setEditable(false);
       Numbers[37].setText("6"); Numbers[37].setEditable(false);
       Numbers[39].setText("8"); Numbers[39].setEditable(false);
       Numbers[43].setText("2"); Numbers[43].setEditable(false);
       Numbers[47].setText("3"); Numbers[47].setEditable(false);
       Numbers[50].setText("1"); Numbers[50].setEditable(false);
       Numbers[53].setText("6"); Numbers[53].setEditable(false);
       Numbers[55].setText("6"); Numbers[55].setEditable(false);
       Numbers[66].setText("4"); Numbers[66].setEditable(false);
       Numbers[70].setText("8"); Numbers[70].setEditable(false);
       Numbers[72].setText("2"); Numbers[72].setEditable(false);
       Numbers[77].setText("5"); Numbers[77].setEditable(false);}
       
       public void Easy(){
       Numbers[4].setText("7"); Numbers[4].setEditable(false);
       Numbers[17].setText("2"); Numbers[17].setEditable(false);
       Numbers[20].setText("2"); Numbers[20].setEditable(false);
       Numbers[29].setText("9"); Numbers[29].setEditable(false);
       Numbers[32].setText("6"); Numbers[32].setEditable(false);
       Numbers[48].setText("7"); Numbers[48].setEditable(false);
       Numbers[57].setText("2"); Numbers[57].setEditable(false);
       Numbers[59].setText("7"); Numbers[59].setEditable(false);
       Numbers[60].setText("3"); Numbers[60].setEditable(false);
       Numbers[68].setText("9"); Numbers[68].setEditable(false);
       Numbers[62].setText("5"); Numbers[62].setEditable(false);
       Numbers[74].setText("4"); Numbers[74].setEditable(false);
       Numbers[75].setText("6"); Numbers[75].setEditable(false);
       Numbers[78].setText("1"); Numbers[78].setEditable(false);}
       
       public void Medium(){
       Numbers[20].setText(""); Numbers[20].setEditable(true);
       Numbers[29].setText(""); Numbers[29].setEditable(true);
       Numbers[32].setText(""); Numbers[32].setEditable(true);
       Numbers[48].setText(""); Numbers[48].setEditable(true);
       Numbers[57].setText(""); Numbers[57].setEditable(true);
       Numbers[59].setText(""); Numbers[59].setEditable(true);
       Numbers[62].setText(""); Numbers[62].setEditable(true);
       Numbers[74].setText(""); Numbers[74].setEditable(true);
       Numbers[0].setText("5"); Numbers[0].setEditable(false);
       Numbers[4].setText("7"); Numbers[4].setEditable(false);
       Numbers[17].setText("2"); Numbers[17].setEditable(false);
       Numbers[60].setText("3"); Numbers[60].setEditable(false);
       Numbers[68].setText("9"); Numbers[68].setEditable(false);
       Numbers[75].setText("6"); Numbers[75].setEditable(false);
       Numbers[78].setText("1"); Numbers[78].setEditable(false);}
       
       public void Hard(){
       Numbers[0].setText(""); Numbers[0].setEditable(true);
       Numbers[4].setText(""); Numbers[4].setEditable(true);
       Numbers[17].setText(""); Numbers[17].setEditable(true);
       Numbers[20].setText(""); Numbers[20].setEditable(true);
       Numbers[29].setText(""); Numbers[29].setEditable(true);
       Numbers[32].setText(""); Numbers[32].setEditable(true);
       Numbers[48].setText(""); Numbers[48].setEditable(true);
       Numbers[57].setText(""); Numbers[57].setEditable(true);
       Numbers[59].setText(""); Numbers[59].setEditable(true);
       Numbers[62].setText(""); Numbers[62].setEditable(true);
       Numbers[74].setText(""); Numbers[74].setEditable(true);
       Numbers[75].setText(""); Numbers[75].setEditable(true);
       Numbers[78].setText(""); Numbers[78].setEditable(true);
       Numbers[60].setText("3"); Numbers[60].setEditable(false);
       Numbers[68].setText("9"); Numbers[68].setEditable(false);}
       }
