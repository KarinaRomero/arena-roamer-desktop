package com.theinvader360.arenaroamer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by KarinaRomero on 23/04/2016.
 */
public class Servidor implements Runnable {

    ServerSocket server;
    Socket socket;
    int puerto = 5000;
    DataOutputStream salida;
    BufferedReader entrada;
    public static float kari=0f;
    public static int dir=0;
    @Override
    public void run() {
        try {

            server = new ServerSocket(puerto);
            socket = new Socket();

            while (true) {
                socket = server.accept();

                entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                float mensaje = Float.parseFloat(entrada.readLine());
                kari=mensaje;
                dir=Integer.parseInt(entrada.readLine());
                System.out.println(dir);

                socket.close();
            }

        } catch (Exception e) {
        }
    }
}
