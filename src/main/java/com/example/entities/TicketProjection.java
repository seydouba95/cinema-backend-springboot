package com.example.entities;



import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;
@Projection( name="ticketProj",types = { com.example.entities.Ticket.class } )

public interface TicketProjection {
	public Long getId();
	 public String getNomClient();
	  public double getPrix();
	  public Integer getCodePaiement();
	  public boolean getReservee();
	  public Place getPlace();
}
