/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package con.mycompany.service;

import com.mycompany.model.Reservation;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author n0211301
 */
public interface ServiceLayer {
    public Reservation makeReservation(int memberId, LocalDate reservationDate);
    public ArrayList<Reservation> getAvailableReservations(LocalDate requestedDate);
}
