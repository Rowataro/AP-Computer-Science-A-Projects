public class Address
{
   public Address()
   {
       street = "Default Street";
       zip = 12345;
   }
  
   public Address(final String newStreet, final int newZip)
   {
       street = newStreet;
       zip = newZip;
   }
   
   public String toString()
   {
       return "Address Information: " +
              "\n  Street: " + street + 
              "\n  Zip: " + zip;
   }
   
   public final String getAdress() 
   {
       return street;
   }
   public void setAddress(final String newStreet, final int newZip)
   {
       street = newStreet;
       zip = newZip;
   }
   
   public final int getZip()
   {
       return zip;
   }
   public void setZip(final int newZip)
   {
       zip = newZip;
   }
   
   private String street = "";
   private int zip = 0;
}
