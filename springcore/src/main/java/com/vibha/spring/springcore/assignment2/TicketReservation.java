package com.vibha.spring.springcore.assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	//private int ticket_id;

	/*public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		System.out.println("Inside Setter");
		this.ticket_id = ticket_id;
	}

	@Override
	public String toString() {
		return "TicketReservation [ticket_id=" + ticket_id + "]";
	}*/

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize()");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp()");
	}

}
