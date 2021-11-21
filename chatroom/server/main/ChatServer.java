package main;
import common.Message;
import common.MessageType;
import common.user;
import server.ManageServerConnectClientThread;
import server.ServerConnectClientThread;


import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class ChatServer {
    ServerSocket serverSocket;
    //simulate the user's database
    private static ConcurrentHashMap<String,user> userMap = new ConcurrentHashMap<>();

    static {
        userMap.put("David", new user("David", "123"));
        userMap.put("lei", new user("lei", "123"));
        userMap.put("gang", new user("gang", "123"));
    }

    public static void main(String[] args) {
        new ChatServer();
    }

    public ChatServer(){
        try {
            System.out.println("在9999端口监听……");
            serverSocket = new ServerSocket(9999);
            while (true)
            {
                Socket socket = serverSocket.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                user userr = (user)ois.readObject();
                //构建一个Message对象，准备回复
                Message message = new Message();
                //验证账号密码是否正确
                if(isUser(userr.getUserId(),userr.getPasswd())){
                    message.setMessageType(MessageType.MESSAGE_LOGIN_SUCCESS);
                    oos.writeObject(message);
                    ServerConnectClientThread thread = new ServerConnectClientThread(socket, userr.getUserId());
                    thread.start();
                    ManageServerConnectClientThread.addThread(userr.getUserId(), thread);
                    ManageServerConnectClientThread.sendOffLineMessage(userr.getUserId(), oos);


                }else{
                    message.setMessageType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static ConcurrentHashMap<String, user> getUserMap() {
        return userMap;
    }

    public boolean isUser(String userId, String pw)
    {
        user userr = userMap.get(userId);
        //没有这个用户
        if(userr == null)
        {
            return false;
        }
        //密码不正确
        if(!userr.getPasswd().equals(pw))
        {
            return false;
        }

        return true;
    }

    public static boolean isUser(String userId)
    {
        user userr = userMap.get(userId);

        if(userr == null)
        {
            return false;
        }

        return true;
    }

}
