/*carcharger
 * 
 * Billing system for charging electric cars.
 * 
 * 2014 DTU
 */
package model;

/**
 *
 * @author Thim
 */
public class Price
{
    double price = 0.42;
    
    /**
     *
     * @param price
     */
    public Price(double price)
    {
        this.price = price;
    }
    /**
     *
     * @return
     */
    public double getPrice()
    {
        return price;
    }

    /**
     *
     * @param newPrice
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
}
