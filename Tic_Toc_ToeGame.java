import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;


public class Tic_Toc_ToeGame extends Panel implements ActionListener{
    char whoTurn = '0'; //人—O,计算机--X
    Button b[] = new Button[9];//none buttons
    StringBuffer chess = new StringBuffer("KKKKKKKKK");//将九宫格用一位数组来表示,用K字符表示空位置

    public Tic_Toc_ToeGame()
    {
        setLayout(new GridLayout(3,3,3,3));
        for (int i = 0; i < 9; i++)
        {
            b[i] = new Button("");
            add(b[i]);
            b[i].setActionCommand(String.valueOf(i));
            b[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button me = (Button) (e.getSource());//myself
        if (!me.getLabel().equals(""))//not allow to put the chess to the non blank
        {
            return;
        }
        me.setLabel("" + whoTurn);////标记下棋
        int row = Integer.parseInt(me.getActionCommand());//求位置
        chess.setCharAt(row,whoTurn);//记录下棋
        gameover();//判断游戏是否结束
        whoTurn = (whoTurn == '0')? 'x' : '0';//轮换玩家
        computertake();//计算机下棋
    }

    public int findplace()
    {
        for (int i = 0; i < 9; i++)
        {
            if (chess.charAt(i) == 'K')//找个空位置
            {
                chess.setCharAt(i,whoTurn);//先填上棋子
                if (isWin(whoTurn))//看自己下此位置是否能赢
                {
                    chess.setCharAt(i, 'K');// 恢复原状
                    return i;
                }
                else {
                    chess.setCharAt(i, 'K');// 恢复原状
                }
            }
        }

        char whoTurn2 = (whoTurn == '0')? 'x' : '0';
        for (int r = 0; r < 9; r++)
        {
            if (chess.charAt(r)=='K') {
                chess.setCharAt(r,whoTurn2);   //在空白处填上对方棋子
                if (isWin(whoTurn2)) {  //看填上棋子后能赢否
                    chess.setCharAt(r,'K');  // 恢复原状
                    return r;
                }
                else
                    chess.setCharAt(r,'K');   //恢复原状
            }
            if (chess.charAt(4)=='K') {   //优先看中央位置
                return 4;      //占据中央，返回4
            }
            else  {
                for (int d=1;d<5;d++) {   // 随机找个空位置
                    int rand= (int)(Math.random() * 9);
                    if (chess.charAt(rand)=='K')
                        return rand;
                }
            }
        }

        return -1;
    }

    public boolean isWin(char who)
    {
        String s3 = "" + who + who + who;
        String sum;
        String sum1;
        String sum2;//用来拼接一个方向的棋子标识
        for(int k=0;k<3;k++)
        {
            sum1=""+chess.charAt(k)+chess.charAt(k+3)+chess.charAt(k+6);//垂直方向
            sum2=""+chess.charAt(k*3+0)+chess.charAt(k*3+1)+chess.charAt(k*3+2);//水平方向
            if(sum1.equals(s3)||sum2.equals(s3))
            {
                return true;
            }
            else
            {
                sum1="";
                continue;
            }
        }
        sum=""+chess.charAt(0)+chess.charAt(4)+chess.charAt(8); //正对角线
        if (sum.equals(s3)) return true;
        sum=""+chess.charAt(2)+chess.charAt(4)+chess.charAt(6); //反对角线
        if (sum.equals(s3)) return true;
        return false;
    }
    public void computertake()
    {
        int x = findplace();  //根据策略找位置
        chess.setCharAt(x,whoTurn);
        b[x].setLabel(String.valueOf(whoTurn));
        gameover();
        whoTurn = (whoTurn=='0') ? 'X' : '0';
    }
    public void gameover()
    {
        if (isWin(whoTurn)) { //判是否取胜
            JOptionPane.showMessageDialog(null, whoTurn+" win!");
            System.exit(0);
        } else if (isFull()) { //判是否下满格子
            JOptionPane.showMessageDialog(null, "game is over!");
            System.exit(0);
        }

    }

    public boolean isFull() {  //判是否棋盘下满了
        return chess.toString().indexOf("K")== -1;
    }


    public static void main(String[] args) {
        Frame f = new Frame();
        f.add(new Tic_Toc_ToeGame());
        f.setSize(300,300);
        f.setVisible(true);
    }
}
