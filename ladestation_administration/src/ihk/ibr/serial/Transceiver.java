/*carcharger
 * 
 * Billing system for charging electric cars.
 * 
 * 2014 DTU
 */
package ihk.ibr.serial;
import chargingserver.ChargingServer;
import java.util.*;

/**
 * Simple serial transceiver using the SerialFrame class. Transmits a stop
 * string terminated text string on port specified in the constructor using the
 * transmit method. Receives a text string on port specified in the constructor
 * when a FrameEvent is generated by the SerialFrame object.
 *
 * @author Ole Christensen
 * @version 2-7-2004 adapted 06/03/12 ibr
 */
public class Transceiver implements FrameEventListener
{
    private SerialFrame serialFrame;
    private String receivedData = "";
    ChargingServer server;

    public Transceiver(String port, ChargingServer server) throws TooManyListenersException
    {
        openPort(port);
        this.server = server;
    }

    /**
     * Transmits the specified string via the serial port specified in the
     * constructor.
     *
     * @param dataString String - Data to be transmitted.
     */
    public void transmit(String dataString)
    {
        serialFrame.sendFrame(dataString);
    }

    /**
     * Opens the specified serial port for data transmission.
     *
     * @param port String - The serial port eg. "COM4".
     * @throws TooManyListenersException
     */
    private void openPort(String port) throws TooManyListenersException
    {
        if (serialFrame == null)
        {
            serialFrame = new SerialFrame(port);
            serialFrame.addFrameEventListener(this);
        }
    }

    /**
     * Closes the serial port.
     */
    public void closePort()
    {
        if (serialFrame != null)
        {
            serialFrame.closePort();
            serialFrame = null;
        }
    }

    /**
     * The method called by the SerialFrame object when a SerialEvent is
     * generated.
     *
     * @param be FrameEvent - The related event created by the SerialFrame
     * object encapsulating the event information.
     */
    public void frameReady(FrameEvent be)
    {
        receivedData = be.getData();
        server.Datareceived();
    }

    /**
     * Returns the String received at the previously opened serial port.
     *
     * @return String - The data received at the serial port.
     */
    public String getReceivedData()
    {
        //System.out.print(receivedData);
        return receivedData;
    }
}
