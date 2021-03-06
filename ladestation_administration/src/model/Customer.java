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
public class Customer
{
    private String uID;
    private String firstName;
    private String lastName;
    private double balance; 
    private double creditLimit;
    private String email;   
    private String tlf;
    
    private String password = "1234";
    //private String tempPassword; // Nice to have

    /**
     *
     * @param uID
     * @param firstName
     * @param lastName
     * @param balance
     * @param creditLimit
     * @param email
     * @param tlf
     * @param password
     */
    public Customer(String uID, String firstName, String lastName, double balance, double creditLimit, String email, String tlf, String password)
    {
        this.uID = uID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.email = email;
        this.tlf = tlf;
        this.password = password;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Get the value of uID
     *
     * @return the value of uID
     */
    public String getUID()
    {
        return uID;
    }

    /**
     * Set the value of uID
     *
     * @param uID new value of uID
     */
    public void setUID(String uID)
    {
        this.uID = uID;
    }

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }    
    
    /**
     * Set the value of balance
     *
     * @param balance new value of firstName
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    /**
     *
     * @return
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     *
     * @param creditLimit
     */
    public void setCreditLimit(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    
    /**
     *
     * @return
     */
    public double getCreditLimit()
    {
        return creditLimit;
    }

    /**
     *
     * @param tlf
     */
    public void setTlf(String tlf)
    {
        this.tlf = tlf;
    }
    
    /**
     *
     * @return
     */
    public String getTlf()
    {
        return tlf;
    }
    
    /**
     *
     * @param password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     *
     * @return
     */
    public String getPassword()
    {
        return password;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Customer other = (Customer) obj;
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName))
        {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName))
        {
            return false;
        }
        if ((this.uID == null) ? (other.uID != null) : !this.uID.equals(other.uID))
        {
            return false;
        }
        if ((this.balance == 0) ? (other.balance != 0) : !(this.balance == other.balance))
        {
            return false;
        }
        if ((this.creditLimit == 0) ? (other.creditLimit != 0) : !(this.creditLimit == other.creditLimit))
        {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email))
        {
            return false;
        }
        if ((this.tlf == null) ? (other.tlf != null) : !this.tlf.equals(other.tlf))
        {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password))
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 59 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 59 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 59 * hash + (this.uID != null ? this.uID.hashCode() : 0);
        hash = 59 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 59 * hash + (this.tlf != null ? this.tlf.hashCode() : 0);
        hash = 59 * hash + (this.password != null ? this.password.hashCode() : 0);
        return hash;
    }
}
