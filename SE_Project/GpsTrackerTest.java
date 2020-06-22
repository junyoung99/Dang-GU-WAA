package org.mobileProgramming.maintermproject;
import junit.framework.TestCase;

public class GpsTrackerTest extends TestCase {
    GpsTracker test1 = new GpsTracker();
    public void testOkayLatitude() {
        assertEquals(true, test1.OkayLatitude(35));
    }   //위도가 한국 위도 범위안
    public void testOkayLongitude() {
        assertEquals(true, test1.OkayLongitude(130));
    } // 경도가 한국 경도 범위안
}






