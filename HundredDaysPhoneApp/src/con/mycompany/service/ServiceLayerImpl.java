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
public class ServiceLayerImpl implements ServiceLayer{

    @Override
    public Reservation makeReservation(int memberId, LocalDate reservationDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reservation> getAvailableReservations(LocalDate requestedDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
