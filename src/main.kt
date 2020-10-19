import java.lang.Exception

fun main(){

    var digitalHouse = DigitalHouseManager()

    try {
        digitalHouse.registrarCurso("Desenvolvimento Mobile Iphone",2,35)
    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }
    
    try {        
        digitalHouse.registrarProfessorAdjunto("Joao","Neves",2,87)
    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }
    
    try {        
        digitalHouse.registrarProfessorTitular("Carlos","Silva",2,"Iphone")
    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }
    
    try {        
        digitalHouse.registrarAluno("Maria","Silva",3)
    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }
    
    try {        
        digitalHouse.matricularAluno(3,2)
    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }
    
    try {        
        digitalHouse.alocarProfessores(2,2,2)
    } catch (ex: Exception){
        println("Houve um problema ao cadastrar - erro $ex")
    }
    
    

    try {
        digitalHouse.excluirCurso(1)      
        
    } catch (ex: Exception){
        println("Houve um problema ao excluir - erro $ex")
    }
    
     try {
         digitalHouse.excluirProfessorAdjunto(1)
    } catch (ex: Exception){
        println("Houve um problema ao excluir - erro $ex")
    }
    
    try {
        digitalHouse.excluirProfessorTitular(1)
    } catch (ex: Exception){
        println("Houve um problema ao excluir - erro $ex")
    }
   


}

        
        
        
        













