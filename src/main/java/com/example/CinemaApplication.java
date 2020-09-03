package com.example;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.entities.Categorie;
import com.example.entities.Cinema;
import com.example.entities.Film;
import com.example.entities.Place;
import com.example.entities.Projection;
import com.example.entities.Salle;
import com.example.entities.Seance;
import com.example.entities.Ticket;
import com.example.entities.Ville;
import com.example.service.IcinemaInitService;

@SpringBootApplication
public class CinemaApplication  implements CommandLineRunner{
	@Autowired
	private IcinemaInitService cinemaInitService;
	@Autowired
    private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		   restConfiguration.exposeIdsFor(Film.class,Ville.class,Categorie.class,Projection.class
				   ,Place.class,Cinema.class,Salle.class,Seance.class,Ticket.class);
            cinemaInitService.initVilles();
            cinemaInitService.initCinemas();
            cinemaInitService.initSalles();
            cinemaInitService.initPlaces();
            cinemaInitService.initSeances();
            cinemaInitService.initCategories();
            cinemaInitService.initfilms();
            cinemaInitService.initProjections();
             cinemaInitService.initTickets();
            
            
	}

}
