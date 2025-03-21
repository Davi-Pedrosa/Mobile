fun main() {
    print("Digite a matricula: ")
    val entrada = readln()
    val matricula = entrada.toInt()
    print("Digite o nome: ")
    val nome = readln()
    print("Digite o salario: ")
    entrada = readln()
    val salario = entrada.toDouble()
    print("Digite o curso: ")
    val curso = readln()

    val prof1 = Professor()
    prof1.matricula = matricula
    prof1.nome = nome
    prof1.salario = salario
    prof1.curso = curso

    println("Matricula: ${prof1.matricula}")
    println("Nome.....: ${prof1.nome}")
    println("Salario..... ${prof1.salario}")
    println("Curso..... ${prof1.curso}")

}

open class Funcionario{
    var matricula: Int = 0
        set(value) {
            if (value>0) field = value
        }
    var nome:String = ""
        set(value){
            if (value!="")field = value
        }
    var salario:Double = 0.0
        set(value) {
            if(value!=0.0) field
        }

    //Falta coisa aqui=-=-=-=-=-=-=-=-=-=
}

class Administrativo: Funcionario(){
    var departamento: String = ""
        set(value){
            if (value != "") field = value
        }
        get(){
            return if(field!= "") field else "Departamento não cadastrado!"
        }
}

class Professor: Funcionario{
    var curso: String = ""
        set(value){
            if (value!="") field = value
        }
        get() {
            return if(field != "") field else "Curso não cadastrado!"
        }
    constructor(mat:Int, nome:String, sal:Double, curso:String): super(mat,nome,sal,curso){
        this.curso = curso
    }
}