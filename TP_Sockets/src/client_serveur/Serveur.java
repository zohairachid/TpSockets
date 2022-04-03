package client_serveur;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException {
		
		
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("J'attend la connexion...");
		
		Socket s = ss.accept();
		System.out.println("Connexion d'un client "+s.getRemoteSocketAddress());
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		System.out.println("J'attend que le client envoie un octet");
		int nb = is.read();
		System.out.println("J'ai reçu un nombre "+nb);
		int res = nb * 5;
		System.out.println("J'envoie la réponse "+res);
		os.write(res);
		s.close();

	}

}
