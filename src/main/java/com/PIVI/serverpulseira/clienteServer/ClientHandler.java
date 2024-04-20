//package com.PIVI.serverpulseira.clienteServer;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//
//public class ClientHandler implements Runnable {
//    private Socket clientSocket;
//
//    public ClientHandler(Socket socket) {
//        this.clientSocket = socket;
//    }
//
//    @Override
//    public void run() {
//        try {
//            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
//            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
//
//            String receivedMessage;
//            while (true) {
//                receivedMessage = in.readUTF();
//                if (receivedMessage.equalsIgnoreCase("exit")) {
//                    break;
//                }
//                System.out.println("Mensagem recebida do cliente: " + receivedMessage);
//
//                // Responda ao cliente (você pode personalizar essa parte)
//                out.writeUTF("Servidor recebeu: " + receivedMessage);
//                out.flush();
//            }
//
//            // Feche as conexões
//            in.close();
//            out.close();
//            clientSocket.close();
//            System.out.println("Cliente desconectado.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}