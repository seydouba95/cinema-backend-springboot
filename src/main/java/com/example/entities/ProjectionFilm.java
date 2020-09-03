package com.example.entities;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")

@Projection( name="p1",types = { com.example.entities.Projection.class })
public interface ProjectionFilm {
  public Long getId();
  public double getPrix();
  public Date getDateProjection();
  public Salle getSalle();
  public Film getFilm();
  public Seance getSeance();
  public Collection<Ticket> getTickets();

  
  
}
