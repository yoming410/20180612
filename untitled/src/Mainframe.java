import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame{
    private JTextField jtf = new JTextField();
    private Container cp;
    private JButton jbtnRun  = new JButton("Run");
    private  JButton jbtnExit = new JButton("Exit");
    private JLabel jlb  = new JLabel();
    private JLabel jlb1 = new JLabel();
    private  JLabel jlb2 = new JLabel();
    public Mainframe(){
        init();
    }
    private void init(){
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(2,3,1,1));
        cp.add(jtf);
        cp.add(jbtnRun);
        cp.add(jlb);
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jbtnExit);
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtnRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double v1 = Float.parseFloat(jtf.getText());
                    double v2 = v1 * 0.6;
                    jlb.setText(Double.toString(v2));
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(Mainframe.this,"Error");
                }catch(Exception e2){
                    JOptionPane.showMessageDialog(Mainframe.this,"input Error");
            }
            }
        });
    }

}