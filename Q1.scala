object Q1 extends App {
    val obj = new Rational(3,7)
    println(obj.neg)
}

class Rational(n:Int, d:Int) {
    require(d != 0, "denominator must be non-zero") // validate input parameters
    def numer = n// numerator and denominator are methods inside rational class
    def denom = d

    def neg = new Rational(-this.numer, this.denom)//generate negative rational
    override def toString(): String = numer + "/" + denom
}