fun main() {
    print( "Digite um valor: " )
    val a = readLine()
    var b = 0
    if ( a != null && a != " "  )
        b = a.toInt()

    while ( b < 10 ) {
        print( "" + b + "")
        print( "$b "  )
        b++
    }


}