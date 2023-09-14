/*******************************************
/CLASS: Constructs a weapon w/Terraria class
/*****************************************/ 
class Terraria
{
   String iName;
   String type;
   String enemy;
   double drop;


//CONSTRUCTOR: Uses input to store the object's fields
   public Terraria(String iName, String type, String enemy, double drop)
   {
      this.iName = iName;
      this.type = type;
      this.enemy = enemy;
      this.drop = drop;
   }

//OVERLOADED CONSTRUCTOR: Creates the object
   public Terraria (Terraria obj)
   {
      this(obj.iName, obj.type, obj.enemy, obj.drop);
   }
}
