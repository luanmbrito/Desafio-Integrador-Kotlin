import java.time.LocalDateTime

open abstract class Professor{
    var codigoProfessor: Int? = 0
    var nome: String? = ""
    var sobrenome: String? = ""
    var tempoCasa: LocalDateTime = LocalDateTime.now()
}