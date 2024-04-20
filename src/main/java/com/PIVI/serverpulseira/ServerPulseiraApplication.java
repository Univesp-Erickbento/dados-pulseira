package com.PIVI.serverpulseira;

//import com.PIVI.serverpulseira.clienteServer.ClientHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.*;

@SpringBootApplication
public class ServerPulseiraApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerPulseiraApplication.class, args);
	}
//		int port = 5000; // Porta do servidor
//
//		try {
//			ServerSocket serverSocket = new ServerSocket(port);
//			System.out.println("Servidor iniciado. Aguardando conexões...");
//
//			while (true) {
//				Socket clientSocket = serverSocket.accept();
//				System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
//
//				// Cria uma nova thread para lidar com o cliente
//				ClientHandler clientHandler = new ClientHandler(clientSocket);
//				Thread thread = new Thread(clientHandler);
//				thread.start();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

