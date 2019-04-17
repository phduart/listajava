package br.com.pauloduarte.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public void enviarNew(String nome, String emailDestinado, double valorplano, int vencimentofat)
	{
		try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("contatotesteapp2@gmail.com", "123teste"));
            email.setSSLOnConnect(true);

            email.setFrom("contatotesteapp2@gmail.com");
            email.setSubject("Confirmação de Cadastro!");
            email.setMsg("Olá " + nome + ", \nParabéns! Você foi cadastrado na nossa plataforma. \nConfirmando que seu plano é no valor de R$"
            		+ valorplano + " e o vencimento da sua fatura sempre será no dia " + vencimentofat + ". \n \nQualquer dúvida "
            				+ "entre em contato conosco \nAbraços!");
            email.addTo(emailDestinado);
            email.send();

        } catch (EmailException e) {
            e.printStackTrace();
        }
	}
	
	public void enviarDelete(String nome, String emailDestinado)
	{
		try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("ph.duartte97@gmail.com", "riquedfg99"));
            email.setSSLOnConnect(true);

            email.setFrom("ph.duartte97@gmail.com");
            email.setSubject("Confirmação de Cancelamento!");
            email.setMsg("Olá " + nome + ", \nEstamos confirmando o cancelamento da sua assinatura em nossa plataforma \nSentimos muito a sua perda, estaremos sempre disponiveis para ajudar você! \nQualquer dúvida "
            				+ "entre em contato conosco \nAbraços!");
            email.addTo(emailDestinado);
            email.send();

        } catch (EmailException e) {
            e.printStackTrace();
        }
	}	
}
