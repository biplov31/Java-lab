public class DataTypeConvert {
  public static void main(){
    String rollNo = "5";
    Integer roll = Integer.parseInt(rollNo);
    Float f = Float.parseFloat(rollNo);
    String s = String.valueOf(roll);
  }
}

// primitve data types are not objects. we can still tun a progarm without those
// default values of abstract data types is null
/**
 * class Hello{
 *    main(){
 *      sout('hello')
 *    }
 * }
 */
