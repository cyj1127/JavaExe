package gptOmok1;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.*;

class OmokClient extends JFrame {

    //서버 통신 Ip, port
    String server = "127.0.0.1";
    int serverPort = 99999;

    //
    private Socket socket;
    private PrintWriter writer;
    private BufferedReader reader;
    private clientInfo CI;



    //화면

    private ImageIcon img = new ImageIcon("images//empty.png");
    private ImageIcon white = new ImageIcon("images//white.png");
    private ImageIcon black = new ImageIcon("images//black.png");
    private ImageIcon turn = black;


    GoEgg[][] goEgg = new GoEgg[26][];



    //main
    public static void main(String[] args) {
       new OmokClient();
    }

    //생성자
    public OmokClient() {
//		
		init(); //초기화 메서
		setVisible(true);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
//                sendExitMsg();
//                disconnectServer(); // 서버와의 연결 끊기
            }
        });
    }


    // 서버에서 상대방  받기위한 스레드
    public class clientInfo extends Thread {
        private Socket socket;
        private BufferedReader reader;
        public int[][] goEgg;

        public clientInfo(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);

//                while ((acceptchat = reader.readLine()) != null) {
//                    chatreset(acceptchat);
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //화면 생성
    private void init() {

        setTitle("===오목 게임===");
        //윈도우 창 종료시 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(26, 26));

       ActionListener goAction =  new myActionListener();
        for (int i = 0; i < 26; i++) {
            goEgg[i] = new GoEgg[26];
            for (int j = 0; j < 26; j++) {
                goEgg[i][j] = new GoEgg(i, j, img);
                c.add(goEgg[i][j]);
                goEgg[i][j].addActionListener(goAction);
                goEgg[i][j].setBorderPainted(false);
            }
        }

        setSize(1000, 1000);
        setVisible(true);

    }

    //게임 이벤트 처리
        class myActionListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                GoEgg wi = (GoEgg) e.getSource();
                if (turn == white) {
                    wi.setIcon(white);
                    wi.state = "W";
                    turn = black;

                } else {
                    wi.setIcon(black);
                    wi.state = "B";
                    turn = white;
                }
                checkWin(wi);
                wi.removeActionListener(this);
            }

            public void checkWin(GoEgg e) {
                //오목 조건 체크
                int checkx = e.x;
                int checky = e.y;
                int count = 0;
                //세로 방향 체크
                while (checky >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
                    checky -= 1;
                }
                checky += 1;
                while (checky < 26 && goEgg[checkx][checky].state.equals(e.state)) {
                    checky += 1;
                    count++;
                }
                if (count == 5) {
                    if (e.state.equals("B")) {
                        JOptionPane.showMessageDialog(null, "흑돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "백돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    }

                }
                /////////////////////////////////
                checkx = e.x;
                checky = e.y;
                count = 0;

                //가로 방향 체크
                while (checkx >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
                    checkx -= 1;
                }
                checkx += 1;
                while (checkx < 26 && goEgg[checkx][checky].state.equals(e.state)) {
                    checkx += 1;
                    count++;
                }
                if (count == 5) {
                    if (e.state.equals("B")) {
                        JOptionPane.showMessageDialog(null, "흑돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "백돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                ////////////////////
                checkx = e.x;
                checky = e.y;
                count = 0;

                //↖방향 체크
                while (checkx >= 0 && checky >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
                    checkx -= 1;
                    checky -= 1;
                }
                checkx += 1;
                checky += 1;
                while (checkx < 26 && checky < 26 && goEgg[checkx][checky].state.equals(e.state)) {
                    checkx += 1;
                    checky += 1;
                    count++;
                }
                if (count == 5) {
                    if (e.state.equals("B")) {
                        JOptionPane.showMessageDialog(null, "흑돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "백돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                //		//////////////////
                checkx = e.x;
                checky = e.y;
                count = 0;

                //↗↙방향 체크
                while (checkx >= 0 && checky < 26 && goEgg[checkx][checky].state.equals(e.state)) {
                    checkx -= 1;
                    checky += 1;
                }
                checkx += 1;
                checky -= 1;
                while (checkx < 26 && checky >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
                    checkx += 1;
                    checky -= 1;
                    count++;
                }

                if (count == 5) {
                    if (e.state.equals("B")) {
                        JOptionPane.showMessageDialog(null, "흑돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "백돌이 승리했습니다.", "게임종료", JOptionPane.QUESTION_MESSAGE);
                    }
                }


            }

            // 서버연결메소드
            // 접속 시 서버 연결 메서드.
            private void connectServer() {
                try {
                    socket = new Socket(server, serverPort);
                    CI = new OmokClient.clientInfo(socket);
                    CI.start();
                } catch (Exception e) {
                    System.out.println(server + ": 서버 연결 실패");
                }
            }




            // 서버에서 메세지 받기위한 스레드
            public class clientInfo extends Thread {
                private Socket socket;
                private BufferedReader reader;
                public String clientId;
                public String gamename;

                public clientInfo(Socket socket) {
                    this.socket = socket;
                }

                @Override
                public void run() {
                    try {
                        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        writer = new PrintWriter(socket.getOutputStream(), true);

//                        while ((acceptchat = reader.readLine()) != null) {
//                            chatreset(acceptchat);
//                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


                private void sendExitMsg() {
                    try {
                        writer = new PrintWriter(socket.getOutputStream(), true);
                        writer.println("EXIT&퇴장");
                        writer.flush();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }






            }
        }
    }

class GoEgg extends JButton {
    int x;
    int y;
    String state;

    public GoEgg(int x, int y, ImageIcon image) {
        super(image);
        this.x = x;
        this.y = y;
        state = "N";
    }

}