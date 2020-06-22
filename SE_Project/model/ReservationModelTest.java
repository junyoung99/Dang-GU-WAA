package org.mobileProgramming.maintermproject.model;
import junit.framework.TestCase;

public class ReservationModelTest extends TestCase {
    ReservationModel test = new ReservationModel();
    public void testUidOkay() {
        assertEquals(true, test.uidOkay("dkstpgns", "dks", "tpgns"));
    } //myUid + destinationUid나 destinationUid+myUid가 무조건 myUiddestinationUid와 같아야함 (예약 매칭을 위해서)
}


