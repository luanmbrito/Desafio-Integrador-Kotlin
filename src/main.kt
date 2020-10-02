import java.lang.Exception

fun main(){

    var digitalHouse = DigitalHouseManager()

    try {
        digitalHouse.registrarCurso("Desenvolvimento Mobile Iphone",2,35)
        digitalHouse.registrarProfessorAdjunto("Joao","Neves",2,87)
        digitalHouse.registrarProfessorTitular("Carlos","Silva",2,"Iphone")
        digitalHouse.registrarAluno("Maria","Silva",3)
        digitalHouse.matricularAluno(3,2)
        digitalHouse.alocarProfessores(2,2,2)

    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }

    try {
        digitalHouse.excluirCurso(1)
        digitalHouse.excluirProfessorAdjunto(1)
        digitalHouse.excluirProfessorTitular(1)
    } catch (ex: Exception){
        println("Houve um problema ao excluir - erro $ex")
    }



}













