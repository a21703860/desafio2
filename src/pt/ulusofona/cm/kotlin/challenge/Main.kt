package pt.ulusofona.cm.kotlin.challenge
fun impar(a: MutableList<Int>): MutableList<Int> {
    val list = mutableListOf<Int>();
    for(i in a){
        if(i%2!=0){
            list.add(i)
        }
    }
    return list
}
fun cumprimentar(nome: String?) {
    if(nome==null){
        println( "Ola Anonimo tudo bem?")
    }else{
        println( "Ola "+ nome+ " tudo bem?")
    }

}
fun cumprimentararray(nome: MutableList<String?>) {
    for(i in nome){
        cumprimentar(i)
    }
}
fun cumprimentaIndex(nome: MutableList<String?>) {
    for ((i, v) in nome.withIndex()){
        if (v != null) {
            if(v.length>4) {
                if (i == null) {
                    println("$i: Ola Anonimo tudo bem?")
                } else {
                    println("$i: Ola $v tudo bem?")
                }
            }
        }
    }


}
fun main(args: Array<String>) {
//        val listanumeros = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//        val listanomes = mutableListOf("Afonso",null,"GUI","Vasco","Bia",null);
//    println(listanumeros);
//        println(impar(listanumeros))
//        println(cumprimentar("Afonso"))
//        println(cumprimentararray(listanomes))
//        println(cumprimentaIndex(listanomes))
    var animal: Lobo = Lobo("ola","oal")
    animal.getsom()


}




