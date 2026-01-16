package TraitsValueClassAndUniversalTraits12


//Written by xyz developer and open sourced
//Whenever you extend the Car04, you should also extend the FourWheeler04 and Vehicle04
abstract class Vehicale04 {

}

trait FourWheeler04 {

}

trait Car04 { // If you extend the Car04 then make sure to extend the Vehicle04 and FourWheeler04
  this: FourWheeler04 with Vehicale04 =>
  {
  }
}

class Mercedes extends Vehicale04 with Car04 with FourWheeler04 {

}

object Trait04 {

}
