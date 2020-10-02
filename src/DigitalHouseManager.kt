import java.time.LocalDateTime

class DigitalHouseManager {
    var listaAluno = mutableListOf<Aluno>()
    var listaProfessorTitular = mutableListOf<ProfessorTitular>()
    var listaProfessorAdjunto = mutableListOf<ProfessorAdjunto>()
    var listaCurso = mutableListOf<Curso>()
    var listaMatricula = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {

        var curso = Curso()
        curso.nomeCurso = nome
        curso.codigoCurso = codigoCurso
        curso.qtdeMaxAluno = quantidadeMaximaDeAlunos
        listaCurso.add(curso)


    }


    fun excluirCurso(codigoCurso: Int) {
        listaCurso.forEach {
            if (it.codigoCurso == codigoCurso) {
                listaCurso.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        var professorAdjunto = ProfessorAdjunto()
        professorAdjunto.nome = nome
        professorAdjunto.sobrenome = sobrenome
        professorAdjunto.codigoProfessor = codigoProfessor
        professorAdjunto.qtdeHoraMentoria = quantidadeDeHoras
        listaProfessorAdjunto.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        var professorTitular = ProfessorTitular()
        professorTitular.nome = nome
        professorTitular.sobrenome = sobrenome
        professorTitular.codigoProfessor = codigoProfessor
        professorTitular.especialidade = especialidade
        listaProfessorTitular.add(professorTitular)
    }

    fun excluirProfessorAdjunto(codigoProfessor: Int) {
        listaProfessorAdjunto.forEach {
            if (it.codigoProfessor == codigoProfessor) {
                listaProfessorAdjunto.remove(it)
            }
        }
    }

    fun excluirProfessorTitular(codigoProfessor: Int) {
        listaProfessorTitular.forEach {
            if (it.codigoProfessor == codigoProfessor) {
                listaProfessorTitular.remove(it)
            }
        }
    }


    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno()
        aluno.nome = nome
        aluno.sobrenome = sobrenome
        aluno.codigoAluno = codigoAluno
        listaAluno.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var (aluno) = listaAluno.filter { it.codigoAluno == codigoAluno }

        var (curso) = listaCurso.filter{it.codigoCurso == codigoCurso}




        if (curso.adicionarUmAluno(aluno)) {
            var matricula = Matricula(aluno, curso, LocalDateTime.now())
            listaMatricula.add(matricula)

            println("Matricula Realizado com sucesso")
        } else {
            println("Não foi possivel realizar a matricula pois não há vagas")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var (professorTitular) = listaProfessorTitular.filter { it.codigoProfessor == codigoProfessorAdjunto }
        var (professorAdjunto) = listaProfessorAdjunto.filter { it.codigoProfessor == codigoProfessorTitular }
        var (curso) = listaCurso.filter { it.codigoCurso == codigoCurso }

        curso.professorAdjunto = professorAdjunto
        curso.professorTitular = professorTitular

    }


}